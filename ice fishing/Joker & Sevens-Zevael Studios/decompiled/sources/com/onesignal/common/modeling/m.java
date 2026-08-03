package com.onesignal.common.modeling;

import ac.o;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class m implements f, d {
    private final com.onesignal.common.events.b changeSubscription;
    private final Object replaceLock;
    private final String singletonId;
    private final k store;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends pc.k implements oc.c {
        final /* synthetic */ j $args;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, String str) {
            super(1);
            this.$args = jVar;
            this.$tag = str;
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((g) obj);
            return o.f277a;
        }

        public final void invoke(g gVar) {
            pc.j.e(gVar, "it");
            gVar.onModelUpdated(this.$args, this.$tag);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends pc.k implements oc.c {
        final /* synthetic */ i $existingModel;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar, String str) {
            super(1);
            this.$existingModel = iVar;
            this.$tag = str;
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((g) obj);
            return o.f277a;
        }

        public final void invoke(g gVar) {
            pc.j.e(gVar, "it");
            gVar.onModelReplaced(this.$existingModel, this.$tag);
        }
    }

    public m(k kVar) {
        pc.j.e(kVar, "store");
        this.store = kVar;
        this.changeSubscription = new com.onesignal.common.events.b();
        this.singletonId = "-singleton-";
        this.replaceLock = new Object();
        kVar.subscribe((d) this);
    }

    @Override // com.onesignal.common.modeling.f, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.changeSubscription.getHasSubscribers();
    }

    @Override // com.onesignal.common.modeling.f
    public i getModel() {
        synchronized (this) {
            i iVar = this.store.get(this.singletonId);
            if (iVar != null) {
                return iVar;
            }
            i create$default = com.onesignal.common.modeling.b.create$default(this.store, null, 1, null);
            if (create$default != null) {
                create$default.setId(this.singletonId);
                com.onesignal.common.modeling.b.add$default(this.store, create$default, null, 2, null);
                return create$default;
            }
            throw new Exception("Unable to initialize model from store " + this.store);
        }
    }

    public final k getStore() {
        return this.store;
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelAdded(i iVar, String str) {
        pc.j.e(iVar, "model");
        pc.j.e(str, "tag");
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelRemoved(i iVar, String str) {
        pc.j.e(iVar, "model");
        pc.j.e(str, "tag");
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelUpdated(j jVar, String str) {
        pc.j.e(jVar, "args");
        pc.j.e(str, "tag");
        this.changeSubscription.fire(new a(jVar, str));
    }

    @Override // com.onesignal.common.modeling.f
    public void replace(i iVar, String str) {
        pc.j.e(iVar, "model");
        pc.j.e(str, "tag");
        synchronized (this.replaceLock) {
            i model = getModel();
            model.initializeFromModel(this.singletonId, iVar);
            this.store.persist();
            this.changeSubscription.fire(new b(model, str));
        }
    }

    @Override // com.onesignal.common.modeling.f, com.onesignal.common.events.d
    public void subscribe(g gVar) {
        pc.j.e(gVar, "handler");
        this.changeSubscription.subscribe(gVar);
    }

    @Override // com.onesignal.common.modeling.f, com.onesignal.common.events.d
    public void unsubscribe(g gVar) {
        pc.j.e(gVar, "handler");
        this.changeSubscription.unsubscribe(gVar);
    }
}
