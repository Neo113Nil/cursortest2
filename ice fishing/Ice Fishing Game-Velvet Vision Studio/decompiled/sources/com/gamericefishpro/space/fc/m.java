package com.gamericefishpro.space.fc;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class m implements f, d {
    private final com.gamericefishpro.space.dc.b changeSubscription;
    private final Object replaceLock;
    private final String singletonId;
    private final k store;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends com.gamericefishpro.space.ei.l implements Function1 {
        final /* synthetic */ j $args;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, String str) {
            super(1);
            this.$args = jVar;
            this.$tag = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((g) obj);
            return Unit.a;
        }

        public final void invoke(g it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onModelUpdated(this.$args, this.$tag);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends com.gamericefishpro.space.ei.l implements Function1 {
        final /* synthetic */ i $existingModel;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar, String str) {
            super(1);
            this.$existingModel = iVar;
            this.$tag = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((g) obj);
            return Unit.a;
        }

        public final void invoke(g it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onModelReplaced(this.$existingModel, this.$tag);
        }
    }

    public m(k store) {
        Intrinsics.checkNotNullParameter(store, "store");
        this.store = store;
        this.changeSubscription = new com.gamericefishpro.space.dc.b();
        this.singletonId = "-singleton-";
        this.replaceLock = new Object();
        store.subscribe((d) this);
    }

    @Override // com.gamericefishpro.space.fc.f, com.gamericefishpro.space.dc.d
    public boolean getHasSubscribers() {
        return this.changeSubscription.getHasSubscribers();
    }

    @Override // com.gamericefishpro.space.fc.f
    public i getModel() {
        synchronized (this) {
            i iVar = this.store.get(this.singletonId);
            if (iVar != null) {
                return iVar;
            }
            i iVarCreate$default = com.gamericefishpro.space.fc.b.create$default(this.store, null, 1, null);
            if (iVarCreate$default != null) {
                iVarCreate$default.setId(this.singletonId);
                com.gamericefishpro.space.fc.b.add$default(this.store, iVarCreate$default, null, 2, null);
                return iVarCreate$default;
            }
            throw new Exception("Unable to initialize model from store " + this.store);
        }
    }

    public final k getStore() {
        return this.store;
    }

    @Override // com.gamericefishpro.space.fc.d
    public void onModelAdded(i model, String tag) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
    }

    @Override // com.gamericefishpro.space.fc.d
    public void onModelRemoved(i model, String tag) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
    }

    @Override // com.gamericefishpro.space.fc.d
    public void onModelUpdated(j args, String tag) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.changeSubscription.fire(new a(args, tag));
    }

    @Override // com.gamericefishpro.space.fc.f
    public void replace(i model, String tag) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        synchronized (this.replaceLock) {
            i model2 = getModel();
            model2.initializeFromModel(this.singletonId, model);
            this.store.persist();
            this.changeSubscription.fire(new b(model2, tag));
            Unit unit = Unit.a;
        }
    }

    @Override // com.gamericefishpro.space.fc.f, com.gamericefishpro.space.dc.d
    public void subscribe(g handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.changeSubscription.subscribe(handler);
    }

    @Override // com.gamericefishpro.space.fc.f, com.gamericefishpro.space.dc.d
    public void unsubscribe(g handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.changeSubscription.unsubscribe(handler);
    }
}
