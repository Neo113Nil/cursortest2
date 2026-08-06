package androidx.startup;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class InitializationProvider extends android.content.ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri uri) {
        throw new java.lang.IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        throw new java.lang.IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        android.content.Context context = getContext();
        if (context == null) {
            throw new defpackage.vg("Context cannot be null");
        }
        if (context.getApplicationContext() == null) {
            return true;
        }
        defpackage.a7 P05cfTpS5W5L = defpackage.a7.P05cfTpS5W5L(context);
        android.content.Context context2 = (android.content.Context) P05cfTpS5W5L.JhCgjQRTAOCT;
        try {
            try {
                defpackage.v70.Ns0WNyEWdPsk("Startup");
                P05cfTpS5W5L.fWTAfUmVKrZq(context2.getPackageManager().getProviderInfo(new android.content.ComponentName(context2.getPackageName(), androidx.startup.InitializationProvider.class.getName()), 128).metaData);
                return true;
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                throw new defpackage.vg(e);
            }
        } finally {
            android.os.Trace.endSection();
        }
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        throw new java.lang.IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.IllegalStateException("Not allowed.");
    }
}
