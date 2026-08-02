package com.squareup.cash.mosaic.personalization.api.v1;

import com.squareup.cash.mosaic.personalization.api.v1.Entity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class Entity$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Entity$SpecificEntity$Payment entity$SpecificEntity$Payment = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Entity((String) obj, (Entity.Type) obj2, entity$SpecificEntity$Payment, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = Entity.Type.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                entity$SpecificEntity$Payment = new Entity$SpecificEntity$Payment((Entity.Payment) Entity.Payment.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Entity entity = (Entity) obj;
        reverseProtoWriter.getClass();
        entity.getClass();
        reverseProtoWriter.writeBytes(entity.unknownFields());
        Entity$SpecificEntity$Payment entity$SpecificEntity$Payment = entity.specific_entity;
        if (entity$SpecificEntity$Payment != null) {
            Entity.Payment.ADAPTER.encodeWithTag(reverseProtoWriter, 3, entity$SpecificEntity$Payment.value);
        } else if (entity$SpecificEntity$Payment != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        Entity.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 2, entity.entity_type);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, entity.entity_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Entity entity = (Entity) obj;
        entity.getClass();
        int encodedSizeWithTag = Entity.Type.ADAPTER.encodedSizeWithTag(2, entity.entity_type) + ProtoAdapter.STRING.encodedSizeWithTag(1, entity.entity_token) + entity.unknownFields().getSize$okio();
        Entity$SpecificEntity$Payment entity$SpecificEntity$Payment = entity.specific_entity;
        if (entity$SpecificEntity$Payment != null) {
            return Entity.Payment.ADAPTER.encodedSizeWithTag(3, entity$SpecificEntity$Payment.value) + encodedSizeWithTag;
        }
        if (entity$SpecificEntity$Payment == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Entity entity = (Entity) obj;
        entity.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = entity.entity_token;
        Entity.Type type2 = entity.entity_type;
        Entity$SpecificEntity$Payment entity$SpecificEntity$Payment = entity.specific_entity;
        byteString.getClass();
        return new Entity(str, type2, entity$SpecificEntity$Payment, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Entity entity = (Entity) obj;
        entity.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, entity.entity_token);
        Entity.Type.ADAPTER.encodeWithTag(protoWriter, 2, entity.entity_type);
        Entity$SpecificEntity$Payment entity$SpecificEntity$Payment = entity.specific_entity;
        if (entity$SpecificEntity$Payment != null) {
            Entity.Payment.ADAPTER.encodeWithTag(protoWriter, 3, entity$SpecificEntity$Payment.value);
        } else if (entity$SpecificEntity$Payment != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(entity.unknownFields());
    }
}
