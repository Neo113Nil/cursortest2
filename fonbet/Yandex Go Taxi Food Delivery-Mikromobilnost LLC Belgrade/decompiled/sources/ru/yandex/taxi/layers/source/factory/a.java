package ru.yandex.taxi.layers.source.factory;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.layers.api.model.AppearanceType;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import com.yandex.runtime.image.ImageProvider;
import defpackage.am6;
import defpackage.b64;
import defpackage.bzx;
import defpackage.dm6;
import defpackage.dxu0;
import defpackage.g8e;
import defpackage.gm6;
import defpackage.gyx;
import defpackage.if61;
import defpackage.j73;
import defpackage.jst;
import defpackage.lz2;
import defpackage.m7x0;
import defpackage.nm6;
import defpackage.ny61;
import defpackage.pt3;
import defpackage.q5z;
import defpackage.qoi0;
import defpackage.rl6;
import defpackage.scc;
import defpackage.sxx;
import defpackage.tje;
import defpackage.tp11;
import defpackage.uh6;
import defpackage.x8s;
import defpackage.xl6;
import defpackage.xqx;
import defpackage.y2b1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.net.o;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes9.dex */
public abstract class a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v31, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0219 -> B:10:0x021e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(rl6 rl6Var, Context context, ru.yandex.taxi.widget.c cVar, sxx sxxVar, boolean z, Float f, ContinuationImpl continuationImpl) {
        ExtensionsKt$getBubbleContent$1 extensionsKt$getBubbleContent$1;
        int i;
        List a;
        boolean z2;
        Float f2;
        Iterator it;
        ExtensionsKt$getBubbleContent$1 extensionsKt$getBubbleContent$12;
        dxu0 dxu0Var;
        ArrayList arrayList;
        int i2;
        rl6 rl6Var2;
        Context context2;
        ru.yandex.taxi.widget.c cVar2;
        sxx sxxVar2;
        Context context3;
        ExtensionsKt$getBubbleContent$1 extensionsKt$getBubbleContent$13;
        ru.yandex.taxi.widget.c cVar3;
        Object i3;
        String b;
        Throwable th;
        if (continuationImpl instanceof ExtensionsKt$getBubbleContent$1) {
            extensionsKt$getBubbleContent$1 = (ExtensionsKt$getBubbleContent$1) continuationImpl;
            int i4 = extensionsKt$getBubbleContent$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                extensionsKt$getBubbleContent$1.label = i4 - Integer.MIN_VALUE;
                Object obj = extensionsKt$getBubbleContent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = extensionsKt$getBubbleContent$1.label;
                int i5 = 1;
                Throwable th2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!z || (a = rl6Var.getB()) == null) {
                        a = rl6Var.getA();
                    }
                    if (a != null) {
                        if (a.isEmpty()) {
                            a = null;
                        }
                        if (a != null) {
                            dxu0 l = z ? rl6Var.getL() : rl6Var.getK();
                            ArrayList arrayList2 = new ArrayList();
                            z2 = z;
                            f2 = f;
                            it = a.iterator();
                            extensionsKt$getBubbleContent$12 = extensionsKt$getBubbleContent$1;
                            dxu0Var = l;
                            arrayList = arrayList2;
                            i2 = 0;
                            rl6Var2 = rl6Var;
                            context2 = context;
                            cVar2 = cVar;
                            sxxVar2 = sxxVar;
                            if (it.hasNext()) {
                            }
                        }
                    }
                    return EmptyList.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i6 = extensionsKt$getBubbleContent$1.I$3;
                int i7 = extensionsKt$getBubbleContent$1.I$0;
                boolean z3 = extensionsKt$getBubbleContent$1.Z$0;
                Iterator it2 = (Iterator) extensionsKt$getBubbleContent$1.L$12;
                ?? r10 = (Collection) extensionsKt$getBubbleContent$1.L$10;
                dxu0Var = (dxu0) extensionsKt$getBubbleContent$1.L$7;
                Float f3 = (Float) extensionsKt$getBubbleContent$1.L$4;
                sxx sxxVar3 = (sxx) extensionsKt$getBubbleContent$1.L$3;
                ru.yandex.taxi.widget.c cVar4 = (ru.yandex.taxi.widget.c) extensionsKt$getBubbleContent$1.L$2;
                Context context4 = (Context) extensionsKt$getBubbleContent$1.L$1;
                rl6 rl6Var3 = (rl6) extensionsKt$getBubbleContent$1.L$0;
                kotlin.b.b(obj);
                i2 = i7;
                z2 = z3;
                f2 = f3;
                it = it2;
                rl6 rl6Var4 = rl6Var3;
                Throwable th3 = null;
                sxxVar2 = sxxVar3;
                arrayList = r10;
                extensionsKt$getBubbleContent$12 = extensionsKt$getBubbleContent$1;
                context2 = context4;
                ?? r0 = (View) obj;
                if (r0 == 0) {
                    th = th3;
                } else if (i6 == 0) {
                    r0.setPadding((int) uh6.o(4.0f), 0, 0, 0);
                    th = r0;
                } else {
                    th = r0;
                }
                if (th != null) {
                    arrayList.add(th);
                }
                cVar2 = cVar4;
                th2 = th3;
                rl6Var2 = rl6Var4;
                i5 = 1;
                if (it.hasNext()) {
                    Object next = it.next();
                    int i8 = i2 + 1;
                    if (i2 < 0) {
                        Throwable th4 = th2;
                        scc.m();
                        throw th4;
                    }
                    xl6 xl6Var = (xl6) next;
                    if (i2 != 0) {
                        i5 = 0;
                    }
                    boolean o = rl6Var2.getO();
                    extensionsKt$getBubbleContent$12.L$0 = rl6Var2;
                    extensionsKt$getBubbleContent$12.L$1 = context2;
                    extensionsKt$getBubbleContent$12.L$2 = cVar2;
                    extensionsKt$getBubbleContent$12.L$3 = sxxVar2;
                    extensionsKt$getBubbleContent$12.L$4 = f2;
                    extensionsKt$getBubbleContent$12.L$5 = th2;
                    extensionsKt$getBubbleContent$12.L$6 = th2;
                    extensionsKt$getBubbleContent$12.L$7 = dxu0Var;
                    extensionsKt$getBubbleContent$12.L$8 = th2;
                    extensionsKt$getBubbleContent$12.L$9 = th2;
                    extensionsKt$getBubbleContent$12.L$10 = arrayList;
                    extensionsKt$getBubbleContent$12.L$11 = th2;
                    extensionsKt$getBubbleContent$12.L$12 = it;
                    extensionsKt$getBubbleContent$12.L$13 = th2;
                    extensionsKt$getBubbleContent$12.L$14 = th2;
                    extensionsKt$getBubbleContent$12.L$15 = th2;
                    extensionsKt$getBubbleContent$12.Z$0 = z2;
                    extensionsKt$getBubbleContent$12.I$0 = i8;
                    extensionsKt$getBubbleContent$12.I$1 = i2;
                    extensionsKt$getBubbleContent$12.I$2 = i2;
                    extensionsKt$getBubbleContent$12.I$3 = i5;
                    extensionsKt$getBubbleContent$12.label = 1;
                    if (xl6Var instanceof nm6) {
                        nm6 nm6Var = (nm6) xl6Var;
                        Context context5 = context2;
                        RobotoTextView robotoTextView = new RobotoTextView(context5, null, 0, 6, null);
                        th3 = th2;
                        rl6Var4 = rl6Var2;
                        robotoTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        SpannableString spannableString = new SpannableString(nm6Var.getA());
                        ru.yandex.taxi.widget.c cVar5 = cVar2;
                        spannableString.setSpan(new StyleSpan(nm6Var.getB().getValue()), 0, robotoTextView.getText().length(), 33);
                        robotoTextView.setText(spannableString);
                        ?? S = (dxu0Var == null || (b = dxu0Var.getB()) == null) ? th3 : q5z.S(b);
                        robotoTextView.setTextColor(S == 0 ? z2 ? -1 : ModalContentViewContainer.BASE_SHADOW_COLOR : S.intValue());
                        robotoTextView.setUseMinimumWidth(true);
                        robotoTextView.setEllipsize(TextUtils.TruncateAt.END);
                        robotoTextView.setTextSize(f2 != null ? f2.floatValue() : 13.0f);
                        if (!o) {
                            robotoTextView.setMaxLines(1);
                        }
                        tp11.b(0, robotoTextView);
                        robotoTextView.setTextAlignment(4);
                        context3 = context5;
                        obj = robotoTextView;
                        extensionsKt$getBubbleContent$13 = extensionsKt$getBubbleContent$12;
                        cVar3 = cVar5;
                    } else {
                        rl6Var4 = rl6Var2;
                        Context context6 = context2;
                        ru.yandex.taxi.widget.c cVar6 = cVar2;
                        th3 = th2;
                        if (xl6Var instanceof am6) {
                            ExtensionsKt$getBubbleContent$1 extensionsKt$getBubbleContent$14 = extensionsKt$getBubbleContent$12;
                            i3 = g((am6) xl6Var, cVar6, context6, dxu0Var, z2, extensionsKt$getBubbleContent$14);
                            cVar3 = cVar6;
                            context3 = context6;
                            extensionsKt$getBubbleContent$13 = extensionsKt$getBubbleContent$14;
                            if (i3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                i3 = (View) i3;
                            }
                        } else {
                            context3 = context6;
                            extensionsKt$getBubbleContent$13 = extensionsKt$getBubbleContent$12;
                            cVar3 = cVar6;
                            if (xl6Var instanceof dm6) {
                                i3 = h((dm6) xl6Var, cVar3, context3, extensionsKt$getBubbleContent$13);
                                if (i3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    i3 = (View) i3;
                                }
                            } else if (xl6Var instanceof gm6) {
                                i3 = i((gm6) xl6Var, sxxVar2, context3, extensionsKt$getBubbleContent$13);
                            } else {
                                jst.e.j(new IllegalArgumentException(g8e.o("Unknown bubbleComponent type ", qoi0.a(xl6Var.getClass()).d())));
                                obj = th3;
                            }
                        }
                        obj = i3;
                    }
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    context2 = context3;
                    i6 = i5;
                    cVar4 = cVar3;
                    extensionsKt$getBubbleContent$12 = extensionsKt$getBubbleContent$13;
                    i2 = i8;
                    ?? r02 = (View) obj;
                    if (r02 == 0) {
                    }
                    if (th != null) {
                    }
                    cVar2 = cVar4;
                    th2 = th3;
                    rl6Var2 = rl6Var4;
                    i5 = 1;
                    if (it.hasNext()) {
                        return arrayList;
                    }
                }
            }
        }
        extensionsKt$getBubbleContent$1 = new ExtensionsKt$getBubbleContent$1(continuationImpl);
        Object obj2 = extensionsKt$getBubbleContent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = extensionsKt$getBubbleContent$1.label;
        int i52 = 1;
        Throwable th22 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v13, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.String] */
    public static final String b(List list) {
        String a;
        if (list == null) {
            return "";
        }
        ?? sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xl6 xl6Var = (xl6) it.next();
            if (xl6Var instanceof nm6) {
                nm6 nm6Var = (nm6) xl6Var;
                a = new SpannableString(nm6Var.getA());
                a.setSpan(new StyleSpan(nm6Var.getB().getValue()), 0, nm6Var.getA().length(), 33);
            } else if (xl6Var instanceof am6) {
                a = c(((am6) xl6Var).getA());
            } else if (xl6Var instanceof dm6) {
                dm6 dm6Var = (dm6) xl6Var;
                String c = c(dm6Var.getA());
                FormattedText b = dm6Var.getB();
                a = TextUtils.concat(c, "\n", b != null ? c(b) : null);
            } else {
                a = xl6Var instanceof gm6 ? ((gm6) xl6Var).getA() : "";
            }
            sb.append(a);
        }
        return sb.toString();
    }

    public static final String c(FormattedText formattedText) {
        StringBuilder sb = new StringBuilder();
        for (o oVar : formattedText.a) {
            if (oVar instanceof FormattedText.h) {
                sb.append((CharSequence) k((FormattedText.h) oVar));
            } else if (oVar instanceof FormattedText.d) {
                sb.append(((FormattedText.d) oVar).a);
            } else if (oVar instanceof FormattedText.e) {
                sb.append(((FormattedText.e) oVar).a);
            } else if (oVar instanceof FormattedText.g) {
                FormattedText.g gVar = (FormattedText.g) oVar;
                sb.append(gVar.a);
                sb.append((CharSequence) k(gVar.b));
            }
        }
        return sb.toString();
    }

    public static final boolean d(if61 if61Var, float f) {
        return if61Var.a() <= f && f <= if61Var.b();
    }

    public static final RobotoTextView e(Context context, CharSequence charSequence, Integer num) {
        RobotoTextView robotoTextView = new RobotoTextView(context, null, 0, 6, null);
        robotoTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        if (num != null) {
            robotoTextView.setTextColor(num.intValue());
        }
        robotoTextView.setText(charSequence);
        robotoTextView.setUseMinimumWidth(true);
        return robotoTextView;
    }

    public static final lz2 f(xqx xqxVar, float f) {
        return new lz2(ImageProvider.fromBitmap(xqxVar.b()), f, (y2b1) null, 0.0f, (pt3) null, (AppearanceType) null, xqxVar.a(), (ImageProvider) null, (PointF) null, 892);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(am6 am6Var, ru.yandex.taxi.widget.c cVar, Context context, dxu0 dxu0Var, boolean z, ContinuationImpl continuationImpl) {
        ExtensionsKt$toContentView$2 extensionsKt$toContentView$2;
        int i;
        Integer num;
        String b;
        if (continuationImpl instanceof ExtensionsKt$toContentView$2) {
            extensionsKt$toContentView$2 = (ExtensionsKt$toContentView$2) continuationImpl;
            int i2 = extensionsKt$toContentView$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                extensionsKt$toContentView$2.label = i2 - Integer.MIN_VALUE;
                ExtensionsKt$toContentView$2 extensionsKt$toContentView$22 = extensionsKt$toContentView$2;
                Object obj = extensionsKt$toContentView$22.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = extensionsKt$toContentView$22.label;
                num = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText a = am6Var.getA();
                    extensionsKt$toContentView$22.L$0 = null;
                    extensionsKt$toContentView$22.L$1 = null;
                    extensionsKt$toContentView$22.L$2 = null;
                    extensionsKt$toContentView$22.L$3 = dxu0Var;
                    extensionsKt$toContentView$22.L$4 = context;
                    extensionsKt$toContentView$22.Z$0 = z;
                    extensionsKt$toContentView$22.label = 1;
                    obj = ru.yandex.taxi.widget.c.e(cVar, a, null, false, extensionsKt$toContentView$22, 30);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = extensionsKt$toContentView$22.Z$0;
                    context = (Context) extensionsKt$toContentView$22.L$4;
                    dxu0Var = (dxu0) extensionsKt$toContentView$22.L$3;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence = (CharSequence) obj;
                if (dxu0Var != null && (b = dxu0Var.getB()) != null) {
                    num = q5z.S(b);
                }
                return e(context, charSequence, new Integer(num == null ? num.intValue() : z ? -1 : ModalContentViewContainer.BASE_SHADOW_COLOR));
            }
        }
        extensionsKt$toContentView$2 = new ExtensionsKt$toContentView$2(continuationImpl);
        ExtensionsKt$toContentView$2 extensionsKt$toContentView$222 = extensionsKt$toContentView$2;
        Object obj2 = extensionsKt$toContentView$222.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = extensionsKt$toContentView$222.label;
        num = null;
        if (i != 0) {
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        if (dxu0Var != null) {
            num = q5z.S(b);
        }
        return e(context, charSequence2, new Integer(num == null ? num.intValue() : z ? -1 : ModalContentViewContainer.BASE_SHADOW_COLOR));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(dm6 dm6Var, ru.yandex.taxi.widget.c cVar, Context context, ContinuationImpl continuationImpl) {
        ExtensionsKt$toContentView$3 extensionsKt$toContentView$3;
        int i;
        ru.yandex.taxi.widget.c cVar2;
        dm6 dm6Var2;
        Object obj;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        Context context2;
        FormattedText b;
        LinearLayout linearLayout4;
        Context context3;
        LinearLayout linearLayout5;
        if (continuationImpl instanceof ExtensionsKt$toContentView$3) {
            extensionsKt$toContentView$3 = (ExtensionsKt$toContentView$3) continuationImpl;
            int i2 = extensionsKt$toContentView$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                extensionsKt$toContentView$3.label = i2 - Integer.MIN_VALUE;
                ExtensionsKt$toContentView$3 extensionsKt$toContentView$32 = extensionsKt$toContentView$3;
                Object obj2 = extensionsKt$toContentView$32.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = extensionsKt$toContentView$32.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    LinearLayout linearLayout6 = new LinearLayout(context);
                    linearLayout6.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    linearLayout6.setGravity(3);
                    linearLayout6.setOrientation(1);
                    FormattedText a = dm6Var.getA();
                    extensionsKt$toContentView$32.L$0 = dm6Var;
                    extensionsKt$toContentView$32.L$1 = cVar;
                    extensionsKt$toContentView$32.L$2 = context;
                    extensionsKt$toContentView$32.L$3 = linearLayout6;
                    extensionsKt$toContentView$32.L$4 = linearLayout6;
                    extensionsKt$toContentView$32.L$5 = context;
                    extensionsKt$toContentView$32.L$6 = linearLayout6;
                    extensionsKt$toContentView$32.label = 1;
                    cVar2 = cVar;
                    Object e = ru.yandex.taxi.widget.c.e(cVar2, a, null, false, extensionsKt$toContentView$32, 30);
                    if (e != coroutineSingletons) {
                        dm6Var2 = dm6Var;
                        obj = e;
                        linearLayout = linearLayout6;
                        linearLayout2 = linearLayout;
                        linearLayout3 = linearLayout2;
                        context2 = context;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    linearLayout4 = (LinearLayout) extensionsKt$toContentView$32.L$7;
                    context3 = (Context) extensionsKt$toContentView$32.L$6;
                    linearLayout5 = (LinearLayout) extensionsKt$toContentView$32.L$3;
                    kotlin.b.b(obj2);
                    linearLayout4.addView(e(context3, (CharSequence) obj2, null));
                    return linearLayout5;
                }
                linearLayout = (LinearLayout) extensionsKt$toContentView$32.L$6;
                context = (Context) extensionsKt$toContentView$32.L$5;
                linearLayout2 = (LinearLayout) extensionsKt$toContentView$32.L$4;
                LinearLayout linearLayout7 = (LinearLayout) extensionsKt$toContentView$32.L$3;
                Context context4 = (Context) extensionsKt$toContentView$32.L$2;
                ru.yandex.taxi.widget.c cVar3 = (ru.yandex.taxi.widget.c) extensionsKt$toContentView$32.L$1;
                dm6Var2 = (dm6) extensionsKt$toContentView$32.L$0;
                kotlin.b.b(obj2);
                obj = obj2;
                context2 = context4;
                linearLayout3 = linearLayout7;
                cVar2 = cVar3;
                linearLayout.addView(e(context, (CharSequence) obj, null));
                b = dm6Var2.getB();
                if (b != null) {
                    return linearLayout3;
                }
                extensionsKt$toContentView$32.L$0 = null;
                extensionsKt$toContentView$32.L$1 = null;
                extensionsKt$toContentView$32.L$2 = null;
                extensionsKt$toContentView$32.L$3 = linearLayout3;
                extensionsKt$toContentView$32.L$4 = null;
                extensionsKt$toContentView$32.L$5 = null;
                extensionsKt$toContentView$32.L$6 = context2;
                extensionsKt$toContentView$32.L$7 = linearLayout2;
                extensionsKt$toContentView$32.label = 2;
                Object e2 = ru.yandex.taxi.widget.c.e(cVar2, b, null, false, extensionsKt$toContentView$32, 30);
                if (e2 != coroutineSingletons) {
                    Context context5 = context2;
                    obj2 = e2;
                    linearLayout4 = linearLayout2;
                    context3 = context5;
                    linearLayout5 = linearLayout3;
                    linearLayout4.addView(e(context3, (CharSequence) obj2, null));
                    return linearLayout5;
                }
                return coroutineSingletons;
            }
        }
        extensionsKt$toContentView$3 = new ExtensionsKt$toContentView$3(continuationImpl);
        ExtensionsKt$toContentView$3 extensionsKt$toContentView$322 = extensionsKt$toContentView$3;
        Object obj22 = extensionsKt$toContentView$322.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = extensionsKt$toContentView$322.label;
        if (i != 0) {
        }
        linearLayout.addView(e(context, (CharSequence) obj, null));
        b = dm6Var2.getB();
        if (b != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(gm6 gm6Var, sxx sxxVar, Context context, ContinuationImpl continuationImpl) {
        ExtensionsKt$toContentView$5 extensionsKt$toContentView$5;
        int i;
        Bitmap bitmap;
        if (continuationImpl instanceof ExtensionsKt$toContentView$5) {
            extensionsKt$toContentView$5 = (ExtensionsKt$toContentView$5) continuationImpl;
            int i2 = extensionsKt$toContentView$5.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                extensionsKt$toContentView$5.label = i2 - Integer.MIN_VALUE;
                Object obj = extensionsKt$toContentView$5.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = extensionsKt$toContentView$5.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String a = gm6Var.getA();
                    extensionsKt$toContentView$5.L$0 = gm6Var;
                    extensionsKt$toContentView$5.L$1 = null;
                    extensionsKt$toContentView$5.L$2 = context;
                    extensionsKt$toContentView$5.label = 1;
                    obj = sxxVar.a(((m7x0) sxxVar.b).a(a), extensionsKt$toContentView$5);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    context = (Context) extensionsKt$toContentView$5.L$2;
                    gm6Var = (gm6) extensionsKt$toContentView$5.L$0;
                    kotlin.b.b(obj);
                }
                bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    return null;
                }
                Integer b = gm6Var.getB();
                Integer c = gm6Var.getC();
                AppCompatImageView appCompatImageView = new AppCompatImageView(context);
                appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(b != null ? tje.u(b.intValue(), context) : -2, c != null ? tje.u(c.intValue(), context) : -2));
                appCompatImageView.setImageBitmap(bitmap);
                return appCompatImageView;
            }
        }
        extensionsKt$toContentView$5 = new ExtensionsKt$toContentView$5(continuationImpl);
        Object obj3 = extensionsKt$toContentView$5.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = extensionsKt$toContentView$5.label;
        if (i != 0) {
        }
        bitmap = (Bitmap) obj3;
        if (bitmap != null) {
        }
    }

    public static final gyx j(bzx bzxVar) {
        return new gyx(bzxVar.getA(), bzxVar.getB().longValue(), bzxVar.getC().longValue(), bzxVar.getE());
    }

    public static final SpannableString k(FormattedText.h hVar) {
        SpannableString spannableString = new SpannableString(b64.j(hVar.a, hVar.g));
        spannableString.setSpan(new StyleSpan(x8s.a(hVar.b)), 0, hVar.a.length(), 33);
        return spannableString;
    }

    public static final if61 l(Float[] fArr) {
        return new if61(((Number) j73.C(fArr)).floatValue(), ((Number) j73.O(fArr)).floatValue());
    }
}
