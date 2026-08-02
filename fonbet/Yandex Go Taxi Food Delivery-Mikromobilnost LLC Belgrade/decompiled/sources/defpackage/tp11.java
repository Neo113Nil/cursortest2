package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import ru.yandex.taxi.widget.GoNumberPicker;
import ru.yandex.video.m3.player.ui.debug.view.graph.DebugGraphView;

/* loaded from: classes10.dex */
public abstract class tp11 {
    public static Boolean a;
    public static final ArrayList b;
    public static final ArrayList c;
    public static final ArrayList d;
    public static final ArrayList e;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        b = new ArrayList();
        c = new ArrayList();
        d = new ArrayList();
        e = new ArrayList();
        sparseIntArray.put(0, -16776961);
        sparseIntArray.put(1, -65536);
        sparseIntArray.put(2, DebugGraphView.DEFAULT_GRAPH_COLOR);
        sparseIntArray.put(3, -256);
        sparseIntArray.put(5, -16711681);
    }

    public static void a(int i, int i2, TextView textView) {
        if (textView.isInEditMode()) {
            textView.setTypeface(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? Typeface.create("sans-serif-regular", i2) : Typeface.create("sans-serif-bold", i2) : Typeface.create("sans-serif-bold", i2) : Typeface.create("sans-serif-medium", i2) : Typeface.create("sans-serif-thin", i2) : Typeface.create("sans-serif-light", i2) : Typeface.create("sans-serif-regular", i2), i2);
            return;
        }
        if (e(textView.getContext())) {
            int[] iArr = up11.a;
            textView.setTypeface(eja1.w(0, i2), i2);
        } else {
            int[] iArr2 = up11.a;
            textView.setTypeface(eja1.w(i, i2), i2);
            textView.isInEditMode();
        }
    }

    public static void b(int i, View view) {
        if (view.isInEditMode()) {
            c(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? Typeface.create("sans-serif-regular", 0) : Typeface.create("sans-serif-bold", 0) : Typeface.create("sans-serif-bold", 0) : Typeface.create("sans-serif-medium", 0) : Typeface.create("sans-serif-thin", 0) : Typeface.create("sans-serif-light", 0) : Typeface.create("sans-serif-regular", 0), view);
            return;
        }
        if (e(view.getContext())) {
            int[] iArr = up11.a;
            c(eja1.w(0, 0), view);
        } else {
            int[] iArr2 = up11.a;
            c(eja1.w(i, 0), view);
            view.isInEditMode();
        }
    }

    public static void c(Typeface typeface, View view) {
        if (typeface == null) {
            return;
        }
        if (view instanceof TextView) {
            ((TextView) view).setTypeface(typeface);
        } else if (view instanceof GoNumberPicker) {
            ((GoNumberPicker) view).setTypeface(typeface);
        }
    }

    public static boolean d(String str, Typeface... typefaceArr) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            String valueOf = String.valueOf(str.charAt(i));
            for (Typeface typeface : typefaceArr) {
                Paint paint = new Paint();
                paint.setTypeface(typeface);
                if (!paint.hasGlyph(valueOf)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean e(Context context) {
        if (a == null) {
            a = Boolean.valueOf(context.getResources().getDisplayMetrics().widthPixels <= 480);
        }
        return jl40.l(a, Boolean.TRUE);
    }
}
