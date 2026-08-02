package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.lifecycle.Lifecycle;
import app.cash.redwood.yoga.internal.YGStyle;
import app.cash.redwood.yoga.internal.enums.YGAlign;
import app.cash.sqldelight.driver.android.AndroidCursor;
import app.cash.zipline.ZiplineException;
import app.cash.zipline.internal.HostService$Companion$Adapter;
import app.cash.zipline.internal.bridge.CallsKt;
import app.cash.zipline.internal.bridge.FlowSerializer;
import app.cash.zipline.internal.bridge.SerializableZiplineFunction;
import app.cash.zipline.internal.bridge.StateFlowSerializer;
import app.cash.zipline.internal.bridge.ZiplineServiceAdapterKt;
import app.cash.zipline.loader.internal.cache.FilesQueries$selectCacheSumBytes$2;
import app.cash.zipline.loader.internal.cache.PinsQueries$get_pin$2;
import coil3.compose.AsyncImagePainter;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Marker;
import com.google.maps.android.compose.CameraPositionState;
import com.google.maps.android.compose.GoogleMapKt$GoogleMap$4$1$1$componentCallbacks$1;
import com.google.maps.android.compose.MapLifecycleEventObserver;
import com.google.maps.android.compose.MapTagData;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonBuilder;

/* loaded from: classes3.dex */
public final /* synthetic */ class yf$$ExternalSyntheticLambda10 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ yf$$ExternalSyntheticLambda10(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return yf.a((File) obj);
            case 1:
                YGStyle yGStyle = (YGStyle) obj;
                yGStyle.getClass();
                return new YGStyle.BitfieldRef(yGStyle, YGStyle.alignItemsOffset, YGAlign.values());
            case 2:
                YGStyle yGStyle2 = (YGStyle) obj;
                yGStyle2.getClass();
                return yGStyle2.dimensions;
            case 3:
                YGStyle yGStyle3 = (YGStyle) obj;
                yGStyle3.getClass();
                return yGStyle3.padding;
            case 4:
                YGStyle yGStyle4 = (YGStyle) obj;
                yGStyle4.getClass();
                return yGStyle4.margin;
            case 5:
                YGStyle yGStyle5 = (YGStyle) obj;
                yGStyle5.getClass();
                return yGStyle5.maxDimensions;
            case 6:
                YGStyle yGStyle6 = (YGStyle) obj;
                yGStyle6.getClass();
                return new YGStyle.BitfieldRef(yGStyle6, YGStyle.alignSelfOffset, YGAlign.values());
            case 7:
                JsonBuilder jsonBuilder = (JsonBuilder) obj;
                jsonBuilder.getClass();
                jsonBuilder.ignoreUnknownKeys = true;
                jsonBuilder.encodeDefaults = true;
                return Unit.INSTANCE;
            case 8:
                List list = (List) obj;
                list.getClass();
                return new FlowSerializer(new HostService$Companion$Adapter(ZiplineServiceAdapterKt.serialName("app.cash.zipline.internal.bridge.FlowZiplineService", list), list, 10));
            case 9:
                List list2 = (List) obj;
                list2.getClass();
                return new StateFlowSerializer(new HostService$Companion$Adapter(ZiplineServiceAdapterKt.serialName("app.cash.zipline.internal.bridge.StateFlowZiplineService", list2), list2, 11));
            case 10:
                SerializableZiplineFunction serializableZiplineFunction = (SerializableZiplineFunction) obj;
                serializableZiplineFunction.getClass();
                return Recorder$$ExternalSyntheticOutline2.m("\t\t", serializableZiplineFunction.signature);
            case 11:
                String str = (String) obj;
                str.getClass();
                return "\t\t".concat(str);
            case 12:
                ClassSerialDescriptorBuilder classSerialDescriptorBuilder = (ClassSerialDescriptorBuilder) obj;
                classSerialDescriptorBuilder.getClass();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                SerialDescriptor descriptor = BuiltinSerializersKt.serializer(stringCompanionObject).getDescriptor();
                EmptyList emptyList = EmptyList.INSTANCE;
                classSerialDescriptorBuilder.element("service", descriptor, emptyList, false);
                classSerialDescriptorBuilder.element("function", BuiltinSerializersKt.serializer(stringCompanionObject).getDescriptor(), emptyList, false);
                classSerialDescriptorBuilder.element("callback", BuiltinSerializersKt.serializer(stringCompanionObject).getDescriptor(), emptyList, false);
                classSerialDescriptorBuilder.element("args", CallsKt.argsListDescriptor, emptyList, false);
                return Unit.INSTANCE;
            case 13:
                String str2 = (String) obj;
                str2.getClass();
                return new ZiplineException(str2, null);
            case 14:
                KSerializer kSerializer = (KSerializer) obj;
                kSerializer.getClass();
                return ZiplineServiceAdapterKt.descriptorName(kSerializer.getDescriptor(), new LinkedHashSet());
            case 15:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                function1.invoke("files");
                return Unit.INSTANCE;
            case 16:
                Function1 function12 = (Function1) obj;
                function12.getClass();
                function12.invoke("files");
                return Unit.INSTANCE;
            case 17:
                FilesQueries$selectCacheSumBytes$2 filesQueries$selectCacheSumBytes$2 = FilesQueries$selectCacheSumBytes$2.INSTANCE;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                androidCursor.getClass();
                return filesQueries$selectCacheSumBytes$2.invoke(androidCursor.getLong(0));
            case 18:
                Function1 function13 = (Function1) obj;
                function13.getClass();
                function13.invoke("files");
                return Unit.INSTANCE;
            case 19:
                Function1 function14 = (Function1) obj;
                function14.getClass();
                function14.invoke("files");
                return Unit.INSTANCE;
            case 20:
                PinsQueries$get_pin$2 pinsQueries$get_pin$2 = PinsQueries$get_pin$2.INSTANCE;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                Long m = re$$ExternalSyntheticOutline0.m(androidCursor2, 0);
                String string2 = androidCursor2.getString(1);
                string2.getClass();
                return pinsQueries$get_pin$2.invoke(m, string2);
            case 21:
                Function1 function15 = (Function1) obj;
                function15.getClass();
                function15.invoke("pins");
                return Unit.INSTANCE;
            case 22:
                Function1 function16 = (Function1) obj;
                function16.getClass();
                function16.invoke("pins");
                return Unit.INSTANCE;
            case 23:
                return (AsyncImagePainter.State) obj;
            case 24:
                return Unit.INSTANCE;
            case 25:
                CameraPosition cameraPosition = (CameraPosition) obj;
                cameraPosition.getClass();
                return new CameraPositionState(cameraPosition);
            case 26:
                ((MapView) obj).getClass();
                return Unit.INSTANCE;
            case 27:
                MapView mapView = (MapView) obj;
                mapView.getClass();
                Object tag = mapView.getTag();
                tag.getClass();
                MapTagData mapTagData = (MapTagData) tag;
                GoogleMapKt$GoogleMap$4$1$1$componentCallbacks$1 googleMapKt$GoogleMap$4$1$1$componentCallbacks$1 = mapTagData.componentCallbacks;
                MapLifecycleEventObserver mapLifecycleEventObserver = mapTagData.lifecycleObserver;
                mapView.getContext().unregisterComponentCallbacks(googleMapKt$GoogleMap$4$1$1$componentCallbacks$1);
                if (mapLifecycleEventObserver.currentLifecycleState.compareTo(Lifecycle.State.INITIALIZED) > 0) {
                    mapLifecycleEventObserver.moveToLifecycleState(Lifecycle.State.DESTROYED);
                }
                mapView.setTag(null);
                return Unit.INSTANCE;
            case 28:
                ((Marker) obj).getClass();
                return Boolean.FALSE;
            default:
                ((Marker) obj).getClass();
                return Unit.INSTANCE;
        }
    }
}
