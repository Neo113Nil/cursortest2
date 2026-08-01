package com.onesignal.common.modeling;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import u7.v;
import v7.AbstractC5129j;

/* loaded from: classes2.dex */
public abstract class k implements com.onesignal.common.events.d, com.onesignal.common.modeling.c, com.onesignal.common.modeling.a {
    private final J4.b _prefs;
    private final com.onesignal.common.events.b changeSubscription;
    private boolean hasLoadedFromCache;
    private final List<i> models;
    private final String name;

    public static final class a extends kotlin.jvm.internal.i implements I7.l {
        final /* synthetic */ i $model;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, String str) {
            super(1);
            this.$model = iVar;
            this.$tag = str;
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.common.modeling.d) obj);
            return v.f41353a;
        }

        public final void invoke(com.onesignal.common.modeling.d it) {
            kotlin.jvm.internal.h.e(it, "it");
            it.onModelAdded(this.$model, this.$tag);
        }
    }

    public static final class b extends kotlin.jvm.internal.i implements I7.l {
        final /* synthetic */ i $item;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar, String str) {
            super(1);
            this.$item = iVar;
            this.$tag = str;
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.common.modeling.d) obj);
            return v.f41353a;
        }

        public final void invoke(com.onesignal.common.modeling.d it) {
            kotlin.jvm.internal.h.e(it, "it");
            it.onModelRemoved(this.$item, this.$tag);
        }
    }

    public static final class c extends kotlin.jvm.internal.i implements I7.l {
        final /* synthetic */ j $args;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(j jVar, String str) {
            super(1);
            this.$args = jVar;
            this.$tag = str;
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.common.modeling.d) obj);
            return v.f41353a;
        }

        public final void invoke(com.onesignal.common.modeling.d it) {
            kotlin.jvm.internal.h.e(it, "it");
            it.onModelUpdated(this.$args, this.$tag);
        }
    }

    public static final class d extends kotlin.jvm.internal.i implements I7.l {
        final /* synthetic */ i $model;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(i iVar, String str) {
            super(1);
            this.$model = iVar;
            this.$tag = str;
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.common.modeling.d) obj);
            return v.f41353a;
        }

        public final void invoke(com.onesignal.common.modeling.d it) {
            kotlin.jvm.internal.h.e(it, "it");
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
                iVar.subscribe((com.onesignal.common.modeling.a) this);
                persist();
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
            iVar.unsubscribe((com.onesignal.common.modeling.a) this);
            persist();
        }
        this.changeSubscription.fire(new d(iVar, str));
    }

    @Override // com.onesignal.common.modeling.c
    public void add(i model, String tag) {
        Object obj;
        kotlin.jvm.internal.h.e(model, "model");
        kotlin.jvm.internal.h.e(tag, "tag");
        synchronized (this.models) {
            try {
                Iterator<T> it = this.models.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (kotlin.jvm.internal.h.a(((i) obj).getId(), model.getId())) {
                            break;
                        }
                    }
                }
                i iVar = (i) obj;
                if (iVar != null) {
                    removeItem(iVar, tag);
                }
                addItem$default(this, model, tag, null, 4, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.onesignal.common.modeling.c
    public void clear(String tag) {
        kotlin.jvm.internal.h.e(tag, "tag");
        List<i> L6 = AbstractC5129j.L(this.models);
        synchronized (this.models) {
            this.models.clear();
            persist();
        }
        for (i iVar : L6) {
            iVar.unsubscribe((com.onesignal.common.modeling.a) this);
            this.changeSubscription.fire(new b(iVar, tag));
        }
    }

    @Override // com.onesignal.common.modeling.c
    public abstract /* synthetic */ i create(JSONObject jSONObject);

    @Override // com.onesignal.common.modeling.c
    public i get(String id) {
        Object obj;
        kotlin.jvm.internal.h.e(id, "id");
        Iterator<T> it = this.models.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.h.a(((i) obj).getId(), id)) {
                break;
            }
        }
        return (i) obj;
    }

    @Override // com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.changeSubscription.getHasSubscribers();
    }

    public final String getName() {
        return this.name;
    }

    @Override // com.onesignal.common.modeling.c
    public Collection<i> list() {
        List L6;
        synchronized (this.models) {
            L6 = AbstractC5129j.L(this.models);
        }
        return L6;
    }

    public final void load() {
        J4.b bVar;
        if (this.name == null || (bVar = this._prefs) == null) {
            return;
        }
        JSONArray jSONArray = new JSONArray(bVar.getString(com.onesignal.common.threading.b.BASE_THREAD_NAME, "MODEL_STORE_" + this.name, "[]"));
        synchronized (this.models) {
            try {
                boolean isEmpty = this.models.isEmpty();
                for (int length = jSONArray.length() - 1; -1 < length; length--) {
                    i create = create(jSONArray.getJSONObject(length));
                    if (create != null) {
                        List<i> list = this.models;
                        if (list == null || !list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                if (kotlin.jvm.internal.h.a(((i) it.next()).getId(), create.getId())) {
                                    com.onesignal.debug.internal.logging.b.debug$default("ModelStore<" + this.name + ">: load - operation.id: " + create.getId() + " already exists in the store.", null, 2, null);
                                    break;
                                }
                            }
                        }
                        this.models.add(0, create);
                        create.subscribe((com.onesignal.common.modeling.a) this);
                    }
                }
                this.hasLoadedFromCache = true;
                if (!isEmpty) {
                    persist();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.onesignal.common.modeling.a
    public void onChanged(j args, String tag) {
        kotlin.jvm.internal.h.e(args, "args");
        kotlin.jvm.internal.h.e(tag, "tag");
        persist();
        this.changeSubscription.fire(new c(args, tag));
    }

    public final void persist() {
        if (this.name == null || this._prefs == null || !this.hasLoadedFromCache) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        synchronized (this.models) {
            for (i iVar : this.models) {
                jSONArray.put(transformJsonForPersistence(iVar, iVar.toJSON()));
            }
        }
        this._prefs.saveString(com.onesignal.common.threading.b.BASE_THREAD_NAME, "MODEL_STORE_" + this.name, jSONArray.toString());
    }

    @Override // com.onesignal.common.modeling.c
    public void remove(String id, String tag) {
        Object obj;
        kotlin.jvm.internal.h.e(id, "id");
        kotlin.jvm.internal.h.e(tag, "tag");
        synchronized (this.models) {
            try {
                Iterator<T> it = this.models.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (kotlin.jvm.internal.h.a(((i) obj).getId(), id)) {
                            break;
                        }
                    }
                }
                i iVar = (i) obj;
                if (iVar == null) {
                    return;
                }
                removeItem(iVar, tag);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void replaceAll(List<i> models, String tag) {
        kotlin.jvm.internal.h.e(models, "models");
        kotlin.jvm.internal.h.e(tag, "tag");
        synchronized (models) {
            clear(tag);
            Iterator<i> it = models.iterator();
            while (it.hasNext()) {
                add(it.next(), tag);
            }
        }
    }

    public JSONObject transformJsonForPersistence(i model, JSONObject json) {
        kotlin.jvm.internal.h.e(model, "model");
        kotlin.jvm.internal.h.e(json, "json");
        return json;
    }

    public k(String str, J4.b bVar) {
        this.name = str;
        this._prefs = bVar;
        this.changeSubscription = new com.onesignal.common.events.b();
        this.models = new ArrayList();
    }

    @Override // com.onesignal.common.events.d
    public void subscribe(com.onesignal.common.modeling.d handler) {
        kotlin.jvm.internal.h.e(handler, "handler");
        this.changeSubscription.subscribe(handler);
    }

    @Override // com.onesignal.common.events.d
    public void unsubscribe(com.onesignal.common.modeling.d handler) {
        kotlin.jvm.internal.h.e(handler, "handler");
        this.changeSubscription.unsubscribe(handler);
    }

    public /* synthetic */ k(String str, J4.b bVar, int i, kotlin.jvm.internal.e eVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bVar);
    }

    @Override // com.onesignal.common.modeling.c
    public void add(int i, i model, String tag) {
        Object obj;
        kotlin.jvm.internal.h.e(model, "model");
        kotlin.jvm.internal.h.e(tag, "tag");
        synchronized (this.models) {
            try {
                Iterator<T> it = this.models.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (kotlin.jvm.internal.h.a(((i) obj).getId(), model.getId())) {
                            break;
                        }
                    }
                }
                i iVar = (i) obj;
                if (iVar != null) {
                    removeItem(iVar, tag);
                }
                addItem(model, tag, Integer.valueOf(i));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
