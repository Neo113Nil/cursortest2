package app.cash.zipline.internal.bridge;

import app.cash.zipline.ZiplineApiMismatchException;
import app.cash.zipline.ZiplineFunction;
import app.cash.zipline.ZiplineScope;
import app.cash.zipline.ZiplineService;
import app.cash.zipline.internal.HostService$Companion$Adapter;
import app.cash.zipline.internal.bridge.OutboundCallHandler;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.xg$$ExternalSyntheticLambda9;
import bo.app.yf$$ExternalSyntheticLambda10;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmo;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.IntCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.PrimitiveKind$INT;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ArrayClassDesc;
import kotlinx.serialization.json.JsonDecoder;
import okhttp3.internal.Tags;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class ArgsListSerializer implements KSerializer {
    public final /* synthetic */ int $r8$classId;
    public final SerialDescriptor descriptor;
    public final Object serializers;

    public ArgsListSerializer(Endpoint endpoint, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 2:
                this.serializers = endpoint;
                this.descriptor = Tags.buildClassSerialDescriptor("RealCall", new SerialDescriptor[0], new yf$$ExternalSyntheticLambda10(12));
                break;
            default:
                this.serializers = endpoint;
                this.descriptor = Tags.PrimitiveSerialDescriptor("PassByReference", PrimitiveKind$INT.INSTANCE$8);
                break;
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        LinkedHashMap linkedHashMap;
        Result result;
        int i = this.$r8$classId;
        SerialDescriptor serialDescriptor = this.descriptor;
        Object obj = this.serializers;
        switch (i) {
            case 0:
                ArrayClassDesc arrayClassDesc = (ArrayClassDesc) serialDescriptor;
                CompositeDecoder beginStructure = decoder.beginStructure(arrayClassDesc);
                ArrayList arrayList = new ArrayList();
                List list = (List) obj;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (beginStructure.decodeElementIndex(arrayClassDesc) != i2) {
                        a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                        return null;
                    }
                    arrayList.add(beginStructure.decodeSerializableElement(arrayClassDesc, i2, (KSerializer) list.get(i2), null));
                }
                if (beginStructure.decodeElementIndex(arrayClassDesc) == -1) {
                    beginStructure.endStructure(arrayClassDesc);
                    return arrayList;
                }
                a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                return null;
            case 1:
                String decodeString = decoder.decodeString();
                Endpoint endpoint = (Endpoint) obj;
                ((ArrayList) endpoint.callCodec.c).add(decodeString);
                decodeString.getClass();
                ReceiveByReference receiveByReference = new ReceiveByReference();
                receiveByReference.name = decodeString;
                receiveByReference.endpoint = endpoint;
                return receiveByReference;
            case 2:
                SerialDescriptorImpl serialDescriptorImpl = (SerialDescriptorImpl) serialDescriptor;
                Endpoint endpoint2 = (Endpoint) obj;
                ZiplineScope ziplineScope = endpoint2.takeScope;
                try {
                    CompositeDecoder beginStructure2 = decoder.beginStructure(serialDescriptorImpl);
                    SuspendCallback suspendCallback = null;
                    List list2 = EmptyList.INSTANCE;
                    String str = "";
                    final String str2 = str;
                    ZiplineFunction ziplineFunction = null;
                    InboundService inboundService = null;
                    while (true) {
                        int decodeElementIndex = beginStructure2.decodeElementIndex(serialDescriptorImpl);
                        if (decodeElementIndex == -1) {
                            InboundService inboundService2 = inboundService == null ? new InboundService(new RealZiplineServiceType("Unknown", EmptyList.INSTANCE), new RealCallSerializer$unknownService$1(), endpoint2) : inboundService;
                            if (ziplineFunction == null) {
                                final String str3 = inboundService == null ? "<unknown service>" : "<unknown function>";
                                if (suspendCallback != null) {
                                    final EmptyList emptyList = EmptyList.INSTANCE;
                                    final KSerializer serializer = BuiltinSerializersKt.serializer(IntCompanionObject.INSTANCE);
                                    final HostService$Companion$Adapter hostService$Companion$Adapter = CallsKt.failureSuspendCallbackSerializer;
                                    ziplineFunction = new SuspendingZiplineFunction(str2, emptyList, serializer, hostService$Companion$Adapter) { // from class: app.cash.zipline.internal.bridge.RealCallSerializer$unknownFunction$1
                                        @Override // app.cash.zipline.internal.bridge.SuspendingZiplineFunction
                                        public final Object callSuspending(ZiplineService ziplineService, List list3, zzmo zzmoVar) {
                                            throw new ZiplineApiMismatchException(str3);
                                        }
                                    };
                                } else {
                                    final String str4 = str2;
                                    final EmptyList emptyList2 = EmptyList.INSTANCE;
                                    final KSerializer serializer2 = BuiltinSerializersKt.serializer(IntCompanionObject.INSTANCE);
                                    ziplineFunction = new ReturningZiplineFunction(str4, emptyList2, serializer2) { // from class: app.cash.zipline.internal.bridge.RealCallSerializer$unknownFunction$2
                                        @Override // app.cash.zipline.internal.bridge.ReturningZiplineFunction
                                        public final Object call(ZiplineService ziplineService, List list3) {
                                            ziplineService.getClass();
                                            list3.getClass();
                                            throw new ZiplineApiMismatchException(str3);
                                        }
                                    };
                                }
                            }
                            InternalCall internalCall = new InternalCall(str, null, null, inboundService2, ziplineFunction, suspendCallback, list2, 6);
                            beginStructure2.endStructure(serialDescriptorImpl);
                            endpoint2.takeScope = ziplineScope;
                            return internalCall;
                        }
                        if (decodeElementIndex == 0) {
                            str = beginStructure2.decodeStringElement(serialDescriptorImpl, decodeElementIndex);
                            inboundService = (InboundService) endpoint2.inboundServices.get(str);
                            ZiplineService ziplineService = inboundService != null ? inboundService.service : null;
                            OutboundCallHandler.RealSuspendCallback realSuspendCallback = ziplineService instanceof OutboundCallHandler.RealSuspendCallback ? (OutboundCallHandler.RealSuspendCallback) ziplineService : null;
                            endpoint2.takeScope = realSuspendCallback != null ? OutboundCallHandler.this.scope : null;
                        } else if (decodeElementIndex == 1) {
                            String decodeStringElement = beginStructure2.decodeStringElement(serialDescriptorImpl, decodeElementIndex);
                            str2 = decodeStringElement;
                            ziplineFunction = (inboundService == null || (linkedHashMap = inboundService.f925type.functionsById) == null) ? null : (ZiplineFunction) linkedHashMap.get(decodeStringElement);
                        } else if (decodeElementIndex == 2) {
                            KSerializer kSerializer = ziplineFunction instanceof SuspendingZiplineFunction ? ((SuspendingZiplineFunction) ziplineFunction).suspendCallbackSerializer : CallsKt.failureSuspendCallbackSerializer;
                            kSerializer.getClass();
                            suspendCallback = (SuspendCallback) beginStructure2.decodeSerializableElement(serialDescriptorImpl, decodeElementIndex, kSerializer, null);
                        } else {
                            if (decodeElementIndex != 3) {
                                throw new IllegalStateException(("Unexpected index: " + decodeElementIndex).toString());
                            }
                            ArgsListSerializer argsListSerializer = ziplineFunction instanceof SuspendingZiplineFunction ? ((SuspendingZiplineFunction) ziplineFunction).argsListSerializer : ziplineFunction instanceof ReturningZiplineFunction ? ((ReturningZiplineFunction) ziplineFunction).argsListSerializer : null;
                            if (argsListSerializer != null) {
                                list2 = (List) beginStructure2.decodeSerializableElement(serialDescriptorImpl, decodeElementIndex, argsListSerializer, null);
                            } else {
                                ((JsonDecoder) decoder).decodeJsonElement();
                            }
                        }
                    }
                } catch (Throwable th) {
                    endpoint2.takeScope = ziplineScope;
                    throw th;
                }
                break;
            default:
                SerialDescriptorImpl serialDescriptorImpl2 = (SerialDescriptorImpl) serialDescriptor;
                CompositeDecoder beginStructure3 = decoder.beginStructure(serialDescriptorImpl2);
                Result result2 = null;
                CancelCallback cancelCallback = null;
                while (true) {
                    int decodeElementIndex2 = beginStructure3.decodeElementIndex(serialDescriptorImpl2);
                    if (decodeElementIndex2 == -1) {
                        ResultOrCallback resultOrCallback = new ResultOrCallback(result2, cancelCallback);
                        beginStructure3.endStructure(serialDescriptorImpl2);
                        return resultOrCallback;
                    }
                    if (decodeElementIndex2 != 0) {
                        if (decodeElementIndex2 == 1) {
                            Result.Companion companion = Result.Companion;
                            result = new Result(SafeTrace.createFailure((Throwable) beginStructure3.decodeSerializableElement(serialDescriptorImpl2, 1, ThrowableSerializer.INSTANCE, null)));
                        } else {
                            if (decodeElementIndex2 != 2) {
                                Path$$ExternalSyntheticBUOutline0.m$1(decodeElementIndex2, "Unexpected index: ");
                                return null;
                            }
                            Result.Companion companion2 = Result.Companion;
                            result = new Result(beginStructure3.decodeSerializableElement(serialDescriptorImpl2, 2, (KSerializer) obj, null));
                        }
                        result2 = result;
                    } else {
                        cancelCallback = (CancelCallback) beginStructure3.decodeSerializableElement(serialDescriptorImpl2, 0, CallsKt.cancelCallbackSerializer, null);
                    }
                }
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        switch (this.$r8$classId) {
        }
        return (SerialDescriptorImpl) this.descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.serializers;
        SerialDescriptor serialDescriptor = this.descriptor;
        switch (i) {
            case 0:
                List list = (List) obj;
                ArrayClassDesc arrayClassDesc = (ArrayClassDesc) serialDescriptor;
                list.getClass();
                List list2 = (List) obj2;
                if (list.size() == list2.size()) {
                    CompositeEncoder beginStructure = encoder.beginStructure(arrayClassDesc);
                    int size = list2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Object obj3 = list2.get(i2);
                        obj3.getClass();
                        beginStructure.encodeSerializableElement(arrayClassDesc, i2, (KSerializer) obj3, list.get(i2));
                    }
                    beginStructure.endStructure(arrayClassDesc);
                    break;
                } else {
                    a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                    break;
                }
            case 1:
                PassByReference passByReference = (PassByReference) obj;
                Endpoint endpoint = (Endpoint) obj2;
                passByReference.getClass();
                if (passByReference instanceof SendByReference) {
                    int i3 = endpoint.nextId;
                    endpoint.nextId = i3 + 1;
                    String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i3, "zipline/host-");
                    SendByReference sendByReference = (SendByReference) passByReference;
                    ZiplineService ziplineService = sendByReference.service;
                    if (ziplineService instanceof HasPassByReferenceName) {
                        ((HasPassByReferenceName) ziplineService).setPassByReferenceName(m);
                    }
                    ((ArrayList) endpoint.callCodec.i).add(m);
                    endpoint.bind(m, ziplineService, sendByReference.adapter);
                    encoder.encodeString(m);
                    break;
                } else {
                    a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                    break;
                }
            case 2:
                InternalCall internalCall = (InternalCall) obj;
                internalCall.getClass();
                SerialDescriptorImpl serialDescriptorImpl = (SerialDescriptorImpl) serialDescriptor;
                CompositeEncoder beginStructure2 = encoder.beginStructure(serialDescriptorImpl);
                beginStructure2.encodeStringElement(serialDescriptorImpl, 0, internalCall.serviceName);
                beginStructure2.encodeStringElement(serialDescriptorImpl, 1, internalCall.function.getId());
                SuspendCallback suspendCallback = internalCall.suspendCallback;
                if (suspendCallback != null) {
                    KSerializer kSerializer = internalCall.suspendCallbackSerializer;
                    kSerializer.getClass();
                    beginStructure2.encodeSerializableElement(serialDescriptorImpl, 2, kSerializer, suspendCallback);
                }
                ArgsListSerializer argsListSerializer = internalCall.argsListSerializer;
                argsListSerializer.getClass();
                beginStructure2.encodeSerializableElement(serialDescriptorImpl, 3, argsListSerializer, internalCall.args);
                beginStructure2.endStructure(serialDescriptorImpl);
                break;
            default:
                ResultOrCallback resultOrCallback = (ResultOrCallback) obj;
                resultOrCallback.getClass();
                SerialDescriptorImpl serialDescriptorImpl2 = (SerialDescriptorImpl) serialDescriptor;
                CompositeEncoder beginStructure3 = encoder.beginStructure(serialDescriptorImpl2);
                CancelCallback cancelCallback = resultOrCallback.callback;
                if (cancelCallback != null) {
                    beginStructure3.encodeSerializableElement(serialDescriptorImpl2, 0, CallsKt.cancelCallbackSerializer, cancelCallback);
                } else {
                    Result result = resultOrCallback.result;
                    result.getClass();
                    Object obj4 = result.value;
                    Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj4);
                    if (m4120exceptionOrNullimpl != null) {
                        beginStructure3.encodeSerializableElement(serialDescriptorImpl2, 1, ThrowableSerializer.INSTANCE, m4120exceptionOrNullimpl);
                    } else {
                        KSerializer kSerializer2 = (KSerializer) obj2;
                        if (obj4 instanceof Result.Failure) {
                            obj4 = null;
                        }
                        beginStructure3.encodeSerializableElement(serialDescriptorImpl2, 2, kSerializer2, obj4);
                    }
                }
                beginStructure3.endStructure(serialDescriptorImpl2);
                break;
        }
    }

    public ArgsListSerializer(List list) {
        this.$r8$classId = 0;
        list.getClass();
        this.serializers = list;
        this.descriptor = CallsKt.argsListDescriptor;
    }

    public ArgsListSerializer(KSerializer kSerializer) {
        this.$r8$classId = 3;
        kSerializer.getClass();
        this.serializers = kSerializer;
        this.descriptor = Tags.buildClassSerialDescriptor("Result", new SerialDescriptor[0], new xg$$ExternalSyntheticLambda9(this, 6));
    }
}
