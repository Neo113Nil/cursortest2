package defpackage;

import android.content.Context;
import android.util.Base64;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class fgv extends FrameLayout implements wpr {
    public final qu3 a;
    public final kbv b;
    public List c;
    public tu3 d;
    public float e;

    public fgv(Context context) {
        super(context, null);
        this.c = Collections.EMPTY_LIST;
        this.d = tu3.e;
        this.e = 0.0533f;
        qu3 qu3Var = new qu3(context, 0);
        this.a = qu3Var;
        kbv kbvVar = new kbv(context, null, 1);
        this.b = kbvVar;
        kbvVar.setBackgroundColor(0);
        addView(qu3Var);
        addView(kbvVar);
    }

    @Override // defpackage.wpr
    public final void a(List list, tu3 tu3Var, float f, float f2) {
        this.d = tu3Var;
        this.e = f;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (list.size() > 0) {
            list.get(0).getClass();
            l1j.f();
            return;
        }
        if (!this.c.isEmpty() || !arrayList2.isEmpty()) {
            this.c = arrayList2;
            b();
        }
        this.a.a(arrayList, tu3Var, f, f2);
        invalidate();
    }

    public final void b() {
        String format;
        StringBuilder sb = new StringBuilder();
        String O = nt0.O(this.d.a);
        float f = this.e;
        getHeight();
        float height = f == -3.4028235E38f ? -3.4028235E38f : f * ((getHeight() - getPaddingTop()) - getPaddingBottom());
        String str = "unset";
        if (height == -3.4028235E38f) {
            format = "unset";
        } else {
            Object[] objArr = {Float.valueOf(height / getContext().getResources().getDisplayMetrics().density)};
            int i = yut.a;
            format = String.format(Locale.US, "%.2fpx", objArr);
        }
        Float valueOf = Float.valueOf(1.2f);
        tu3 tu3Var = this.d;
        int i2 = tu3Var.c;
        int i3 = tu3Var.d;
        if (i2 == 1) {
            Object[] objArr2 = {nt0.O(i3)};
            int i4 = yut.a;
            str = String.format(Locale.US, "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", objArr2);
        } else if (i2 == 2) {
            String O2 = nt0.O(i3);
            int i5 = yut.a;
            Locale locale = Locale.US;
            str = "0.1em 0.12em 0.15em ".concat(O2);
        } else if (i2 == 3) {
            String O3 = nt0.O(i3);
            int i6 = yut.a;
            Locale locale2 = Locale.US;
            str = "0.06em 0.08em 0.15em ".concat(O3);
        } else if (i2 == 4) {
            String O4 = nt0.O(i3);
            int i7 = yut.a;
            Locale locale3 = Locale.US;
            str = "-0.05em -0.05em 0.15em ".concat(O4);
        }
        Object[] objArr3 = {O, format, valueOf, str};
        int i8 = yut.a;
        sb.append(String.format(Locale.US, "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", objArr3));
        HashMap hashMap = new HashMap();
        hashMap.put(".default_bg,.default_bg *", "background-color:" + nt0.O(this.d.b) + ";");
        if (this.c.size() > 0) {
            this.c.get(0).getClass();
            l1j.f();
            return;
        }
        sb.append("</div></body></html>");
        StringBuilder sb2 = new StringBuilder("<html><head><style>");
        for (String str2 : hashMap.keySet()) {
            sb2.append(str2);
            sb2.append("{");
            sb2.append((String) hashMap.get(str2));
            sb2.append("}");
        }
        sb2.append("</style></head>");
        sb.insert(0, sb2.toString());
        this.b.loadData(Base64.encodeToString(sb.toString().getBytes(pe4.b), 1), "text/html", "base64");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.c.isEmpty()) {
            return;
        }
        b();
    }
}
