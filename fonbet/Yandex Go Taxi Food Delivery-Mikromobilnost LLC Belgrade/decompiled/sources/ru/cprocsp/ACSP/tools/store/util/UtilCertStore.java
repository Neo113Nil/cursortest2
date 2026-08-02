package ru.cprocsp.ACSP.tools.store.util;

import android.content.Context;
import defpackage.izh0;
import defpackage.oyr;
import java.io.File;
import java.io.FileOutputStream;
import java.security.cert.X509Certificate;
import java.util.List;
import ru.cprocsp.ACSP.tools.common.IResult;
import ru.cprocsp.ACSP.tools.common.Result;
import ru.cprocsp.ACSP.tools.store.model.ObjectDescriptor;
import ru.cprocsp.ACSP.tools.store.model.ResultOf;
import ru.cprocsp.ACSP.tools.store.util.IUtilHelper;

/* loaded from: classes4.dex */
public class UtilCertStore {
    private static IResult createResult(Context context, ResultOf<List<ObjectDescriptor>> resultOf) {
        return new Result(resultOf.getStatus() == ResultOf.Status.SUCCESS ? 0 : 3, resultOf.getMessageID() != -1 ? context.getString(resultOf.getMessageID()) : resultOf.getError() != null ? resultOf.getError().getStatusMessage() : null);
    }

    public static IResult saveCRL(Context context, byte[] bArr) throws Exception {
        File file = new File(IUtilHelper.STORAGE_FILE_CRL);
        if (!file.exists() && !file.mkdirs()) {
            return new Result(3, String.format(context.getString(izh0.FailedToCreateStorage), file.getAbsolutePath()));
        }
        File file2 = new File(file, oyr.j((int) (Math.random() * 1000.0d), "crl-", ".crl"));
        while (file2.exists()) {
            file2 = new File(file, oyr.j((int) (Math.random() * 1000.0d), "crl-", ".crl"));
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            fileOutputStream.write(bArr);
            Result result = new Result(0, context.getString(izh0.CRLSaved));
            fileOutputStream.close();
            return result;
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static IResult saveCert(Context context, byte[] bArr, ObjectDescriptor objectDescriptor) {
        return createResult(context, UtilKeyStore.installCertificateToStore(context, objectDescriptor, bArr, false));
    }

    public static IResult saveIntermediateCert(Context context, byte[] bArr) {
        return saveCert(context, bArr, ObjectDescriptor.createCertificateDescriptor(IUtilHelper.StorageType.stIntermediate, null));
    }

    public static IResult saveRootCert(Context context, X509Certificate x509Certificate) {
        return createResult(context, UtilKeyStore.installCertificateToStore(context, ObjectDescriptor.createCertificateDescriptor(IUtilHelper.StorageType.stTrust, null), new X509Certificate[]{x509Certificate}, false));
    }

    public static IResult saveRootCert(Context context, byte[] bArr) {
        return saveCert(context, bArr, ObjectDescriptor.createCertificateDescriptor(IUtilHelper.StorageType.stTrust, null));
    }
}
