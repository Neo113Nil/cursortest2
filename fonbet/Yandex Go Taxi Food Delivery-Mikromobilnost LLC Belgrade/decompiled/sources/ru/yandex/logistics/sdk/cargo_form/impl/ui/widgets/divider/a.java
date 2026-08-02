package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.divider;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.an91;
import defpackage.crl;
import defpackage.drl;
import defpackage.frl;
import defpackage.irq0;
import defpackage.jrq0;
import defpackage.l690;
import defpackage.ny61;
import defpackage.q8s;
import defpackage.tcc;
import defpackage.w511;
import defpackage.y7m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.DividerStyle;

/* loaded from: classes5.dex */
public final class a {
    public final q8s a;

    public a(q8s q8sVar) {
        this.a = q8sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00d1 -> B:10:0x00d7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(frl frlVar, ContinuationImpl continuationImpl) {
        DividerMapper$map$1 dividerMapper$map$1;
        int i;
        DividerStyle dividerStyle;
        String str;
        y7m y7mVar;
        Collection arrayList;
        DividerStyle dividerStyle2;
        String str2;
        Iterator it;
        int i2;
        int i3;
        y7m y7mVar2;
        SeparateTitleModel$Align separateTitleModel$Align;
        frl frlVar2 = frlVar;
        if (continuationImpl instanceof DividerMapper$map$1) {
            dividerMapper$map$1 = (DividerMapper$map$1) continuationImpl;
            int i4 = dividerMapper$map$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                dividerMapper$map$1.label = i4 - Integer.MIN_VALUE;
                Object obj = dividerMapper$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dividerMapper$map$1.label;
                int i5 = 0;
                List list = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    DividerStyle dividerStyle3 = frlVar2.d;
                    String str3 = frlVar2.b;
                    y7m y7mVar3 = frlVar2.c != null ? new y7m(r6.intValue()) : null;
                    List list2 = frlVar2.e;
                    if (list2 == null) {
                        dividerStyle = dividerStyle3;
                        str = str3;
                        y7mVar = y7mVar3;
                        return new drl(dividerStyle, str, y7mVar, list, frlVar2.g == null ? new l690(r0.a, r0.c, r0.b, r0.d) : an91.b(8.0f, 0.0f, 2), frlVar2.f, frlVar2.a);
                    }
                    List list3 = list2;
                    arrayList = new ArrayList(tcc.n(list3, 10));
                    dividerStyle2 = dividerStyle3;
                    str2 = str3;
                    it = list3.iterator();
                    i2 = 0;
                    i3 = 0;
                    y7mVar2 = y7mVar3;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i6 = dividerMapper$map$1.I$1;
                    int i7 = dividerMapper$map$1.I$0;
                    arrayList = (Collection) dividerMapper$map$1.L$10;
                    y7mVar2 = (y7m) dividerMapper$map$1.L$9;
                    str2 = (String) dividerMapper$map$1.L$8;
                    dividerStyle2 = (DividerStyle) dividerMapper$map$1.L$7;
                    irq0 irq0Var = (irq0) dividerMapper$map$1.L$6;
                    it = (Iterator) dividerMapper$map$1.L$4;
                    Collection collection = (Collection) dividerMapper$map$1.L$3;
                    frl frlVar3 = (frl) dividerMapper$map$1.L$0;
                    kotlin.b.b(obj);
                    Collection collection2 = collection;
                    int i8 = i7;
                    DividerMapper$map$1 dividerMapper$map$12 = dividerMapper$map$1;
                    int i9 = i6;
                    frlVar2 = frlVar3;
                    int i10 = 1;
                    CharSequence charSequence = (CharSequence) obj;
                    int i11 = crl.a[irq0Var.b.ordinal()];
                    if (i11 == i10) {
                        separateTitleModel$Align = SeparateTitleModel$Align.START;
                    } else if (i11 == 2) {
                        separateTitleModel$Align = SeparateTitleModel$Align.CENTER;
                    } else {
                        if (i11 != 3) {
                            w511.b();
                            return null;
                        }
                        separateTitleModel$Align = SeparateTitleModel$Align.END;
                    }
                    arrayList.add(new jrq0(charSequence, separateTitleModel$Align));
                    i2 = i9;
                    dividerMapper$map$1 = dividerMapper$map$12;
                    i3 = i8;
                    arrayList = collection2;
                    i5 = 0;
                    if (it.hasNext()) {
                        irq0Var = (irq0) it.next();
                        FormattedText formattedText = irq0Var.a;
                        dividerMapper$map$1.L$0 = frlVar2;
                        dividerMapper$map$1.L$1 = null;
                        dividerMapper$map$1.L$2 = null;
                        dividerMapper$map$1.L$3 = arrayList;
                        dividerMapper$map$1.L$4 = it;
                        dividerMapper$map$1.L$5 = null;
                        dividerMapper$map$1.L$6 = irq0Var;
                        dividerMapper$map$1.L$7 = dividerStyle2;
                        dividerMapper$map$1.L$8 = str2;
                        dividerMapper$map$1.L$9 = y7mVar2;
                        dividerMapper$map$1.L$10 = arrayList;
                        dividerMapper$map$1.I$0 = i3;
                        dividerMapper$map$1.I$1 = i2;
                        dividerMapper$map$1.I$2 = i5;
                        i10 = 1;
                        dividerMapper$map$1.label = 1;
                        Object a = this.a.a(formattedText, dividerMapper$map$1);
                        if (a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        DividerMapper$map$1 dividerMapper$map$13 = dividerMapper$map$1;
                        i9 = i2;
                        obj = a;
                        i8 = i3;
                        dividerMapper$map$12 = dividerMapper$map$13;
                        collection2 = arrayList;
                        CharSequence charSequence2 = (CharSequence) obj;
                        int i112 = crl.a[irq0Var.b.ordinal()];
                        if (i112 == i10) {
                        }
                        arrayList.add(new jrq0(charSequence2, separateTitleModel$Align));
                        i2 = i9;
                        dividerMapper$map$1 = dividerMapper$map$12;
                        i3 = i8;
                        arrayList = collection2;
                        i5 = 0;
                        if (it.hasNext()) {
                            list = (List) arrayList;
                            y7mVar = y7mVar2;
                            str = str2;
                            dividerStyle = dividerStyle2;
                            return new drl(dividerStyle, str, y7mVar, list, frlVar2.g == null ? new l690(r0.a, r0.c, r0.b, r0.d) : an91.b(8.0f, 0.0f, 2), frlVar2.f, frlVar2.a);
                        }
                    }
                }
            }
        }
        dividerMapper$map$1 = new DividerMapper$map$1(this, continuationImpl);
        Object obj2 = dividerMapper$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dividerMapper$map$1.label;
        int i52 = 0;
        List list4 = null;
        if (i != 0) {
        }
    }
}
