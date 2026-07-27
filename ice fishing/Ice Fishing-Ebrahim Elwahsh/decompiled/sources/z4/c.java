package z4;

import E7.l;
import b8.y;
import com.onesignal.common.modeling.g;
import com.onesignal.common.modeling.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import r7.AbstractC4973d;
import r7.AbstractC4979j;
import r7.AbstractC4981l;
import r7.q;
import r7.r;
import r7.t;

/* loaded from: classes2.dex */
public final class c implements e, g {
    public static final a Companion = new a(null);
    private static final Set<String> localFeatureOverrides = r.f40360n;
    private final com.onesignal.core.internal.config.c configModelStore;
    private volatile Map<z4.b, Boolean> featureStates;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends i implements l {
        public static final b INSTANCE = new b();

        public b() {
            super(1);
        }

        @Override // E7.l
        public final Boolean invoke(Map.Entry<? extends z4.b, Boolean> it) {
            h.e(it, "it");
            return it.getValue();
        }
    }

    /* renamed from: z4.c$c, reason: collision with other inner class name */
    public static final class C0258c extends i implements l {
        public static final C0258c INSTANCE = new C0258c();

        public C0258c() {
            super(1);
        }

        @Override // E7.l
        public final String invoke(Map.Entry<? extends z4.b, Boolean> it) {
            h.e(it, "it");
            return it.getKey().getKey();
        }
    }

    public c(com.onesignal.core.internal.config.c configModelStore) {
        h.e(configModelStore, "configModelStore");
        this.configModelStore = configModelStore;
        this.featureStates = q.f40359n;
        com.onesignal.debug.internal.logging.b.debug$default("OneSignal: FeatureManager initializing from cached config features", null, 2, null);
        try {
            refreshEnabledFeatures((com.onesignal.core.internal.config.b) configModelStore.getModel(), true);
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.error("OneSignal: Failed to initialize feature states from cached config", th);
        }
        this.configModelStore.subscribe((g) this);
    }

    private final void applySideEffects(z4.b bVar, boolean z8) {
        if (d.$EnumSwitchMapping$1[bVar.ordinal()] != 1) {
            return;
        }
        com.onesignal.common.threading.d.INSTANCE.updateUseBackgroundThreading(z8, "FeatureManager:" + bVar.getActivationMode());
    }

    private final String canonicalizeFeatureKey(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            sb.append(Character.toLowerCase(str.charAt(i)));
        }
        String sb2 = sb.toString();
        h.d(sb2, "toString(...)");
        return sb2;
    }

    private final void refreshEnabledFeatures(com.onesignal.core.internal.config.b bVar, boolean z8) {
        List<String> sdkRemoteFeatureFlags = bVar.getSdkRemoteFeatureFlags();
        ArrayList arrayList = new ArrayList(AbstractC4981l.E(sdkRemoteFeatureFlags, 10));
        Iterator<T> it = sdkRemoteFeatureFlags.iterator();
        while (it.hasNext()) {
            arrayList.add(canonicalizeFeatureKey((String) it.next()));
        }
        Set<String> set = localFeatureOverrides;
        ArrayList arrayList2 = new ArrayList(AbstractC4981l.E(set, 10));
        Iterator<T> it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList2.add(canonicalizeFeatureKey((String) it2.next()));
        }
        Set<String> V8 = AbstractC4979j.V(AbstractC4979j.N(arrayList, arrayList2));
        Set<String> set2 = localFeatureOverrides;
        if (!set2.isEmpty()) {
            com.onesignal.debug.internal.logging.b.warn$default("OneSignal: Local feature override enabled for testing only: " + set2, null, 2, null);
        }
        LinkedHashMap F8 = t.F(this.featureStates);
        AbstractC4973d abstractC4973d = (AbstractC4973d) z4.b.getEntries();
        abstractC4973d.getClass();
        Y7.g gVar = new Y7.g(6, abstractC4973d);
        while (gVar.hasNext()) {
            z4.b bVar2 = (z4.b) gVar.next();
            boolean isEnabledIn = bVar2.isEnabledIn(V8);
            int i = d.$EnumSwitchMapping$0[bVar2.getActivationMode().ordinal()];
            if (i == 1) {
                F8.put(bVar2, Boolean.valueOf(isEnabledIn));
                applySideEffects(bVar2, isEnabledIn);
            } else if (i == 2) {
                boolean containsKey = F8.containsKey(bVar2);
                if (z8 || !containsKey) {
                    F8.put(bVar2, Boolean.valueOf(isEnabledIn));
                    applySideEffects(bVar2, isEnabledIn);
                } else {
                    Boolean bool = (Boolean) F8.get(bVar2);
                    boolean booleanValue = bool != null ? bool.booleanValue() : false;
                    if (booleanValue != isEnabledIn) {
                        com.onesignal.debug.internal.logging.b.info$default("OneSignal: Feature " + bVar2.getKey() + " changed remotely to " + isEnabledIn + " but is NEXT_RUN, keeping current run value=" + booleanValue, null, 2, null);
                    }
                }
            }
        }
        this.featureStates = F8;
    }

    @Override // z4.e
    public List<String> enabledFeatureKeys() {
        Set<Map.Entry<z4.b, Boolean>> entrySet = this.featureStates.entrySet();
        h.e(entrySet, "<this>");
        L7.g gVar = new L7.g(2, entrySet);
        b predicate = b.INSTANCE;
        h.e(predicate, "predicate");
        L7.e eVar = new L7.e(gVar, predicate);
        C0258c transform = C0258c.INSTANCE;
        h.e(transform, "transform");
        return L7.i.u(new L7.e(eVar, transform));
    }

    @Override // z4.e
    public boolean isEnabled(z4.b feature) {
        h.e(feature, "feature");
        Boolean bool = this.featureStates.get(feature);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(j args, String tag) {
        h.e(args, "args");
        h.e(tag, "tag");
        if (h.a(args.getProperty(), "sdkRemoteFeatureFlags") || h.a(args.getProperty(), "sdkRemoteFeatureFlagMetadata")) {
            com.onesignal.debug.internal.logging.b.debug$default("OneSignal: FeatureManager.onModelUpdated(property=" + args.getProperty() + ", tag=" + tag + ')', null, 2, null);
            try {
                refreshEnabledFeatures((com.onesignal.core.internal.config.b) this.configModelStore.getModel(), false);
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.error("OneSignal: Failed to refresh features on model update", th);
            }
        }
    }

    @Override // z4.e
    public Map<String, y> remoteFeatureFlagMetadata() {
        String sdkRemoteFeatureFlagMetadata = ((com.onesignal.core.internal.config.b) this.configModelStore.getModel()).getSdkRemoteFeatureFlagMetadata();
        if (sdkRemoteFeatureFlagMetadata == null || M7.j.T(sdkRemoteFeatureFlagMetadata)) {
            return null;
        }
        return com.onesignal.core.internal.backend.impl.b.INSTANCE.parseStoredMetadataMap(sdkRemoteFeatureFlagMetadata);
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(com.onesignal.core.internal.config.b model, String tag) {
        h.e(model, "model");
        h.e(tag, "tag");
        com.onesignal.debug.internal.logging.b.debug$default("OneSignal: FeatureManager.onModelReplaced(tag=" + tag + ')', null, 2, null);
        if (tag.equals("HYDRATE") || tag.equals("NORMAL")) {
            try {
                refreshEnabledFeatures(model, false);
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.error("OneSignal: Failed to refresh features on model replace", th);
            }
        }
    }
}
