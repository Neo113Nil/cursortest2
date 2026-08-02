package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes10.dex */
public final class vlf extends qlf {
    public final /* synthetic */ wlf a;

    public vlf(wlf wlfVar) {
        this.a = wlfVar;
    }

    @Override // defpackage.qlf
    public final void extraCallback(String str, Bundle bundle) {
        try {
            this.a.a.extraCallback(str, bundle);
        } catch (RemoteException unused) {
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
    }

    @Override // defpackage.qlf
    public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
        try {
            return this.a.a.extraCallbackWithResult(str, bundle);
        } catch (RemoteException unused) {
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            return null;
        }
    }

    @Override // defpackage.qlf
    public final void onActivityLayout(int i, int i2, int i3, int i4, int i5, Bundle bundle) {
        try {
            this.a.a.onActivityLayout(i, i2, i3, i4, i5, bundle);
        } catch (RemoteException unused) {
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
    }

    @Override // defpackage.qlf
    public final void onActivityResized(int i, int i2, Bundle bundle) {
        try {
            this.a.a.onActivityResized(i, i2, bundle);
        } catch (RemoteException unused) {
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
    }

    @Override // defpackage.qlf
    public final void onMessageChannelReady(Bundle bundle) {
        try {
            this.a.a.onMessageChannelReady(bundle);
        } catch (RemoteException unused) {
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
    }

    @Override // defpackage.qlf
    public final void onMinimized(Bundle bundle) {
        try {
            this.a.a.onMinimized(bundle);
        } catch (RemoteException unused) {
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
    }

    @Override // defpackage.qlf
    public final void onNavigationEvent(int i, Bundle bundle) {
        try {
            this.a.a.onNavigationEvent(i, bundle);
        } catch (RemoteException unused) {
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
    }

    @Override // defpackage.qlf
    public final void onPostMessage(String str, Bundle bundle) {
        try {
            this.a.a.onPostMessage(str, bundle);
        } catch (RemoteException unused) {
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
    }

    @Override // defpackage.qlf
    public final void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
        try {
            this.a.a.onRelationshipValidationResult(i, uri, z, bundle);
        } catch (RemoteException unused) {
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
    }

    @Override // defpackage.qlf
    public final void onUnminimized(Bundle bundle) {
        try {
            this.a.a.onUnminimized(bundle);
        } catch (RemoteException unused) {
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
    }

    @Override // defpackage.qlf
    public final void onWarmupCompleted(Bundle bundle) {
        try {
            this.a.a.onWarmupCompleted(bundle);
        } catch (RemoteException unused) {
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
    }
}
