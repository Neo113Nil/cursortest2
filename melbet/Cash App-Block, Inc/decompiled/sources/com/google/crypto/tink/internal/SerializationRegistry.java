package com.google.crypto.tink.internal;

import androidx.datastore.core.SimpleActor;
import com.google.crypto.tink.util.Bytes;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class SerializationRegistry {
    public final HashMap keyParserMap;
    public final HashMap keySerializerMap;
    public final HashMap parametersParserMap;
    public final HashMap parametersSerializerMap;

    public final class ParserIndex {
        public final Class keySerializationClass;
        public final Bytes serializationIdentifier;

        public ParserIndex(Class cls, Bytes bytes) {
            this.keySerializationClass = cls;
            this.serializationIdentifier = bytes;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ParserIndex)) {
                return false;
            }
            ParserIndex parserIndex = (ParserIndex) obj;
            return parserIndex.keySerializationClass.equals(this.keySerializationClass) && parserIndex.serializationIdentifier.equals(this.serializationIdentifier);
        }

        public final int hashCode() {
            return Objects.hash(this.keySerializationClass, this.serializationIdentifier);
        }

        public final String toString() {
            return this.keySerializationClass.getSimpleName() + ", object identifier: " + this.serializationIdentifier;
        }
    }

    public final class SerializerIndex {
        public final Class keyClass;
        public final Class keySerializationClass;

        public SerializerIndex(Class cls, Class cls2) {
            this.keyClass = cls;
            this.keySerializationClass = cls2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SerializerIndex)) {
                return false;
            }
            SerializerIndex serializerIndex = (SerializerIndex) obj;
            return serializerIndex.keyClass.equals(this.keyClass) && serializerIndex.keySerializationClass.equals(this.keySerializationClass);
        }

        public final int hashCode() {
            return Objects.hash(this.keyClass, this.keySerializationClass);
        }

        public final String toString() {
            return this.keyClass.getSimpleName() + " with serialization type: " + this.keySerializationClass.getSimpleName();
        }
    }

    public SerializationRegistry(SimpleActor simpleActor) {
        this.keySerializerMap = new HashMap((HashMap) simpleActor.scope);
        this.keyParserMap = new HashMap((HashMap) simpleActor.consumeMessage);
        this.parametersSerializerMap = new HashMap((HashMap) simpleActor.messageQueue);
        this.parametersParserMap = new HashMap((HashMap) simpleActor.remainingMessages);
    }
}
