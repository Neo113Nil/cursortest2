package com.bugsnag.android;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1;
import com.google.android.gms.maps.GoogleMap;
import com.google.maps.android.compose.CameraPositionState;
import com.google.maps.android.compose.MapPropertiesNode;
import com.google.maps.android.compose.MapUpdaterState;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.money.views.MoneyTabUIKt$MoneyTabLoaded$1$1;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes4.dex */
public final class MarshalledEventSource implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final Object apiKey;
    public Object event;
    public final Object eventFile;
    public final Object logger;

    public /* synthetic */ MarshalledEventSource(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.eventFile = obj;
        this.apiKey = obj2;
        this.logger = obj3;
        this.event = obj4;
    }

    public void clear() {
        this.event = null;
    }

    public Event getEvent() {
        return (Event) this.event;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Object obj = this.logger;
        Object obj2 = this.apiKey;
        Object obj3 = this.eventFile;
        switch (i) {
            case 0:
                return invoke$1();
            case 1:
                MapUpdaterState mapUpdaterState = (MapUpdaterState) obj3;
                String str = (String) mapUpdaterState.contentDescription$delegate.getValue();
                return new MapPropertiesNode((GoogleMap) obj2, (CameraPositionState) mapUpdaterState.cameraPositionState$delegate.getValue(), str, (Density) obj, (LayoutDirection) this.event, (PaddingValues) mapUpdaterState.contentPadding$delegate.getValue());
            case 2:
                CoroutineScope coroutineScope = (CoroutineScope) obj3;
                LazyListState lazyListState = (LazyListState) obj2;
                int size = ((AfterpayAppletHomeContentViewModel) obj).homeSections.size();
                SpringSpec springSpec = (SpringSpec) this.event;
                coroutineScope.getClass();
                lazyListState.getClass();
                JobKt.launch$default(coroutineScope, null, null, new MoneyTabUIKt$MoneyTabLoaded$1$1(lazyListState, size, springSpec, (Continuation) null, 4), 3);
                return Unit.INSTANCE;
            case 3:
                ContextScope plus = JobKt.plus(((CoroutineContext) obj2).plus((CoroutineContext) obj), JobKt.MainScope());
                ((Ref$ObjectRef) obj3).element = plus;
                return JobKt.launch$default(plus, null, null, new SimpleChannelFlowKt$simpleChannelFlow$1((Function2) this.event, null, 1), 3);
            default:
                TypeSystemContext typeSystemContext = (TypeSystemContext) obj2;
                RigidTypeMarker rigidTypeMarker = (RigidTypeMarker) this.event;
                return Boolean.valueOf(AbstractTypeChecker.INSTANCE.isSubtypeForSameConstructor((TypeCheckerState) obj3, typeSystemContext, TypeSystemContextContextualKt.asArgumentList(typeSystemContext, (RigidTypeMarker) obj), rigidTypeMarker));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 com.bugsnag.android.Event, still in use, count: 2, list:
          (r4v3 com.bugsnag.android.Event) from 0x0183: MOVE (r23v0 com.bugsnag.android.Event) = (r4v3 com.bugsnag.android.Event)
          (r4v3 com.bugsnag.android.Event) from 0x015a: MOVE (r23v2 com.bugsnag.android.Event) = (r4v3 com.bugsnag.android.Event)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public com.bugsnag.android.Event invoke$1() {
        /*
            Method dump skipped, instructions count: 2785
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.MarshalledEventSource.invoke$1():com.bugsnag.android.Event");
    }

    public MarshalledEventSource(File file, String str, Logger logger) {
        this.$r8$classId = 0;
        this.eventFile = file;
        this.apiKey = str;
        this.logger = logger;
    }
}
