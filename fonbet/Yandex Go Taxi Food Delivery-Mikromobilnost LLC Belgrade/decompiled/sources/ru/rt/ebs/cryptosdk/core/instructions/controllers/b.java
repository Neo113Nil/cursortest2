package ru.rt.ebs.cryptosdk.core.instructions.controllers;

import defpackage.h9e;
import defpackage.jl40;
import defpackage.l4w;
import defpackage.m4w;
import defpackage.ny61;
import defpackage.p4w;
import defpackage.qwu;
import defpackage.rzo;
import defpackage.tje;
import defpackage.u3u;
import defpackage.wls;
import defpackage.x2b1;
import defpackage.xwu;
import defpackage.zcf;
import defpackage.zwu;
import defpackage.zy11;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.JCP;
import ru.rt.ebs.cryptosdk.core.instructions.entities.exceptions.InstructionsEbsException;
import ru.rt.ebs.cryptosdk.core.instructions.entities.models.InstructionsMetadata;
import ru.rt.ebs.cryptosdk.core.network.entities.models.https.request.HttpsMethod;
import ru.rt.ebs.cryptosdk.core.storage.file.IFileManager;
import ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage;

/* loaded from: classes4.dex */
public final class b extends SuspendLambda implements wls {
    public InstructionsMetadata a;
    public Object b;
    public int c;
    public final /* synthetic */ m4w d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(m4w m4wVar, Continuation continuation) {
        super(2, continuation);
        this.d = m4wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.d, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new b(this.d, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x018c, code lost:
    
        if (r7 == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0153, code lost:
    
        if (r4 == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0122, code lost:
    
        if (r3 != r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cc, code lost:
    
        if (r4 == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0084, code lost:
    
        if (r2 == r1) goto L47;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        InstructionsMetadata instructionsMetadata;
        Object k0;
        Object valueOf;
        InstructionsMetadata instructionsMetadata2;
        InstructionsMetadata instructionsMetadata3;
        Object a;
        byte[] bArr;
        Object upperCase;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                kotlin.b.b(obj);
                p4w p4wVar = this.d.a;
                this.c = 1;
                IKeyStorage iKeyStorage = p4wVar.c;
                u3u u3uVar = p4wVar.b;
                String string = iKeyStorage.getString("ebs.cryptosdk.core.instructions.metadata".concat("|InstructionsMetadata"), "");
                if (string.length() != 0) {
                    obj2 = (InstructionsMetadata) u3uVar.c(InstructionsMetadata.class, string);
                    break;
                } else {
                    obj2 = new InstructionsMetadata("", "", "");
                    break;
                }
            case 1:
                kotlin.b.b(obj);
                obj2 = obj;
                instructionsMetadata = (InstructionsMetadata) obj2;
                p4w p4wVar2 = this.d.a;
                this.a = instructionsMetadata;
                this.c = 2;
                h9e h9eVar = p4wVar2.a;
                xwu xwuVar = new xwu(HttpsMethod.GET, new zwu("api/android/v1/CheckInstructionsStatus"), new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap(), null, new ArrayList());
                qwu qwuVar = (qwu) h9eVar.b;
                k0 = tje.k0(qwuVar.g.io(), new ru.rt.ebs.cryptosdk.core.network.entities.models.https.client.a(qwuVar, xwuVar, InstructionsMetadata.class, null), this);
                break;
            case 2:
                instructionsMetadata = this.a;
                kotlin.b.b(obj);
                k0 = obj;
                InstructionsMetadata instructionsMetadata4 = (InstructionsMetadata) k0;
                p4w p4wVar3 = this.d.a;
                this.a = instructionsMetadata;
                this.b = instructionsMetadata4;
                this.c = 3;
                IFileManager iFileManager = p4wVar3.d;
                l4w l4wVar = p4wVar3.e;
                valueOf = Boolean.valueOf(x2b1.b(iFileManager, l4wVar.b, l4wVar.a, 4).exists());
                if (valueOf != coroutineSingletons) {
                    instructionsMetadata2 = instructionsMetadata;
                    instructionsMetadata3 = instructionsMetadata4;
                    boolean booleanValue = ((Boolean) valueOf).booleanValue();
                    if (jl40.l(instructionsMetadata2.getVersion(), instructionsMetadata3.getVersion()) || !booleanValue) {
                        p4w p4wVar4 = this.d.a;
                        String url = instructionsMetadata3.getUrl();
                        this.a = instructionsMetadata3;
                        this.b = null;
                        this.c = 4;
                        a = p4wVar4.a(url, this);
                        break;
                    }
                }
            case 3:
                instructionsMetadata3 = (InstructionsMetadata) this.b;
                instructionsMetadata2 = this.a;
                kotlin.b.b(obj);
                valueOf = obj;
                boolean booleanValue2 = ((Boolean) valueOf).booleanValue();
                if (jl40.l(instructionsMetadata2.getVersion(), instructionsMetadata3.getVersion())) {
                }
                p4w p4wVar42 = this.d.a;
                String url2 = instructionsMetadata3.getUrl();
                this.a = instructionsMetadata3;
                this.b = null;
                this.c = 4;
                a = p4wVar42.a(url2, this);
                break;
            case 4:
                instructionsMetadata3 = this.a;
                kotlin.b.b(obj);
                a = obj;
                bArr = (byte[]) a;
                zcf zcfVar = this.d.b;
                this.a = instructionsMetadata3;
                this.b = bArr;
                this.c = 5;
                MessageDigest messageDigest = MessageDigest.getInstance(JCP.GOST_DIGEST_2012_512_NAME, "JCSP");
                messageDigest.update(bArr);
                upperCase = new BigInteger(1, messageDigest.digest()).toString(16).toUpperCase(Locale.ROOT);
                break;
            case 5:
                byte[] bArr2 = (byte[]) this.b;
                InstructionsMetadata instructionsMetadata5 = this.a;
                kotlin.b.b(obj);
                bArr = bArr2;
                instructionsMetadata3 = instructionsMetadata5;
                upperCase = obj;
                if (!jl40.l((String) upperCase, instructionsMetadata3.getChecksum())) {
                    throw new InstructionsEbsException("File checksum doesn't match");
                }
                p4w p4wVar5 = this.d.a;
                this.a = instructionsMetadata3;
                this.b = null;
                this.c = 6;
                IFileManager iFileManager2 = p4wVar5.d;
                l4w l4wVar2 = p4wVar5.e;
                File file = iFileManager2.getFile(l4wVar2.b, l4wVar2.a, true);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        rzo.l(byteArrayInputStream, fileOutputStream);
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        break;
                    } finally {
                    }
                } finally {
                }
            case 6:
                instructionsMetadata3 = this.a;
                kotlin.b.b(obj);
                p4w p4wVar6 = this.d.a;
                this.a = null;
                this.c = 7;
                p4wVar6.c.remove("ebs.cryptosdk.core.instructions.metadata".concat("|InstructionsMetadata")).putString("ebs.cryptosdk.core.instructions.metadata".concat("|InstructionsMetadata"), p4wVar6.b.h(instructionsMetadata3)).save();
                return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
            case 7:
                kotlin.b.b(obj);
                return zy11Var;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
