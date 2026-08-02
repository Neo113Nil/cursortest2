package D4;

import I7.l;
import com.onesignal.common.modeling.g;
import com.onesignal.common.modeling.j;
import f8.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import v7.AbstractC5113d;
import v7.AbstractC5119j;
import v7.AbstractC5121l;
import v7.q;
import v7.r;
import v7.t;

/* loaded from: classes2.dex */
public final class c implements e, g {
    public static final a Companion = new a(null);
    private static final Set<String> localFeatureOverrides = r.f41223n;
    private final com.onesignal.core.internal.config.c configModelStore;
    private volatile Map<D4.b, Boolean> featureStates;

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

        @Override // I7.l
        public final Boolean invoke(Map.Entry<? extends D4.b, Boolean> it) {
            h.e(it, "it");
            return it.getValue();
        }
    }

    /* renamed from: D4.c$c, reason: collision with other inner class name */
    public static final class C0000c extends i implements l {
        public static final C0000c INSTANCE = new C0000c();

        public C0000c() {
            super(1);
        }

        @Override // I7.l
        public final String invoke(Map.Entry<? extends D4.b, Boolean> it) {
            h.e(it, "it");
            return it.getKey().getKey();
        }
    }

    public c(com.onesignal.core.internal.config.c configModelStore) {
        h.e(configModelStore, "configModelStore");
        this.configModelStore = configModelStore;
        this.featureStates = q.f41222n;
        com.onesignal.debug.internal.logging.b.debug$default("OneSignal: FeatureManager initializing from cached config features", null, 2, null);
        try {
            refreshEnabledFeatures((com.onesignal.core.internal.config.b) configModelStore.getModel(), true);
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.error("OneSignal: Failed to initialize feature states from cached config", th);
        }
        this.configModelStore.subscribe((g) this);
    }

    private final void applySideEffects(D4.b bVar, boolean z6) {
        if (d.$EnumSwitchMapping$1[bVar.ordinal()] != 1) {
            return;
        }
        com.onesignal.common.threading.d.INSTANCE.updateUseBackgroundThreading(z6, "FeatureManager:" + bVar.getActivationMode());
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

    private final void refreshEnabledFeatures(com.onesignal.core.internal.config.b bVar, boolean z6) {
        List<String> sdkRemoteFeatureFlags = bVar.getSdkRemoteFeatureFlags();
        ArrayList arrayList = new ArrayList(AbstractC5121l.w(sdkRemoteFeatureFlags, 10));
        Iterator<T> it = sdkRemoteFeatureFlags.iterator();
        while (it.hasNext()) {
            arrayList.add(canonicalizeFeatureKey((String) it.next()));
        }
        Set<String> set = localFeatureOverrides;
        ArrayList arrayList2 = new ArrayList(AbstractC5121l.w(set, 10));
        Iterator<T> it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList2.add(canonicalizeFeatureKey((String) it2.next()));
        }
        Set<String> N8 = AbstractC5119j.N(AbstractC5119j.F(arrayList, arrayList2));
        Set<String> set2 = localFeatureOverrides;
        if (!set2.isEmpty()) {
            com.onesignal.debug.internal.logging.b.warn$default("OneSignal: Local feature override enabled for testing only: " + set2, null, 2, null);
        }
        LinkedHashMap z9 = t.z(this.featureStates);
        AbstractC5113d abstractC5113d = (AbstractC5113d) D4.b.getEntries();
        abstractC5113d.getClass();
        c8.g gVar = new c8.g(6, abstractC5113d);
        while (gVar.hasNext()) {
            D4.b bVar2 = (D4.b) gVar.next();
            boolean isEnabledIn = bVar2.isEnabledIn(N8);
            int i = d.$EnumSwitchMapping$0[bVar2.getActivationMode().ordinal()];
            if (i == 1) {
                z9.put(bVar2, Boolean.valueOf(isEnabledIn));
                applySideEffects(bVar2, isEnabledIn);
            } else if (i == 2) {
                boolean containsKey = z9.containsKey(bVar2);
                if (z6 || !containsKey) {
                    z9.put(bVar2, Boolean.valueOf(isEnabledIn));
                    applySideEffects(bVar2, isEnabledIn);
                } else {
                    Boolean bool = (Boolean) z9.get(bVar2);
                    boolean booleanValue = bool != null ? bool.booleanValue() : false;
                    if (booleanValue != isEnabledIn) {
                        com.onesignal.debug.internal.logging.b.info$default("OneSignal: Feature " + bVar2.getKey() + " changed remotely to " + isEnabledIn + " but is NEXT_RUN, keeping current run value=" + booleanValue, null, 2, null);
                    }
                }
            }
        }
        this.featureStates = z9;
    }

    @Override // D4.e
    public List<String> enabledFeatureKeys() {
        Set<Map.Entry<D4.b, Boolean>> entrySet = this.featureStates.entrySet();
        h.e(entrySet, "<this>");
        P7.g gVar = new P7.g(2, entrySet);
        b predicate = b.INSTANCE;
        h.e(predicate, "predicate");
        P7.e eVar = new P7.e(gVar, predicate);
        C0000c transform = C0000c.INSTANCE;
        h.e(transform, "transform");
        return P7.i.A(new P7.e(eVar, transform));
    }

    @Override // D4.e
    public boolean isEnabled(D4.b feature) {
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

    @Override // D4.e
    public Map<String, y> remoteFeatureFlagMetadata() {
        String sdkRemoteFeatureFlagMetadata = ((com.onesignal.core.internal.config.b) this.configModelStore.getModel()).getSdkRemoteFeatureFlagMetadata();
        if (sdkRemoteFeatureFlagMetadata == null || Q7.j.s0(sdkRemoteFeatureFlagMetadata)) {
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
