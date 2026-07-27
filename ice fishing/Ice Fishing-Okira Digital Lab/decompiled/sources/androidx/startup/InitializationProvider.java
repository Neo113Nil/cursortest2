package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Trace;
import androidx.versionedparcelable.UltraBufferFunctionJITAF9AGpQgDRIajSFahZ15441904171927;
import androidx.versionedparcelable.ZenithPathOperatorAnnotationFpbtDiBdeccVHe3K6z54410133485305;
import androidx.versionedparcelable.ZenithPathWorkerAliasSZA0eHfpevYaNTGBat94887047860215;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new UltraBufferFunctionJITAF9AGpQgDRIajSFahZ15441904171927("Context cannot be null");
        }
        if (context.getApplicationContext() == null) {
            return true;
        }
        ZenithPathWorkerAliasSZA0eHfpevYaNTGBat94887047860215 NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480 = ZenithPathWorkerAliasSZA0eHfpevYaNTGBat94887047860215.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(context);
        Class<?> cls = getClass();
        Context context2 = (Context) NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
        try {
            try {
                ZenithPathOperatorAnnotationFpbtDiBdeccVHe3K6z54410133485305.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365("Startup");
                NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(context2.getPackageManager().getProviderInfo(new ComponentName(context2, cls), 128).metaData);
                return true;
            } catch (PackageManager.NameNotFoundException e) {
                throw new UltraBufferFunctionJITAF9AGpQgDRIajSFahZ15441904171927(e);
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
