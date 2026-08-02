package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.shortcut_widget;

import defpackage.azr0;
import defpackage.bzr0;
import defpackage.f0s0;
import defpackage.g0s0;
import defpackage.h0s0;
import defpackage.hjf0;
import defpackage.j6s;
import defpackage.ksy0;
import defpackage.n0s0;
import defpackage.n351;
import defpackage.ny61;
import defpackage.r9x0;
import defpackage.rh4;
import defpackage.tdv;
import defpackage.u0s0;
import defpackage.ul4;
import defpackage.uo5;
import defpackage.w511;
import defpackage.x2s;
import defpackage.x4c;
import defpackage.x9x0;
import defpackage.y0s0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.VerticalContentAlignment;

/* loaded from: classes5.dex */
public final class a {
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.text.b a;
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.image.a b;
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.progress_bar.a c;
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a d;

    public a(ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.text.b bVar, ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.image.a aVar, ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.progress_bar.a aVar2, ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar3) {
        this.a = bVar;
        this.b = aVar;
        this.c = aVar2;
        this.d = aVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(y0s0 y0s0Var, j6s j6sVar, ContinuationImpl continuationImpl) {
        ShortcutMapper$map$1 shortcutMapper$map$1;
        int i;
        String str;
        y0s0 y0s0Var2 = y0s0Var;
        if (continuationImpl instanceof ShortcutMapper$map$1) {
            shortcutMapper$map$1 = (ShortcutMapper$map$1) continuationImpl;
            int i2 = shortcutMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                shortcutMapper$map$1.label = i2 - Integer.MIN_VALUE;
                Object obj = shortcutMapper$map$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shortcutMapper$map$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str2 = y0s0Var2.a;
                    azr0 azr0Var = y0s0Var2.b;
                    shortcutMapper$map$1.L$0 = y0s0Var2;
                    shortcutMapper$map$1.L$1 = null;
                    shortcutMapper$map$1.L$2 = str2;
                    shortcutMapper$map$1.label = 1;
                    Object b = b(azr0Var, j6sVar, shortcutMapper$map$1);
                    if (b == obj2) {
                        return obj2;
                    }
                    str = str2;
                    obj = b;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str3 = (String) shortcutMapper$map$1.L$2;
                    y0s0 y0s0Var3 = (y0s0) shortcutMapper$map$1.L$0;
                    kotlin.b.b(obj);
                    str = str3;
                    y0s0Var2 = y0s0Var3;
                }
                bzr0 bzr0Var = (bzr0) obj;
                r9x0 r9x0Var = y0s0Var2.c;
                String str4 = y0s0Var2.e;
                x9x0 x9x0Var = r9x0Var == null ? new x9x0(r9x0Var, null, null, new x2s(str4, null), 6) : null;
                ul4 ul4Var = y0s0Var2.d;
                return new u0s0(str, bzr0Var, x9x0Var, ul4Var == null ? this.d.c(ul4Var) : null, new x2s(str4, null));
            }
        }
        shortcutMapper$map$1 = new ShortcutMapper$map$1(this, continuationImpl);
        Object obj3 = shortcutMapper$map$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shortcutMapper$map$1.label;
        if (i != 0) {
        }
        bzr0 bzr0Var2 = (bzr0) obj3;
        r9x0 r9x0Var2 = y0s0Var2.c;
        String str42 = y0s0Var2.e;
        if (r9x0Var2 == null) {
        }
        ul4 ul4Var2 = y0s0Var2.d;
        return new u0s0(str, bzr0Var2, x9x0Var, ul4Var2 == null ? this.d.c(ul4Var2) : null, new x2s(str42, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r11v0, types: [ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.shortcut_widget.a] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00a5 -> B:10:0x00a9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(azr0 azr0Var, j6s j6sVar, ContinuationImpl continuationImpl) {
        ShortcutMapper$mapContent$1 shortcutMapper$mapContent$1;
        int i;
        Iterator it;
        ArrayList arrayList;
        int i2;
        j6s j6sVar2;
        ShortcutMapper$mapContent$1 shortcutMapper$mapContent$12;
        int i3;
        int i4;
        if (continuationImpl instanceof ShortcutMapper$mapContent$1) {
            shortcutMapper$mapContent$1 = (ShortcutMapper$mapContent$1) continuationImpl;
            int i5 = shortcutMapper$mapContent$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                shortcutMapper$mapContent$1.label = i5 - Integer.MIN_VALUE;
                Object obj = shortcutMapper$mapContent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shortcutMapper$mapContent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ArrayList arrayList2 = azr0Var.a;
                    ArrayList arrayList3 = new ArrayList();
                    it = arrayList2.iterator();
                    arrayList = arrayList3;
                    i2 = 0;
                    j6sVar2 = j6sVar;
                    shortcutMapper$mapContent$12 = shortcutMapper$mapContent$1;
                    i3 = 0;
                    i4 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i6 = shortcutMapper$mapContent$1.I$2;
                    int i7 = shortcutMapper$mapContent$1.I$1;
                    int i8 = shortcutMapper$mapContent$1.I$0;
                    Iterator it2 = (Iterator) shortcutMapper$mapContent$1.L$6;
                    ?? r7 = (Collection) shortcutMapper$mapContent$1.L$4;
                    j6s j6sVar3 = (j6s) shortcutMapper$mapContent$1.L$1;
                    azr0 azr0Var2 = (azr0) shortcutMapper$mapContent$1.L$0;
                    kotlin.b.b(obj);
                    i3 = i6;
                    azr0Var = azr0Var2;
                    ArrayList arrayList4 = r7;
                    it = it2;
                    i2 = i8;
                    shortcutMapper$mapContent$12 = shortcutMapper$mapContent$1;
                    i4 = i7;
                    g0s0 g0s0Var = (g0s0) obj;
                    if (g0s0Var != null) {
                        arrayList4.add(g0s0Var);
                    }
                    j6sVar2 = j6sVar3;
                    arrayList = arrayList4;
                    if (it.hasNext()) {
                        f0s0 f0s0Var = (f0s0) it.next();
                        shortcutMapper$mapContent$12.L$0 = azr0Var;
                        shortcutMapper$mapContent$12.L$1 = j6sVar2;
                        shortcutMapper$mapContent$12.L$2 = null;
                        shortcutMapper$mapContent$12.L$3 = null;
                        shortcutMapper$mapContent$12.L$4 = arrayList;
                        shortcutMapper$mapContent$12.L$5 = null;
                        shortcutMapper$mapContent$12.L$6 = it;
                        shortcutMapper$mapContent$12.L$7 = null;
                        shortcutMapper$mapContent$12.L$8 = null;
                        shortcutMapper$mapContent$12.L$9 = null;
                        shortcutMapper$mapContent$12.I$0 = i2;
                        shortcutMapper$mapContent$12.I$1 = i4;
                        shortcutMapper$mapContent$12.I$2 = i3;
                        shortcutMapper$mapContent$12.I$3 = 0;
                        shortcutMapper$mapContent$12.I$4 = 0;
                        shortcutMapper$mapContent$12.label = 1;
                        Object c = c(f0s0Var, j6sVar2, shortcutMapper$mapContent$12);
                        if (c == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ArrayList arrayList5 = arrayList;
                        j6sVar3 = j6sVar2;
                        obj = c;
                        arrayList4 = arrayList5;
                        g0s0 g0s0Var2 = (g0s0) obj;
                        if (g0s0Var2 != null) {
                        }
                        j6sVar2 = j6sVar3;
                        arrayList = arrayList4;
                        if (it.hasNext()) {
                            ArrayList arrayList6 = arrayList;
                            rh4 rh4Var = azr0Var.b;
                            return new bzr0(arrayList6, rh4Var != null ? this.d.a(rh4Var) : null, azr0Var.c);
                        }
                    }
                }
            }
        }
        shortcutMapper$mapContent$1 = new ShortcutMapper$mapContent$1(this, continuationImpl);
        Object obj2 = shortcutMapper$mapContent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shortcutMapper$mapContent$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(f0s0 f0s0Var, j6s j6sVar, ContinuationImpl continuationImpl) {
        ShortcutMapper$mapLayer$1 shortcutMapper$mapLayer$1;
        int i;
        Object a;
        n351 n351Var;
        if (continuationImpl instanceof ShortcutMapper$mapLayer$1) {
            shortcutMapper$mapLayer$1 = (ShortcutMapper$mapLayer$1) continuationImpl;
            int i2 = shortcutMapper$mapLayer$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                shortcutMapper$mapLayer$1.label = i2 - Integer.MIN_VALUE;
                Object obj = shortcutMapper$mapLayer$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shortcutMapper$mapLayer$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    h0s0 h0s0Var = f0s0Var.a;
                    shortcutMapper$mapLayer$1.L$0 = f0s0Var;
                    shortcutMapper$mapLayer$1.L$1 = null;
                    shortcutMapper$mapLayer$1.label = 1;
                    if (h0s0Var instanceof ksy0) {
                        a = this.a.a((ksy0) h0s0Var, j6sVar, shortcutMapper$mapLayer$1);
                        if (a != coroutineSingletons) {
                            a = (n351) a;
                        }
                    } else if (h0s0Var instanceof tdv) {
                        a = this.b.a((tdv) h0s0Var, shortcutMapper$mapLayer$1);
                        if (a != coroutineSingletons) {
                            a = (n351) a;
                        }
                    } else {
                        if (!(h0s0Var instanceof hjf0)) {
                            w511.b();
                            return null;
                        }
                        a = this.c.a((hjf0) h0s0Var, shortcutMapper$mapLayer$1);
                        if (a != coroutineSingletons) {
                            a = (n351) a;
                        }
                    }
                    obj = a;
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f0s0Var = (f0s0) shortcutMapper$mapLayer$1.L$0;
                    kotlin.b.b(obj);
                }
                n351Var = (n351) obj;
                if (n351Var != null) {
                    return null;
                }
                VerticalContentAlignment verticalContentAlignment = f0s0Var.b;
                uo5 uo5Var = x4c.y;
                int i3 = verticalContentAlignment == null ? -1 : n0s0.a[verticalContentAlignment.ordinal()];
                if (i3 != -1) {
                    if (i3 == 1) {
                        uo5Var = x4c.c;
                    } else if (i3 != 2) {
                        if (i3 != 3) {
                            w511.b();
                            return null;
                        }
                        uo5Var = x4c.B;
                    }
                }
                return new g0s0(n351Var, uo5Var);
            }
        }
        shortcutMapper$mapLayer$1 = new ShortcutMapper$mapLayer$1(this, continuationImpl);
        Object obj2 = shortcutMapper$mapLayer$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shortcutMapper$mapLayer$1.label;
        if (i != 0) {
        }
        n351Var = (n351) obj2;
        if (n351Var != null) {
        }
    }
}
