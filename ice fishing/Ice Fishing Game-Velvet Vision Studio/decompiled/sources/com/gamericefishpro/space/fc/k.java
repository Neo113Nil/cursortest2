package com.gamericefishpro.space.fc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k implements com.gamericefishpro.space.dc.d, com.gamericefishpro.space.fc.c, com.gamericefishpro.space.fc.a {
    private final com.gamericefishpro.space.gd.b _prefs;
    private final com.gamericefishpro.space.dc.b changeSubscription;
    private boolean hasLoadedFromCache;
    private final List<i> models;
    private final String name;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends com.gamericefishpro.space.ei.l implements Function1 {
        final /* synthetic */ i $model;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, String str) {
            super(1);
            this.$model = iVar;
            this.$tag = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.gamericefishpro.space.fc.d) obj);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.fc.d it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onModelAdded(this.$model, this.$tag);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends com.gamericefishpro.space.ei.l implements Function1 {
        final /* synthetic */ i $item;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar, String str) {
            super(1);
            this.$item = iVar;
            this.$tag = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.gamericefishpro.space.fc.d) obj);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.fc.d it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onModelRemoved(this.$item, this.$tag);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class c extends com.gamericefishpro.space.ei.l implements Function1 {
        final /* synthetic */ j $args;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(j jVar, String str) {
            super(1);
            this.$args = jVar;
            this.$tag = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.gamericefishpro.space.fc.d) obj);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.fc.d it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onModelUpdated(this.$args, this.$tag);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class d extends com.gamericefishpro.space.ei.l implements Function1 {
        final /* synthetic */ i $model;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(i iVar, String str) {
            super(1);
            this.$model = iVar;
            this.$tag = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.gamericefishpro.space.fc.d) obj);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.fc.d it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onModelRemoved(this.$model, this.$tag);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final void addItem(i iVar, String str, Integer num) {
        synchronized (this.models) {
            try {
                if (num != null) {
                    this.models.add(num.intValue(), iVar);
                } else {
                    this.models.add(iVar);
                }
                iVar.subscribe((com.gamericefishpro.space.fc.a) this);
                persist();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.changeSubscription.fire(new a(iVar, str));
    }

    public static /* synthetic */ void addItem$default(k kVar, i iVar, String str, Integer num, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addItem");
        }
        if ((i & 4) != 0) {
            num = null;
        }
        kVar.addItem(iVar, str, num);
    }

    private final void removeItem(i iVar, String str) {
        synchronized (this.models) {
            this.models.remove(iVar);
            iVar.unsubscribe((com.gamericefishpro.space.fc.a) this);
            persist();
            Unit unit = Unit.a;
        }
        this.changeSubscription.fire(new d(iVar, str));
    }

    @Override // com.gamericefishpro.space.fc.c
    public void add(i model, String tag) {
        Object next;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        synchronized (this.models) {
            try {
                Iterator<T> it = this.models.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.a(((i) next).getId(), model.getId()));
                i iVar = (i) next;
                if (iVar != null) {
                    removeItem(iVar, tag);
                }
                addItem$default(this, model, tag, null, 4, null);
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.gamericefishpro.space.fc.c
    public void clear(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        List<i> listL = CollectionsKt.L(this.models);
        synchronized (this.models) {
            this.models.clear();
            persist();
            Unit unit = Unit.a;
        }
        for (i iVar : listL) {
            iVar.unsubscribe((com.gamericefishpro.space.fc.a) this);
            this.changeSubscription.fire(new b(iVar, tag));
        }
    }

    public abstract /* synthetic */ i create(JSONObject jSONObject);

    @Override // com.gamericefishpro.space.fc.c
    public i get(String id) {
        Object next;
        Intrinsics.checkNotNullParameter(id, "id");
        Iterator<T> it = this.models.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.a(((i) next).getId(), id)) {
                return (i) next;
            }
        }
        next = null;
        return (i) next;
    }

    @Override // com.gamericefishpro.space.dc.d
    public boolean getHasSubscribers() {
        return this.changeSubscription.getHasSubscribers();
    }

    public final String getName() {
        return this.name;
    }

    @Override // com.gamericefishpro.space.fc.c
    public Collection<i> list() {
        List listL;
        synchronized (this.models) {
            listL = CollectionsKt.L(this.models);
        }
        return listL;
    }

    public final void load() {
        com.gamericefishpro.space.gd.b bVar;
        if (this.name == null || (bVar = this._prefs) == null) {
            return;
        }
        JSONArray jSONArray = new JSONArray(bVar.getString("OneSignal", "MODEL_STORE_" + this.name, "[]"));
        synchronized (this.models) {
            try {
                boolean zIsEmpty = this.models.isEmpty();
                for (int length = jSONArray.length() - 1; -1 < length; length--) {
                    i iVarCreate = create(jSONArray.getJSONObject(length));
                    if (iVarCreate != null) {
                        List<i> list = this.models;
                        if (list == null || !list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (Intrinsics.a(((i) it.next()).getId(), iVarCreate.getId())) {
                                        com.gamericefishpro.space.od.b.debug$default("ModelStore<" + this.name + ">: load - operation.id: " + iVarCreate.getId() + " already exists in the store.", null, 2, null);
                                        break;
                                    }
                                }
                            }
                        }
                        this.models.add(0, iVarCreate);
                        iVarCreate.subscribe((com.gamericefishpro.space.fc.a) this);
                        break;
                    }
                }
                this.hasLoadedFromCache = true;
                if (!zIsEmpty) {
                    persist();
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.gamericefishpro.space.fc.a
    public void onChanged(j args, String tag) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(tag, "tag");
        persist();
        this.changeSubscription.fire(new c(args, tag));
    }

    public final void persist() {
        if (this.name == null || this._prefs == null || !this.hasLoadedFromCache) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        synchronized (this.models) {
            try {
                Iterator<i> it = this.models.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().toJSON());
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this._prefs.saveString("OneSignal", "MODEL_STORE_" + this.name, jSONArray.toString());
    }

    @Override // com.gamericefishpro.space.fc.c
    public void remove(String id, String tag) {
        Object next;
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(tag, "tag");
        synchronized (this.models) {
            try {
                Iterator<T> it = this.models.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.a(((i) next).getId(), id));
                i iVar = (i) next;
                if (iVar == null) {
                    return;
                }
                removeItem(iVar, tag);
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.gamericefishpro.space.fc.c
    public void replaceAll(List<i> models, String tag) {
        Intrinsics.checkNotNullParameter(models, "models");
        Intrinsics.checkNotNullParameter(tag, "tag");
        synchronized (models) {
            try {
                clear(tag);
                Iterator<i> it = models.iterator();
                while (it.hasNext()) {
                    add(it.next(), tag);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public k(String str, com.gamericefishpro.space.gd.b bVar) {
        this.name = str;
        this._prefs = bVar;
        this.changeSubscription = new com.gamericefishpro.space.dc.b();
        this.models = new ArrayList();
    }

    @Override // com.gamericefishpro.space.dc.d
    public void subscribe(com.gamericefishpro.space.fc.d handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.changeSubscription.subscribe(handler);
    }

    @Override // com.gamericefishpro.space.dc.d
    public void unsubscribe(com.gamericefishpro.space.fc.d handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.changeSubscription.unsubscribe(handler);
    }

    public /* synthetic */ k(String str, com.gamericefishpro.space.gd.b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bVar);
    }

    @Override // com.gamericefishpro.space.fc.c
    public void add(int i, i model, String tag) {
        Object next;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        synchronized (this.models) {
            try {
                Iterator<T> it = this.models.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.a(((i) next).getId(), model.getId()));
                i iVar = (i) next;
                if (iVar != null) {
                    removeItem(iVar, tag);
                }
                addItem(model, tag, Integer.valueOf(i));
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
