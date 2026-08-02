package com.google.crypto.tink.internal;

import androidx.datastore.core.SimpleActor;
import androidx.room.TransactorKt;
import androidx.work.impl.WorkLauncherImpl;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.aead.XAesGcmKey$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.internal.SerializationRegistry;
import com.google.crypto.tink.mac.MacWrapper$$ExternalSyntheticLambda0;
import com.google.crypto.tink.util.Bytes;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class MutableSerializationRegistry {
    public static final MutableSerializationRegistry GLOBAL_INSTANCE;
    public final AtomicReference registry = new AtomicReference(new SerializationRegistry(new SimpleActor(15)));

    static {
        try {
            MutableSerializationRegistry mutableSerializationRegistry = new MutableSerializationRegistry();
            mutableSerializationRegistry.registerKeySerializer(new KeySerializer$1(LegacyProtoKey.class, new MacWrapper$$ExternalSyntheticLambda0(13)));
            GLOBAL_INSTANCE = mutableSerializationRegistry;
        } catch (Exception e) {
            throw new TinkBugException(e);
        }
    }

    public final TransactorKt parseKey(ProtoKeySerialization protoKeySerialization) {
        SerializationRegistry serializationRegistry = (SerializationRegistry) this.registry.get();
        serializationRegistry.getClass();
        SerializationRegistry.ParserIndex parserIndex = new SerializationRegistry.ParserIndex(protoKeySerialization.getClass(), protoKeySerialization.objectIdentifier);
        HashMap hashMap = serializationRegistry.keyParserMap;
        if (hashMap.containsKey(parserIndex)) {
            return ((KeyParser$1) hashMap.get(parserIndex)).val$function.parseKey(protoKeySerialization);
        }
        XAesGcmKey$$ExternalSyntheticBUOutline0.m("No Key Parser for requested key type ", parserIndex, " available");
        return null;
    }

    public final Parameters parseParameters(WorkLauncherImpl workLauncherImpl) {
        SerializationRegistry serializationRegistry = (SerializationRegistry) this.registry.get();
        serializationRegistry.getClass();
        SerializationRegistry.ParserIndex parserIndex = new SerializationRegistry.ParserIndex(WorkLauncherImpl.class, (Bytes) workLauncherImpl.processor);
        HashMap hashMap = serializationRegistry.parametersParserMap;
        if (hashMap.containsKey(parserIndex)) {
            return ((ParametersParser$1) hashMap.get(parserIndex)).val$function.parseParameters(workLauncherImpl);
        }
        XAesGcmKey$$ExternalSyntheticBUOutline0.m("No Parameters Parser for requested key type ", parserIndex, " available");
        return null;
    }

    public final synchronized void registerKeyParser(KeyParser$1 keyParser$1) {
        SimpleActor simpleActor = new SimpleActor((SerializationRegistry) this.registry.get());
        keyParser$1.getClass();
        SerializationRegistry.ParserIndex parserIndex = new SerializationRegistry.ParserIndex(ProtoKeySerialization.class, keyParser$1.objectIdentifier);
        HashMap hashMap = (HashMap) simpleActor.consumeMessage;
        if (hashMap.containsKey(parserIndex)) {
            KeyParser$1 keyParser$12 = (KeyParser$1) hashMap.get(parserIndex);
            if (!keyParser$12.equals(keyParser$1) || keyParser$1 != keyParser$12) {
                MacWrapper$$ExternalSyntheticLambda0.m(parserIndex, "Attempt to register non-equal parser for already existing object of type: ");
            }
        } else {
            hashMap.put(parserIndex, keyParser$1);
        }
        this.registry.set(new SerializationRegistry(simpleActor));
    }

    public final synchronized void registerKeySerializer(KeySerializer$1 keySerializer$1) {
        SimpleActor simpleActor = new SimpleActor((SerializationRegistry) this.registry.get());
        SerializationRegistry.SerializerIndex serializerIndex = new SerializationRegistry.SerializerIndex(keySerializer$1.keyClass, ProtoKeySerialization.class);
        HashMap hashMap = (HashMap) simpleActor.scope;
        if (hashMap.containsKey(serializerIndex)) {
            KeySerializer$1 keySerializer$12 = (KeySerializer$1) hashMap.get(serializerIndex);
            if (!keySerializer$12.equals(keySerializer$1) || keySerializer$1 != keySerializer$12) {
                MacWrapper$$ExternalSyntheticLambda0.m(serializerIndex, "Attempt to register non-equal serializer for already existing object of type: ");
            }
        } else {
            hashMap.put(serializerIndex, keySerializer$1);
        }
        this.registry.set(new SerializationRegistry(simpleActor));
    }

    public final synchronized void registerParametersParser(ParametersParser$1 parametersParser$1) {
        SimpleActor simpleActor = new SimpleActor((SerializationRegistry) this.registry.get());
        parametersParser$1.getClass();
        SerializationRegistry.ParserIndex parserIndex = new SerializationRegistry.ParserIndex(WorkLauncherImpl.class, parametersParser$1.objectIdentifier);
        HashMap hashMap = (HashMap) simpleActor.remainingMessages;
        if (hashMap.containsKey(parserIndex)) {
            ParametersParser$1 parametersParser$12 = (ParametersParser$1) hashMap.get(parserIndex);
            if (!parametersParser$12.equals(parametersParser$1) || parametersParser$1 != parametersParser$12) {
                MacWrapper$$ExternalSyntheticLambda0.m(parserIndex, "Attempt to register non-equal parser for already existing object of type: ");
            }
        } else {
            hashMap.put(parserIndex, parametersParser$1);
        }
        this.registry.set(new SerializationRegistry(simpleActor));
    }

    public final synchronized void registerParametersSerializer(ParametersSerializer$1 parametersSerializer$1) {
        SimpleActor simpleActor = new SimpleActor((SerializationRegistry) this.registry.get());
        SerializationRegistry.SerializerIndex serializerIndex = new SerializationRegistry.SerializerIndex(parametersSerializer$1.parametersClass, WorkLauncherImpl.class);
        HashMap hashMap = (HashMap) simpleActor.messageQueue;
        if (hashMap.containsKey(serializerIndex)) {
            ParametersSerializer$1 parametersSerializer$12 = (ParametersSerializer$1) hashMap.get(serializerIndex);
            if (!parametersSerializer$12.equals(parametersSerializer$1) || parametersSerializer$1 != parametersSerializer$12) {
                MacWrapper$$ExternalSyntheticLambda0.m(serializerIndex, "Attempt to register non-equal serializer for already existing object of type: ");
            }
        } else {
            hashMap.put(serializerIndex, parametersSerializer$1);
        }
        this.registry.set(new SerializationRegistry(simpleActor));
    }

    public final Serialization serializeKey(TransactorKt transactorKt) {
        SerializationRegistry serializationRegistry = (SerializationRegistry) this.registry.get();
        serializationRegistry.getClass();
        SerializationRegistry.SerializerIndex serializerIndex = new SerializationRegistry.SerializerIndex(transactorKt.getClass(), ProtoKeySerialization.class);
        HashMap hashMap = serializationRegistry.keySerializerMap;
        if (hashMap.containsKey(serializerIndex)) {
            return ((KeySerializer$1) hashMap.get(serializerIndex)).val$function.serializeKey(transactorKt);
        }
        XAesGcmKey$$ExternalSyntheticBUOutline0.m("No Key serializer for ", serializerIndex, " available");
        return null;
    }

    public final Serialization serializeParameters(Parameters parameters) {
        SerializationRegistry serializationRegistry = (SerializationRegistry) this.registry.get();
        serializationRegistry.getClass();
        SerializationRegistry.SerializerIndex serializerIndex = new SerializationRegistry.SerializerIndex(parameters.getClass(), WorkLauncherImpl.class);
        HashMap hashMap = serializationRegistry.parametersSerializerMap;
        if (hashMap.containsKey(serializerIndex)) {
            return ((ParametersSerializer$1) hashMap.get(serializerIndex)).val$function.serializeParameters(parameters);
        }
        XAesGcmKey$$ExternalSyntheticBUOutline0.m("No Key Format serializer for ", serializerIndex, " available");
        return null;
    }
}
