package ru.yandex.taxi.requirements.glued.ui.image;

import android.graphics.Bitmap;
import defpackage.gw00;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.u58;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lu58;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.requirements.glued.ui.image.DefaultCarImageBinder$mapOptionsForRender$2", f = "DefaultCarImageBinder.kt", l = {188}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class DefaultCarImageBinder$mapOptionsForRender$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<Pair<String, String>> $options;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultCarImageBinder$mapOptionsForRender$2(List list, i iVar, Continuation continuation) {
        super(2, continuation);
        this.$options = list;
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DefaultCarImageBinder$mapOptionsForRender$2 defaultCarImageBinder$mapOptionsForRender$2 = new DefaultCarImageBinder$mapOptionsForRender$2(this.$options, this.this$0, continuation);
        defaultCarImageBinder$mapOptionsForRender$2.L$0 = obj;
        return defaultCarImageBinder$mapOptionsForRender$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultCarImageBinder$mapOptionsForRender$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00db, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00d4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00cd -> B:5:0x00d0). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Map linkedHashMap;
        Iterator it;
        Collection collection;
        u58 u58Var;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List<Pair<String, String>> list = this.$options;
            i iVar = this.this$0;
            int d = gw00.d(tcc.n(list, 10));
            if (d < 16) {
                d = 16;
            }
            linkedHashMap = new LinkedHashMap(d);
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                Pair pair = (Pair) it2.next();
                Pair pair2 = new Pair((String) pair.c(), tje.h(tseVar, null, null, new DefaultCarImageBinder$mapOptionsForRender$2$optionImages$1$1(iVar, pair, null), 3));
                linkedHashMap.put(pair2.c(), pair2.f());
            }
            List<Pair<String, String>> list2 = this.$options;
            ArrayList arrayList = new ArrayList();
            it = list2.iterator();
            collection = arrayList;
            if (!it.hasNext()) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str = (String) this.L$10;
            it = (Iterator) this.L$6;
            collection = (Collection) this.L$4;
            linkedHashMap = (Map) this.L$1;
            kotlin.b.b(obj);
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                u58Var = new u58(bitmap, str);
                if (u58Var != null) {
                    collection.add(u58Var);
                }
                if (!it.hasNext()) {
                    return (List) collection;
                }
                str = (String) ((Pair) it.next()).c();
                noh nohVar = (noh) linkedHashMap.get(str);
                if (nohVar != null) {
                    this.L$0 = null;
                    this.L$1 = linkedHashMap;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = collection;
                    this.L$5 = null;
                    this.L$6 = it;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.L$9 = null;
                    this.L$10 = str;
                    this.label = 1;
                    obj = nohVar.k(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    Bitmap bitmap2 = (Bitmap) obj;
                    if (bitmap2 != null) {
                    }
                }
            }
            u58Var = null;
            if (u58Var != null) {
            }
            if (!it.hasNext()) {
            }
        }
    }
}
