package io.flutter.plugins.pathprovider;

import android.content.Context;
import android.util.Log;
import defpackage.ssr;
import defpackage.tsr;
import defpackage.tt5;
import defpackage.w511;
import io.flutter.plugins.pathprovider.Messages;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class d implements tsr, a {
    public Context a;

    public final ArrayList b(Messages.StorageDirectory storageDirectory) {
        ArrayList arrayList = new ArrayList();
        Context context = this.a;
        String str = null;
        switch (c.a[storageDirectory.ordinal()]) {
            case 1:
                break;
            case 2:
                str = "music";
                break;
            case 3:
                str = "podcasts";
                break;
            case 4:
                str = "ringtones";
                break;
            case 5:
                str = "alarms";
                break;
            case 6:
                str = "notifications";
                break;
            case 7:
                str = "pictures";
                break;
            case 8:
                str = "movies";
                break;
            case 9:
                str = "downloads";
                break;
            case 10:
                str = "dcim";
                break;
            case 11:
                str = "documents";
                break;
            default:
                w511.v(storageDirectory, "Unrecognized directory: ");
                return null;
        }
        for (File file : context.getExternalFilesDirs(str)) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        tt5 tt5Var = ssrVar.c;
        Context context = ssrVar.a;
        try {
            a.a(tt5Var, this);
        } catch (Exception e) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e);
        }
        this.a = context;
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        a.a(ssrVar.c, null);
    }
}
