package com.google.firebase;

import android.content.Context;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.events.Publisher;
import com.google.firebase.heartbeatinfo.HeartBeatInfoStorage;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.DataCollectionConfigStorage;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class FirebaseApp$$ExternalSyntheticLambda0 implements Provider {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ FirebaseApp$$ExternalSyntheticLambda0(Context context, String str) {
        this.$r8$classId = 2;
        this.f$1 = context;
        this.f$0 = str;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        Object obj2 = this.f$1;
        switch (i) {
            case 0:
                FirebaseApp firebaseApp = (FirebaseApp) obj;
                return new DataCollectionConfigStorage((Context) obj2, firebaseApp.getPersistenceKey(), (Publisher) firebaseApp.componentRuntime.get(Publisher.class));
            case 1:
                ComponentRuntime componentRuntime = (ComponentRuntime) obj;
                Component component = (Component) obj2;
                ComponentFactory componentFactory = component.factory;
                zzlj zzljVar = new zzlj();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                Set<Dependency> set = component.dependencies;
                Set set2 = component.publishedEvents;
                for (Dependency dependency : set) {
                    int i2 = dependency.injection;
                    int i3 = dependency.f1005type;
                    boolean z = i2 == 0;
                    Qualified qualified = dependency.anInterface;
                    if (z) {
                        if (i3 == 2) {
                            hashSet4.add(qualified);
                        } else {
                            hashSet.add(qualified);
                        }
                    } else if (i2 == 2) {
                        hashSet3.add(qualified);
                    } else if (i3 == 2) {
                        hashSet5.add(qualified);
                    } else {
                        hashSet2.add(qualified);
                    }
                }
                if (!set2.isEmpty()) {
                    hashSet.add(Qualified.unqualified(Publisher.class));
                }
                zzljVar.zza = Collections.unmodifiableSet(hashSet);
                zzljVar.zzb = Collections.unmodifiableSet(hashSet2);
                Collections.unmodifiableSet(hashSet3);
                zzljVar.zzc = Collections.unmodifiableSet(hashSet4);
                zzljVar.zze = Collections.unmodifiableSet(hashSet5);
                zzljVar.zzd = set2;
                zzljVar.zzf = componentRuntime;
                return componentFactory.create(zzljVar);
            default:
                return new HeartBeatInfoStorage((Context) obj2, (String) obj);
        }
    }

    public /* synthetic */ FirebaseApp$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
