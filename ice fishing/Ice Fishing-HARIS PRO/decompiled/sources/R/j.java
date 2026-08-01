package R;

import D1.o;
import O.B;
import O.K;
import S0.u;
import V.r;
import V.s;
import Z.O;
import a.AbstractC0078a;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.U;
import androidx.recyclerview.widget.RecyclerView;
import b.v;
import c0.C0120a;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.lumenpath.harispro.hrnavigator.R;
import f0.C0133B;
import f0.C0134C;
import f0.C0135D;
import f0.C0137b;
import f0.C0140e;
import f0.C0150o;
import f0.L;
import f0.M;
import f0.w;
import f0.y;
import f0.z;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.WeakHashMap;
import m.C0245b0;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class j implements g {
    public static C0150o B(U u2) {
        O o2 = C0150o.f2956c;
        C0120a c0120a = C0120a.f2339b;
        D1.i.e(c0120a, "defaultCreationExtras");
        M0.h hVar = new M0.h(u2, o2, c0120a);
        D1.e a2 = o.a(C0150o.class);
        String t2 = t(a2);
        if (t2 != null) {
            return (C0150o) hVar.f(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(t2));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public static String E(Class cls) {
        LinkedHashMap linkedHashMap = f0.O.f2894b;
        String str = (String) linkedHashMap.get(cls);
        if (str == null) {
            M m2 = (M) cls.getAnnotation(M.class);
            str = m2 != null ? m2.value() : null;
            if (str == null || str.length() <= 0) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
            }
            linkedHashMap.put(cls, str);
        }
        D1.i.b(str);
        return str;
    }

    public static M.d I(C0245b0 c0245b0) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new M.d(E.a.h(c0245b0));
        }
        TextPaint textPaint = new TextPaint(c0245b0.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = c0245b0.getBreakStrategy();
        int hyphenationFrequency = c0245b0.getHyphenationFrequency();
        if (c0245b0.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i < 28 || (c0245b0.getInputType() & 15) != 3) {
                boolean z2 = c0245b0.getLayoutDirection() == 1;
                switch (c0245b0.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z2) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(E.a.a(DecimalFormatSymbols.getInstance(c0245b0.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new M.d(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static boolean L(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
    }

    public static boolean M(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static int Q(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    public static int R(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static final ArrayList S(Map map, C1.l lVar) {
        D1.i.e(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            C0140e c0140e = (C0140e) entry.getValue();
            Boolean valueOf = c0140e != null ? Boolean.valueOf(c0140e.f2916b) : null;
            D1.i.b(valueOf);
            if (!valueOf.booleanValue() && !c0140e.f2917c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((Boolean) lVar.g((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final C0134C T(C1.l lVar) {
        C0135D c0135d = new C0135D();
        lVar.g(c0135d);
        boolean z2 = c0135d.f2868b;
        C0133B c0133b = c0135d.f2867a;
        c0133b.f2853a = z2;
        c0133b.f2854b = c0135d.f2869c;
        int i = c0135d.f2870d;
        boolean z3 = c0135d.e;
        c0133b.f2855c = i;
        c0133b.f2856d = false;
        c0133b.e = z3;
        return new C0134C(c0133b.f2853a, c0133b.f2854b, c0133b.f2855c, c0133b.f2856d, c0133b.e, c0133b.f2857f, c0133b.f2858g, c0133b.f2859h, c0133b.i);
    }

    public static void e(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static int f(View view) {
        D1.i.e(view, "<this>");
        if (view.getAlpha() == RecyclerView.f2111C0 && view.getVisibility() == 0) {
            return 4;
        }
        int visibility = view.getVisibility();
        if (visibility == 0) {
            return 2;
        }
        if (visibility == 4) {
            return 4;
        }
        if (visibility == 8) {
            return 3;
        }
        throw new IllegalArgumentException(D1.h.e("Unknown visibility ", visibility));
    }

    public static W.b f0(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j2 = duplicate.getInt() & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = duplicate.getInt();
                long j3 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    duplicate.position((int) (j3 + j));
                    W.b bVar = new W.b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    bVar.f839d = duplicate;
                    bVar.f836a = position;
                    int i6 = position - duplicate.getInt(position);
                    bVar.f837b = i6;
                    bVar.f838c = ((ByteBuffer) bVar.f839d).getShort(i6);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r10.bottom <= r12.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r9 == 17) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r9 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r11 = Q(r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r9 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r9 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r9 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r9 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        r9 = r12.bottom;
        r10 = r10.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r11 >= java.lang.Math.max(1, r9 - r10)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        r9 = r12.right;
        r10 = r10.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        r9 = r10.top;
        r10 = r12.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        r9 = r10.left;
        r10 = r12.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0033, code lost:
    
        if (r10.right <= r12.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x003a, code lost:
    
        if (r10.top >= r12.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0041, code lost:
    
        if (r10.left >= r12.right) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean g(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean h2 = h(i, rect, rect2);
        if (h(i, rect, rect3) || !h2) {
            return false;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
        }
        return true;
    }

    public static void g0(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
        Drawable mutate = drawable.mutate();
        mutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public static boolean h(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static final void h0(View view, v vVar) {
        D1.i.e(view, "<this>");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, vVar);
    }

    public static final void k(View view) {
        D1.i.e(view, "<this>");
        O.M m2 = new O.M(view, null);
        J1.g gVar = new J1.g();
        gVar.f368d = h0.f.j(m2, gVar, gVar);
        while (gVar.hasNext()) {
            View view2 = (View) gVar.next();
            S.a aVar = (S.a) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (aVar == null) {
                aVar = new S.a();
                view2.setTag(R.id.pooling_container_listener_holder_tag, aVar);
            }
            ArrayList arrayList = aVar.f1055a;
            int E2 = u1.h.E(arrayList);
            if (-1 < E2) {
                arrayList.get(E2).getClass();
                throw new ClassCastException();
            }
        }
    }

    public static void k0(TextView textView, int i) {
        AbstractC0078a.f(i);
        if (Build.VERSION.SDK_INT >= 28) {
            E.a.i(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static L l(TypedValue typedValue, L l2, L l3, String str, String str2) {
        if (l2 == null || l2 == l3) {
            return l2 == null ? l3 : l2;
        }
        throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
    }

    public static void l0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = K.f747a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z2 = onLongClickListener != null;
        boolean z3 = hasOnClickListeners || z2;
        checkableImageButton.setFocusable(z3);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z2);
        checkableImageButton.setImportantForAccessibility(z3 ? 1 : 2);
    }

    public static void m0(TextView textView, int i) {
        AbstractC0078a.f(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void n0(TextView textView, int i) {
        AbstractC0078a.f(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static ImageView.ScaleType o(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static void o0(View view, S0.g gVar) {
        K0.a aVar = gVar.f1076a.f1063b;
        if (aVar == null || !aVar.f389a) {
            return;
        }
        float f2 = RecyclerView.f2111C0;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = K.f747a;
            f2 += B.e((View) parent);
        }
        S0.f fVar = gVar.f1076a;
        if (fVar.f1070l != f2) {
            fVar.f1070l = f2;
            gVar.r();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s p(Context context) {
        ProviderInfo providerInfo;
        L.e eVar;
        ApplicationInfo applicationInfo;
        S0.e cVar = Build.VERSION.SDK_INT >= 28 ? new V.c(9) : new S0.e(9);
        PackageManager packageManager = context.getPackageManager();
        AbstractC0078a.g(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] h2 = cVar.h(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : h2) {
                    arrayList.add(signature.toByteArray());
                }
                eVar = new L.e(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
            }
            if (eVar != null) {
                return null;
            }
            return new s(new r(context, eVar));
        }
        eVar = null;
        if (eVar != null) {
        }
    }

    public static j q(int i) {
        if (i != 0 && i == 1) {
            return new S0.d();
        }
        return new S0.i();
    }

    public static int q0(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final z r(View view) {
        D1.i.e(view, "view");
        J1.c cVar = new J1.c(new J1.d(0, new J1.l(J1.h.f0(view, C0137b.f2908m), C0137b.f2909n, 1)));
        z zVar = (z) (!cVar.hasNext() ? null : cVar.next());
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    public static w s(y yVar) {
        D1.i.e(yVar, "<this>");
        Iterator it = J1.h.f0(yVar, C0137b.f2907l).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return (w) next;
    }

    public static final String t(D1.e eVar) {
        String str;
        Class cls = eVar.f161a;
        D1.i.e(cls, "jClass");
        String str2 = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        boolean isArray = cls.isArray();
        HashMap hashMap = D1.e.f159c;
        if (!isArray) {
            String str3 = (String) hashMap.get(cls.getName());
            return str3 == null ? cls.getCanonicalName() : str3;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (str = (String) hashMap.get(componentType.getName())) != null) {
            str2 = str.concat("Array");
        }
        return str2 == null ? "kotlin.Array" : str2;
    }

    public static ActionMode.Callback u0(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof i) || callback == null) ? callback : new i(callback, textView);
    }

    public static String w(Context context, int i) {
        String valueOf;
        D1.i.e(context, "context");
        if (i <= 16777215) {
            return String.valueOf(i);
        }
        try {
            valueOf = context.getResources().getResourceName(i);
        } catch (Resources.NotFoundException unused) {
            valueOf = String.valueOf(i);
        }
        D1.i.d(valueOf, "try {\n                  …tring()\n                }");
        return valueOf;
    }

    public static Set x() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.emptySet();
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }

    public abstract int A();

    public abstract int C();

    public abstract int D();

    public abstract int F(View view);

    public abstract int G(CoordinatorLayout coordinatorLayout);

    public abstract int H();

    public int J(View view) {
        return 0;
    }

    public int K() {
        return 0;
    }

    public abstract boolean N(float f2);

    public abstract boolean O(View view);

    public abstract boolean P(float f2, float f3);

    public void U(int i) {
    }

    public void V(int i) {
    }

    public abstract void W(Throwable th);

    public abstract View X(int i);

    public abstract boolean Y();

    public abstract void Z(B.k kVar);

    public void a0(View view, int i) {
    }

    public abstract void b0(int i);

    public abstract void c0(View view, int i, int i2);

    public abstract void d0(View view, float f2, float f3);

    public abstract Object e0(int i, Intent intent);

    public abstract int i(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract void i0(boolean z2);

    public abstract float j(int i);

    public abstract void j0(boolean z2);

    public abstract int m(View view, int i);

    public abstract int n(View view, int i);

    public abstract boolean p0(View view, float f2);

    public abstract boolean r0(View view, int i);

    public abstract void s0(ViewGroup.MarginLayoutParams marginLayoutParams, int i);

    public abstract void t0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);

    public abstract int u(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract void v(u uVar, float f2, float f3);

    public abstract int y();

    public abstract InputFilter[] z(InputFilter[] inputFilterArr);
}
