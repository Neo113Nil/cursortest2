package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.ui.platform.a;
import com.yandex.music.core.ui.compose.b;
import com.yandex.plus.core.analytics.logging.e;
import com.yandex.plus.core.reflect.NotTraversableField;
import com.yandex.plus.core.reflect.NotTraversableProperty;
import com.yandex.plus.home.feature.webviews.internal.stories.list.f;
import com.yandex.plus.home.feature.webviews.internal.stories.list.g;
import com.yandex.plus.home.feature.webviews.internal.stories.list.i;
import com.yandex.plus.home.feature.webviews.internal.stories.p;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.b1;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.z0;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.c;

/* loaded from: classes3.dex */
public final /* synthetic */ class qo1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qo1(int i, Object obj, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        int i = this.a;
        Continuation continuation = null;
        int i2 = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                jsk jskVar = (jsk) obj;
                jskVar.getClass();
                int i3 = 0;
                for (Object obj3 : (ArrayList) obj2) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        u75.n();
                        throw null;
                    }
                    jsk.g(jskVar, (ksk) obj3, i3 * i2, 0);
                    i3 = i4;
                }
                return Unit.a;
            case 1:
                iw1 iw1Var = (iw1) obj2;
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                xdr xdrVar = iw1Var.f;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                if (booleanValue) {
                    ssg.a(3, iw1Var.j(), "Control granted", null);
                    iw1Var.g();
                } else {
                    ssg.a(3, iw1Var.j(), "Control lost", null);
                    iw1Var.i();
                    iw1Var.c.a(i2, iw1Var.b);
                }
                return Unit.a;
            case 2:
                ehe eheVar = (ehe) obj;
                eheVar.getClass();
                ((khe) obj2).f(eheVar, i2);
                return Unit.a;
            case 3:
                hje hjeVar = (hje) obj2;
                jpa jpaVar = (jpa) obj;
                jpaVar.getClass();
                for (int i5 = 0; i5 < i2; i5++) {
                    jpa.D0(jpaVar, ((d85) ((fk0) hjeVar.g.get(i5)).e()).a, ((Number) ((fk0) hjeVar.h.get(i5)).e()).floatValue(), ((enj) ((fk0) hjeVar.i.get(i5)).e()).a, 0.0f, null, 0, 120);
                }
                return Unit.a;
            case 4:
                Function0 function0 = (Function0) obj2;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                if (booleanValue2) {
                    str = "track";
                } else {
                    knu[] knuVarArr = knu.a;
                    str = "wave_button";
                }
                yci yciVar = vci.a;
                yci f = b.b(a.a(yciVar, str), i2).f(booleanValue2 ? wyf.s(yciVar, function0) : yciVar);
                if (!booleanValue2) {
                    yciVar = androidx.compose.foundation.layout.a.o(yciVar, 0.0f, 16, 1);
                }
                return f.f(yciVar);
            case 5:
                m3m m3mVar = (m3m) obj2;
                j3m j3mVar = (j3m) obj;
                j3mVar.getClass();
                List list = j3mVar.b;
                if (i2 < 0 || i2 >= list.size()) {
                    return j3mVar;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.remove(i2);
                return j3m.b(j3mVar, arrayList, m3mVar.a(arrayList), 1);
            case 6:
                p7p p7pVar = (p7p) obj;
                p7pVar.getClass();
                ((g6p) obj2).Y(p7pVar, i2);
                return Unit.a;
            case 7:
                ((Context) obj).getClass();
                ImageView imageView = new ImageView((Context) obj2);
                imageView.setLayoutParams(new ViewGroup.LayoutParams(i2, i2));
                return imageView;
            case 8:
                ((Pair) obj).getClass();
                Set c = com.yandex.plus.core.reflect.b.c(i2, (Class) obj2);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : c) {
                    Field field = (Field) obj4;
                    Set set = com.yandex.plus.home.common.utils.reflection.a.a;
                    field.getClass();
                    if (!Modifier.isStatic(field.getModifiers()) && !field.isSynthetic()) {
                        String name = field.getName();
                        name.getClass();
                        if (!c.v(name, "shadow$", false) && !field.isAnnotationPresent(NotTraversableField.class) && !field.isAnnotationPresent(NotTraversableProperty.class)) {
                            arrayList2.add(obj4);
                        }
                    }
                }
                return CollectionsKt.A0(arrayList2);
            default:
                p pVar = (p) obj;
                i iVar = ((f) obj2).a;
                u0q storyNavigationSharedFlow = pVar != null ? pVar.getStoryNavigationSharedFlow() : null;
                iVar.getClass();
                com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
                String i6 = k5r.i(i2, "WebStories page selected = ");
                jyr jyrVar = e.a;
                e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, i6, null);
                rar rarVar = iVar.i;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                iVar.i = x97.y(iVar.l(), null, null, new com.yandex.plus.bdui.ui.b(storyNavigationSharedFlow, iVar, continuation, 28), 3);
                g gVar = (g) iVar.e;
                int i7 = iVar.h;
                b1 b1Var = b1.d;
                gVar.c(i7, false, b1Var, null);
                int i8 = iVar.h;
                if (i8 >= 0 && iVar.j != z0.b) {
                    if (i2 > i8) {
                        b1Var = b1.b;
                    } else if (i2 < i8) {
                        b1Var = b1.c;
                    }
                }
                iVar.h = i2;
                ((g) iVar.e).c(i2, true, b1Var, iVar.j);
                iVar.j = z0.b;
                return Unit.a;
        }
    }

    public /* synthetic */ qo1(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
