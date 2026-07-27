package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Context.FrostHunterLinearLayoutSolarTurboSpark3070;
import android.content.Context.FrostHunterLooperThreadStormCyberElite6638;
import android.content.Context.FrostHunterTraceHyperionAuroraNebula9947;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Trace;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
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
            throw new FrostHunterLinearLayoutSolarTurboSpark3070("Context cannot be null");
        }
        if (context.getApplicationContext() == null) {
            return true;
        }
        FrostHunterTraceHyperionAuroraNebula9947 FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterTraceHyperionAuroraNebula9947.FrostHunterServiceConnectionTurboPhoenixOmega6719(context);
        Class<?> cls = getClass();
        Context context2 = (Context) FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterKeyframeGammaGamma1197;
        try {
            try {
                FrostHunterLooperThreadStormCyberElite6638.FrostHunterBundlePulseFusionHero2475("Startup");
                FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterRemoteConfigSpeedSpeed8566(context2.getPackageManager().getProviderInfo(new ComponentName(context2, cls), 128).metaData);
                return true;
            } catch (PackageManager.NameNotFoundException e) {
                throw new FrostHunterLinearLayoutSolarTurboSpark3070(e);
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
