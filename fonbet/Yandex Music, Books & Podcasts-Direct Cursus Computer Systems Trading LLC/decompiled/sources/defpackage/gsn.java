package defpackage;

import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class gsn {
    public final /* synthetic */ hsn a;

    public gsn(hsn hsnVar) {
        this.a = hsnVar;
    }

    public static void a(Bundle bundle, String str) {
        Log.d("MediaRouteProviderProxy", "Error: " + str + ", data: " + bundle);
    }

    public final void b(Bundle bundle) {
        String string = bundle.getString("groupableTitle");
        hsn hsnVar = this.a;
        hsnVar.g = string;
        hsnVar.h = bundle.getString("transferableTitle");
    }
}
