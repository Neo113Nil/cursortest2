package com.google.firebase.heartbeatinfo;

import androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1$invoke$$inlined$onDispose$1;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.unit.Density;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import app.cash.broadway.Broadway;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.TransitionFactory;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.clientsync.errors.IllegalSyncValueCardinality;
import com.squareup.cash.clientsync.models.SyncEntity;
import com.squareup.cash.clientsync.readers.RealSyncValueReader;
import com.squareup.cash.clientsync.readers.SyncValueSpec;
import com.squareup.cash.core.navigationcontainer.models.NavigationModel;
import com.squareup.cash.core.navigationcontainer.navigator.EventListener;
import com.squareup.cash.core.transitions.TransitionsKt;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda8;
import com.squareup.util.MathsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.collections.immutable.ImmutableList;

/* loaded from: classes.dex */
public final /* synthetic */ class HeartBeatInfoStorage$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ HeartBeatInfoStorage$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
    
        if (r8 == null) goto L17;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object obj2;
        TransitionFactory.Transition transition;
        boolean z = false;
        Object obj3 = null;
        switch (this.$r8$classId) {
            case 0:
                HeartBeatInfoStorage heartBeatInfoStorage = (HeartBeatInfoStorage) this.f$0;
                String str = (String) this.f$1;
                String str2 = (String) this.f$2;
                Preferences.Key key = (Preferences.Key) this.f$3;
                MutablePreferences mutablePreferences = (MutablePreferences) obj;
                if (((String) PlatformKt.getOrDefault(mutablePreferences, HeartBeatInfoStorage.LAST_STORED_DATE, "")).equals(str)) {
                    Preferences.Key storedUserAgentString = heartBeatInfoStorage.getStoredUserAgentString(mutablePreferences, str);
                    if (storedUserAgentString != null && !storedUserAgentString.name.equals(str2)) {
                        synchronized (heartBeatInfoStorage) {
                            heartBeatInfoStorage.removeStoredDate(mutablePreferences, str);
                            HashSet hashSet = new HashSet((Collection) PlatformKt.getOrDefault(mutablePreferences, key, new HashSet()));
                            hashSet.add(str);
                            mutablePreferences.setUnchecked$datastore_preferences_core_release(key, hashSet);
                        }
                    }
                    return null;
                }
                Preferences.Key key2 = HeartBeatInfoStorage.HEART_BEAT_COUNT_TAG;
                long longValue = ((Long) PlatformKt.getOrDefault(mutablePreferences, key2, 0L)).longValue();
                if (longValue + 1 == 30) {
                    synchronized (heartBeatInfoStorage) {
                        try {
                            long longValue2 = ((Long) PlatformKt.getOrDefault(mutablePreferences, key2, 0L)).longValue();
                            String str3 = "";
                            Set hashSet2 = new HashSet();
                            String str4 = null;
                            for (Map.Entry entry : mutablePreferences.asMap().entrySet()) {
                                if (entry.getValue() instanceof Set) {
                                    Set<String> set = (Set) entry.getValue();
                                    for (String str5 : set) {
                                        Object obj4 = obj3;
                                        if (str4 != null && str4.compareTo(str5) <= 0) {
                                            obj3 = obj4;
                                        }
                                        str3 = ((Preferences.Key) entry.getKey()).name;
                                        str4 = str5;
                                        hashSet2 = set;
                                        obj3 = obj4;
                                    }
                                }
                                obj3 = obj3;
                            }
                            obj2 = obj3;
                            HashSet hashSet3 = new HashSet(hashSet2);
                            hashSet3.remove(str4);
                            str3.getClass();
                            mutablePreferences.setUnchecked$datastore_preferences_core_release(new Preferences.Key(str3), hashSet3);
                            longValue = longValue2 - 1;
                            mutablePreferences.set(HeartBeatInfoStorage.HEART_BEAT_COUNT_TAG, Long.valueOf(longValue));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    obj2 = null;
                }
                HashSet hashSet4 = new HashSet((Collection) PlatformKt.getOrDefault(mutablePreferences, key, new HashSet()));
                hashSet4.add(str);
                mutablePreferences.setUnchecked$datastore_preferences_core_release(key, hashSet4);
                mutablePreferences.set(HeartBeatInfoStorage.HEART_BEAT_COUNT_TAG, Long.valueOf(longValue + 1));
                mutablePreferences.set(HeartBeatInfoStorage.LAST_STORED_DATE, str);
                return obj2;
            case 1:
                Animatable animatable = (Animatable) this.f$0;
                AnimationState animationState = (AnimationState) this.f$1;
                Function1 function1 = (Function1) this.f$2;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.f$3;
                AnimationScope animationScope = (AnimationScope) obj;
                AnimationState animationState2 = animatable.internalState;
                AnimatableKt.updateState(animationScope, animationState2);
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = animationScope.value$delegate;
                Object clampToBounds = animatable.clampToBounds(parcelableSnapshotMutableState.getValue());
                if (!Intrinsics.areEqual(clampToBounds, parcelableSnapshotMutableState.getValue())) {
                    animationState2.value$delegate.setValue(clampToBounds);
                    animationState.value$delegate.setValue(clampToBounds);
                    if (function1 != null) {
                        function1.invoke(animatable);
                    }
                    animationScope.cancelAnimation();
                    ref$BooleanRef.element = true;
                } else if (function1 != null) {
                    function1.invoke(animatable);
                }
                return Unit.INSTANCE;
            case 2:
                Object obj5 = this.f$0;
                Function1 function12 = (Function1) this.f$1;
                RealSyncValueReader realSyncValueReader = (RealSyncValueReader) this.f$2;
                SyncValueSpec syncValueSpec = (SyncValueSpec) this.f$3;
                List list = (List) obj;
                list.getClass();
                int size = list.size();
                if (size == 0) {
                    return obj5;
                }
                if (size == 1) {
                    return function12.invoke(syncValueSpec.getPayload(realSyncValueReader.entityDecryptor.decryptEntity((SyncEntity) list.get(0)).getEntityProto()));
                }
                int i = IllegalSyncValueCardinality.$r8$clinit;
                realSyncValueReader.errorReporter.reportFatal(MathsKt.create((String) syncValueSpec.valueName, list));
                throw null;
            case 3:
                Broadway broadway = (Broadway) this.f$0;
                Density density = (Density) this.f$1;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f$2;
                ImmutableList immutableList = (ImmutableList) this.f$3;
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl.getClass();
                Screen screen = ((NavigationModel.Ready.FullScreenLocation) animatedContentTransitionScopeImpl.getTargetState()).initiatorScreen;
                if (screen != null) {
                    if (screen instanceof OnlyOneOverlayTreatment) {
                        screen = null;
                        break;
                    }
                }
                screen = ((NavigationModel.Ready.FullScreenLocation) animatedContentTransitionScopeImpl.getInitialState()).screen;
                Screen screen2 = ((NavigationModel.Ready.FullScreenLocation) animatedContentTransitionScopeImpl.getTargetState()).screen;
                if (((NavigationModel.Ready.FullScreenLocation) animatedContentTransitionScopeImpl.getTargetState()).isBack && Intrinsics.areEqual(((NavigationModel.Ready.FullScreenLocation) animatedContentTransitionScopeImpl.getTargetState()).previousFullScreenStateKey, ((NavigationModel.Ready.FullScreenLocation) animatedContentTransitionScopeImpl.getInitialState()).stateKey)) {
                    z = true;
                }
                StorageLinkQueries$$ExternalSyntheticLambda8 storageLinkQueries$$ExternalSyntheticLambda8 = new StorageLinkQueries$$ExternalSyntheticLambda8(immutableList, 11);
                broadway.getClass();
                screen.getClass();
                screen2.getClass();
                Iterator it = broadway.transitionFactories.iterator();
                while (true) {
                    if (it.hasNext()) {
                        transition = ((TransitionFactory) it.next()).createTransition(screen, screen2, z, storageLinkQueries$$ExternalSyntheticLambda8);
                        if (transition != null) {
                        }
                    } else {
                        transition = null;
                    }
                }
                if (transition instanceof TransitionFactory.StandardTransition) {
                    return TransitionsKt.toContentTransform(animatedContentTransitionScopeImpl, (TransitionFactory.StandardTransition) transition, density, (MutableFloatState) ref$ObjectRef.element);
                }
                if (!(transition instanceof TransitionFactory.CustomTransition)) {
                    if ((transition instanceof TransitionFactory.AnimatorTransition) || transition == null) {
                        return TransitionsKt.toContentTransform(animatedContentTransitionScopeImpl, new TransitionFactory.StandardTransition.Push(((NavigationModel.Ready.FullScreenLocation) animatedContentTransitionScopeImpl.getTargetState()).isBack), density, (MutableFloatState) ref$ObjectRef.element);
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                TransitionFactory.CustomTransition customTransition = (TransitionFactory.CustomTransition) transition;
                ExitTransitionImpl exitTransitionImpl = customTransition.exit;
                EnterTransitionImpl enterTransitionImpl = customTransition.enter;
                if (Intrinsics.areEqual(exitTransitionImpl, ExitTransitionImpl.None)) {
                    exitTransitionImpl = ExitTransitionImpl.KeepUntilTransitionsFinished;
                }
                boolean z2 = customTransition.incomingContentBelow;
                Object obj6 = ref$ObjectRef.element;
                return new ContentTransform(enterTransitionImpl, exitTransitionImpl, z2 ? TransitionsKt.decrementAndGet((MutableFloatState) obj6) : TransitionsKt.incrementAndGet((MutableFloatState) obj6), 8);
            default:
                Function1 function13 = (Function1) this.f$0;
                NavigationModel.Ready.Location location = (NavigationModel.Ready.Location) this.f$1;
                List list2 = (List) this.f$2;
                Function1 function14 = (Function1) this.f$3;
                ((DisposableEffectScope) obj).getClass();
                function13.invoke(location.getStateKey());
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    ((EventListener) it2.next()).uiCreate(location.getScreen());
                }
                return new AnimatedContentKt$AnimatedContent$6$1$5$1$1$invoke$$inlined$onDispose$1(3, function14, location, list2);
        }
    }
}
