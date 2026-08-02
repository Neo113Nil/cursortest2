package com.yandex.plus.bdui.plus.checkout.div;

import android.view.View;
import android.widget.TextView;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.n1;
import com.yandex.plus.divkit.impl.n;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.h;
import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.uah;
import defpackage.x3f;
import defpackage.xq0;
import defpackage.y7k;
import defpackage.z7o;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class b extends aur implements Function2 {
    public TextView j;
    public int k;
    public final /* synthetic */ View l;
    public final /* synthetic */ c m;
    public final /* synthetic */ com.yandex.plus.divkit.api.c n;
    public final /* synthetic */ n o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view, c cVar, com.yandex.plus.divkit.api.c cVar2, n nVar, Continuation continuation) {
        super(2, continuation);
        this.l = view;
        this.m = cVar;
        this.n = cVar2;
        this.o = nVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.l, this.m, this.n, this.o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [t7o] */
    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        TextView textView;
        Object t7oVar;
        Object a;
        m1 t7oVar2;
        c cVar = this.m;
        x3f x3fVar = cVar.e;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            View view = this.l;
            textView = view instanceof TextView ? (TextView) view : null;
            if (textView == null) {
                xq0.q("Expected view to be TextView");
                return null;
            }
            Set set = c.g;
            JSONObject jSONObject = this.n.b;
            if (jSONObject == null) {
                xq0.q("Expected custom_props for DecoratedText custom view");
                return null;
            }
            try {
                r7o r7oVar = z7o.b;
                t7oVar = Boolean.valueOf(jSONObject.getBoolean("use_native_web_launcher"));
            } catch (Throwable th) {
                r7o r7oVar2 = z7o.b;
                t7oVar = new t7o(th);
            }
            if (t7oVar instanceof t7o) {
                t7oVar = null;
            }
            Boolean bool = (Boolean) t7oVar;
            n nVar = this.o;
            Map map = (Map) n.a(nVar, jSONObject, "text", new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, new com.yandex.plus.divkit.utils.c(nVar.a, (y7k) nVar.c.getValue(), "text"), com.yandex.plus.divkit.utils.c.class, "anyToDict", "anyToDict(Ljava/lang/Object;)Ljava/util/Map;", 0, 8), com.yandex.plus.divkit.utils.c.d, 48);
            Map o = map != null ? uah.o(map) : null;
            if (o != null) {
                String c = x3fVar.c(com.yandex.plus.core.serialization.kotlin.kserializer.a.a, o);
                try {
                    x3fVar.getClass();
                    t7oVar2 = (m1) x3fVar.b(m1.Companion.serializer(), c);
                } catch (Throwable th2) {
                    r7o r7oVar3 = z7o.b;
                    t7oVar2 = new t7o(th2);
                }
                Throwable a2 = z7o.a(t7oVar2);
                if (a2 != null) {
                    com.yandex.plus.log.api.b bVar = cVar.d;
                    com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
                    if (bVar.b(aVar)) {
                        bVar.a(aVar, "PlusPayDivKitDecoratedTextAdapter", "Failed to parse text", a2);
                    }
                }
                r6 = t7oVar2 instanceof t7o ? null : t7oVar2;
            }
            PlusPayRichText a3 = r6 != null ? n1.a(r6) : PlusPayRichText.INSTANCE.empty();
            com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d dVar = cVar.b;
            com.yandex.plus.bdui.plus.c cVar2 = new com.yandex.plus.bdui.plus.c(1, cVar, bool, jSONObject);
            this.j = textView;
            this.k = 1;
            a = ((h) dVar).a(a3, cVar2, this);
            if (a == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            TextView textView2 = this.j;
            qgg.h0(obj);
            textView = textView2;
            a = obj;
        }
        textView.setText((CharSequence) a);
        return Unit.a;
    }
}
