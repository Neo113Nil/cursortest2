package Q0;

import P0.AbstractActivityC0072e;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import com.watchfacestudio.spraktum.R;
import d.AbstractC0142a;
import d1.C0144a;
import h.AbstractC0227x;
import h.C0219o;
import h.N;
import h.f0;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import r.AbstractC1037a;

/* loaded from: classes.dex */
public final class c implements X0.b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1518a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1519b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f1520c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1521d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1522e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1523f;

    public c(Set set, String str, String str2) {
        B0.a aVar = B0.a.f86b;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f1518a = emptySet;
        Map emptyMap = Collections.emptyMap();
        this.f1520c = str;
        this.f1521d = str2;
        this.f1522e = aVar;
        HashSet hashSet = new HashSet(emptySet);
        Iterator it = emptyMap.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f1519b = Collections.unmodifiableSet(hashSet);
    }

    public static boolean a(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList b(Context context, int i2) {
        int b2 = f0.b(context, R.attr.colorControlHighlight);
        int a2 = f0.a(context, R.attr.colorButtonNormal);
        int[] iArr = f0.f3243b;
        int[] iArr2 = f0.f3245d;
        int a3 = AbstractC1037a.a(b2, i2);
        return new ColorStateList(new int[][]{iArr, iArr2, f0.f3244c, f0.f3247f}, new int[]{a2, a3, AbstractC1037a.a(b2, i2), i2});
    }

    public static void e(Drawable drawable, int i2) {
        PorterDuffColorFilter e2;
        PorterDuff.Mode mode = C0219o.f3310b;
        if (AbstractC0227x.a(drawable)) {
            drawable = drawable.mutate();
        }
        synchronized (C0219o.class) {
            e2 = N.e(i2, mode);
        }
        drawable.setColorFilter(e2);
    }

    public ColorStateList c(Context context, int i2) {
        if (i2 == R.drawable.abc_edit_text_material) {
            Object obj = AbstractC0142a.f2825a;
            return context.getColorStateList(R.color.abc_tint_edittext);
        }
        if (i2 == 2131165254) {
            Object obj2 = AbstractC0142a.f2825a;
            return context.getColorStateList(R.color.abc_tint_switch_track);
        }
        if (i2 == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList c2 = f0.c(context, R.attr.colorSwitchThumbNormal);
            if (c2 == null || !c2.isStateful()) {
                iArr[0] = f0.f3243b;
                iArr2[0] = f0.a(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = f0.f3246e;
                iArr2[1] = f0.b(context, R.attr.colorControlActivated);
                iArr[2] = f0.f3247f;
                iArr2[2] = f0.b(context, R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = f0.f3243b;
                iArr[0] = iArr3;
                iArr2[0] = c2.getColorForState(iArr3, 0);
                iArr[1] = f0.f3246e;
                iArr2[1] = f0.b(context, R.attr.colorControlActivated);
                iArr[2] = f0.f3247f;
                iArr2[2] = c2.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }
        if (i2 == R.drawable.abc_btn_default_mtrl_shape) {
            return b(context, f0.b(context, R.attr.colorButtonNormal));
        }
        if (i2 == R.drawable.abc_btn_borderless_material) {
            return b(context, 0);
        }
        if (i2 == R.drawable.abc_btn_colored_material) {
            return b(context, f0.b(context, R.attr.colorAccent));
        }
        if (i2 == 2131165251 || i2 == R.drawable.abc_spinner_textfield_background_material) {
            Object obj3 = AbstractC0142a.f2825a;
            return context.getColorStateList(R.color.abc_tint_spinner);
        }
        if (a((int[]) this.f1519b, i2)) {
            return f0.c(context, R.attr.colorControlNormal);
        }
        if (a((int[]) this.f1522e, i2)) {
            Object obj4 = AbstractC0142a.f2825a;
            return context.getColorStateList(R.color.abc_tint_default);
        }
        if (a((int[]) this.f1523f, i2)) {
            Object obj5 = AbstractC0142a.f2825a;
            return context.getColorStateList(R.color.abc_tint_btn_checkable);
        }
        if (i2 != R.drawable.abc_seekbar_thumb_material) {
            return null;
        }
        Object obj6 = AbstractC0142a.f2825a;
        return context.getColorStateList(R.color.abc_tint_seek_thumb);
    }

    public boolean d(int i2, int i3, Intent intent) {
        Iterator it = new HashSet((HashSet) this.f1520c).iterator();
        while (true) {
            boolean z2 = false;
            while (it.hasNext()) {
                HashMap hashMap = ((C0144a) it.next()).f2830d;
                if (hashMap.containsKey(Integer.valueOf(i2))) {
                    ((Z0.j) hashMap.remove(Integer.valueOf(i2))).c(i3 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
                } else if (z2) {
                }
                z2 = true;
            }
            return z2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [int[], java.io.Serializable] */
    public c() {
        this.f1518a = new int[]{2131165267, 2131165265, 2131165184};
        this.f1519b = new int[]{2131165208, R.drawable.abc_seekbar_tick_mark_material, 2131165215, 2131165210, 2131165211, 2131165214, 2131165213};
        this.f1520c = new int[]{2131165264, 2131165266, 2131165201, R.drawable.abc_text_cursor_material, 2131165258, 2131165260, 2131165262, 2131165259, 2131165261, 2131165263};
        this.f1521d = new int[]{2131165239, R.drawable.abc_cab_background_internal_bg, 2131165238};
        this.f1522e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f1523f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public c(M1.d taskRunner) {
        kotlin.jvm.internal.i.e(taskRunner, "taskRunner");
        this.f1518a = taskRunner;
        this.f1523f = Q1.i.f1603a;
    }

    public c(AbstractActivityC0072e abstractActivityC0072e, androidx.lifecycle.l lVar) {
        this.f1519b = new HashSet();
        this.f1520c = new HashSet();
        this.f1521d = new HashSet();
        this.f1522e = new HashSet();
        new HashSet();
        this.f1523f = new HashSet();
        this.f1518a = abstractActivityC0072e;
        new HiddenLifecycleReference(lVar);
    }
}
