package com.squareup.cash.moneybot.genie.protos;

import com.squareup.cash.moneybot.genie.protos.Node;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.Expression;

/* loaded from: classes6.dex */
public final class Node$Motion$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Node.Motion((Expression) obj, (Node.Motion.Transition) obj2, (Node.Motion.Transition) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = Node.Motion.Transition.ADAPTER.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = Node.Motion.Transition.ADAPTER.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Node.Motion motion = (Node.Motion) obj;
        reverseProtoWriter.getClass();
        motion.getClass();
        reverseProtoWriter.writeBytes(motion.unknownFields());
        ProtoAdapter protoAdapter = Node.Motion.Transition.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, motion.exit);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, motion.enter);
        Expression.ADAPTER.encodeWithTag(reverseProtoWriter, 1, motion.motion_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Node.Motion motion = (Node.Motion) obj;
        motion.getClass();
        int encodedSizeWithTag = Expression.ADAPTER.encodedSizeWithTag(1, motion.motion_id) + motion.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Node.Motion.Transition.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, motion.exit) + protoAdapter.encodedSizeWithTag(2, motion.enter) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Node.Motion motion = (Node.Motion) obj;
        motion.getClass();
        Expression expression = motion.motion_id;
        Expression expression2 = expression != null ? (Expression) Expression.ADAPTER.redact(expression) : null;
        Node.Motion.Transition transition = motion.enter;
        Node.Motion.Transition transition2 = transition != null ? (Node.Motion.Transition) Node.Motion.Transition.ADAPTER.redact(transition) : null;
        Node.Motion.Transition transition3 = motion.exit;
        Node.Motion.Transition transition4 = transition3 != null ? (Node.Motion.Transition) Node.Motion.Transition.ADAPTER.redact(transition3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Node.Motion(expression2, transition2, transition4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Node.Motion motion = (Node.Motion) obj;
        motion.getClass();
        Expression.ADAPTER.encodeWithTag(protoWriter, 1, motion.motion_id);
        ProtoAdapter protoAdapter = Node.Motion.Transition.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, motion.enter);
        protoAdapter.encodeWithTag(protoWriter, 3, motion.exit);
        protoWriter.writeBytes(motion.unknownFields());
    }
}
