package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.core.app.q;
import androidx.core.app.v;
import androidx.core.app.z0;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public final class zf0 {
    public boolean a;
    public boolean b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public zf0(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        this.a = true;
        this.b = true;
        this.c = iconCompat;
        this.d = v.d(charSequence);
        this.e = pendingIntent;
        this.f = bundle;
        this.g = null;
        this.a = true;
        this.b = true;
    }

    public q a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = (ArrayList) this.g;
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                z0 z0Var = (z0) it.next();
                z0Var.getClass();
                arrayList2.add(z0Var);
            }
        }
        if (!arrayList.isEmpty()) {
        }
        return new q((IconCompat) this.c, (CharSequence) this.d, (PendingIntent) this.e, (Bundle) this.f, arrayList2.isEmpty() ? null : (z0[]) arrayList2.toArray(new z0[arrayList2.size()]), this.a, this.b);
    }

    public void b() {
        ImageView imageView = (ImageView) this.c;
        if (imageView != null) {
            imageView.setVisibility((this.a || this.b) ? 0 : 8);
            imageView.setImageResource(this.a ? wwg0.msg_ic_message_error : wwg0.msg_ic_message_translation_error);
        }
    }

    public zf0(View view) {
        ImageView imageView = (ImageView) view.findViewById(e9h0.dialog_item_error_icon);
        this.c = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new zgv(14, this));
        }
    }

    public zf0(boolean z, boolean z2, String str, String str2, List list, String str3, List list2) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = list;
        this.f = str3;
        this.g = list2;
    }

    public zf0(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
        this(iconCompat, charSequence, pendingIntent, new Bundle());
    }

    public zf0(int i, String str, PendingIntent pendingIntent) {
        this(i != 0 ? IconCompat.d("", null, i) : null, str, pendingIntent, new Bundle());
    }

    public zf0(rf0 rf0Var, CharSequence charSequence, CharSequence charSequence2, Runnable runnable, Runnable runnable2, boolean z, boolean z2) {
        this.c = rf0Var;
        this.d = charSequence;
        this.e = charSequence2;
        this.f = runnable;
        this.g = runnable2;
        this.a = z;
        this.b = z2;
    }
}
