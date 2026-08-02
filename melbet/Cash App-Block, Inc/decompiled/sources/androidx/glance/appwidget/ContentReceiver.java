package androidx.glance.appwidget;

import android.content.Context;
import androidx.glance.appwidget.proto.LayoutProto$LayoutConfig;
import androidx.glance.appwidget.proto.LayoutProto$LayoutDefinition;
import androidx.glance.appwidget.protobuf.Internal;
import androidx.glance.state.GlanceState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public interface ContentReceiver extends CoroutineContext.Element {

    public final class Key implements CoroutineContext.Key {
        public static final /* synthetic */ Key $$INSTANCE = new Key();

        public static void getSession(int i) {
            synchronized (UnmanagedSessionReceiver.Companion) {
                if (UnmanagedSessionReceiver.activeSessions.get(Integer.valueOf(i)) != null) {
                    throw new ClassCastException();
                }
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(13:5|6|7|(1:(2:10|11)(2:26|27))(3:28|29|(1:31))|12|13|14|(1:16)|17|(2:20|18)|21|22|23))|38|6|7|(0)(0)|12|13|14|(0)|17|(1:18)|21|22|23) */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0030, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
        
            android.util.Log.e("GlanceAppWidget", "Set of layout structures for App Widget id " + r8 + " is corrupted", r0);
            r6 = androidx.glance.appwidget.proto.LayoutProto$LayoutConfig.getDefaultInstance();
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x002d, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
        
            android.util.Log.e("GlanceAppWidget", "I/O error reading set of layout structures for App Widget id " + r8, r0);
            r6 = androidx.glance.appwidget.proto.LayoutProto$LayoutConfig.getDefaultInstance();
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00b4 A[LOOP:0: B:18:0x00ae->B:20:0x00b4, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object load$glance_appwidget_release(Context context, int i, ContinuationImpl continuationImpl) {
            LayoutConfiguration$Companion$load$1 layoutConfiguration$Companion$load$1;
            int i2;
            int mapCapacity;
            if (continuationImpl instanceof LayoutConfiguration$Companion$load$1) {
                layoutConfiguration$Companion$load$1 = (LayoutConfiguration$Companion$load$1) continuationImpl;
                int i3 = layoutConfiguration$Companion$load$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    layoutConfiguration$Companion$load$1.label = i3 - PKIFailureInfo.systemUnavail;
                    Object obj = layoutConfiguration$Companion$load$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = layoutConfiguration$Companion$load$1.label;
                    if (i2 != 0) {
                        SafeTrace.throwOnFailure(obj);
                        layoutConfiguration$Companion$load$1.L$0 = context;
                        layoutConfiguration$Companion$load$1.I$0 = i;
                        layoutConfiguration$Companion$load$1.label = 1;
                        obj = GlanceState.INSTANCE.getValue(context, LayoutStateDefinition.INSTANCE, "appWidgetLayout-" + i, layoutConfiguration$Companion$load$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i = layoutConfiguration$Companion$load$1.I$0;
                        context = layoutConfiguration$Companion$load$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    LayoutProto$LayoutConfig defaultInstance = (LayoutProto$LayoutConfig) obj;
                    Context context2 = context;
                    int i4 = i;
                    Internal.ProtobufList<LayoutProto$LayoutDefinition> layoutList = defaultInstance.getLayoutList();
                    mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(layoutList, 10));
                    if (mapCapacity < 16) {
                        mapCapacity = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                    for (LayoutProto$LayoutDefinition layoutProto$LayoutDefinition : layoutList) {
                        linkedHashMap.put(layoutProto$LayoutDefinition.getLayout(), new Integer(layoutProto$LayoutDefinition.getLayoutIndex()));
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                    return new LayoutConfiguration(context2, linkedHashMap2, defaultInstance.getNextIndex(), i4, CollectionsKt.toMutableSet(linkedHashMap2.values()));
                }
            }
            layoutConfiguration$Companion$load$1 = new LayoutConfiguration$Companion$load$1(this, continuationImpl);
            Object obj2 = layoutConfiguration$Companion$load$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i2 = layoutConfiguration$Companion$load$1.label;
            if (i2 != 0) {
            }
            LayoutProto$LayoutConfig defaultInstance2 = (LayoutProto$LayoutConfig) obj2;
            Context context22 = context;
            int i42 = i;
            Internal.ProtobufList<LayoutProto$LayoutDefinition> layoutList2 = defaultInstance2.getLayoutList();
            mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(layoutList2, 10));
            if (mapCapacity < 16) {
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(mapCapacity);
            while (r7.hasNext()) {
            }
            LinkedHashMap linkedHashMap22 = new LinkedHashMap(linkedHashMap3);
            return new LayoutConfiguration(context22, linkedHashMap22, defaultInstance2.getNextIndex(), i42, CollectionsKt.toMutableSet(linkedHashMap22.values()));
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    default CoroutineContext.Key getKey() {
        return Key.$$INSTANCE;
    }
}
