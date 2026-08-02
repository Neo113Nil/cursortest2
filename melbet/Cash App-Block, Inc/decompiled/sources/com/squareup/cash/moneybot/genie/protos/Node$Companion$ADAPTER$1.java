package com.squareup.cash.moneybot.genie.protos;

import com.squareup.cash.moneybot.genie.protos.Node;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import xyz.block.protos.genie.Expression;

/* loaded from: classes6.dex */
public final class Node$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Node((ForEach) obj, (MoneybotScaffold) obj2, (ComposePlatform) obj3, (Expression) obj4, (Node.Motion) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ForEach.ADAPTER.decode(protoReader);
            } else if (nextTag == 100) {
                obj2 = MoneybotScaffold.ADAPTER.decode(protoReader);
            } else if (nextTag == 101) {
                obj3 = ComposePlatform.ADAPTER.decode(protoReader);
            } else if (nextTag == 1001) {
                obj4 = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag != 1002) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = Node.Motion.ADAPTER.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Node node = (Node) obj;
        reverseProtoWriter.getClass();
        node.getClass();
        reverseProtoWriter.writeBytes(node.unknownFields());
        ComposePlatform.ADAPTER.encodeWithTag(reverseProtoWriter, 101, node.compose_platform);
        MoneybotScaffold.ADAPTER.encodeWithTag(reverseProtoWriter, 100, node.moneybot_scaffold);
        ForEach.ADAPTER.encodeWithTag(reverseProtoWriter, 1, node.for_each);
        Node.Motion.ADAPTER.encodeWithTag(reverseProtoWriter, IptcConstants.IMAGE_RESOURCE_BLOCK_XML_DATA, node.motion);
        Expression.ADAPTER.encodeWithTag(reverseProtoWriter, IptcConstants.IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO, node.is_included);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Node node = (Node) obj;
        node.getClass();
        return Node.Motion.ADAPTER.encodedSizeWithTag(IptcConstants.IMAGE_RESOURCE_BLOCK_XML_DATA, node.motion) + Expression.ADAPTER.encodedSizeWithTag(IptcConstants.IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO, node.is_included) + ComposePlatform.ADAPTER.encodedSizeWithTag(101, node.compose_platform) + MoneybotScaffold.ADAPTER.encodedSizeWithTag(100, node.moneybot_scaffold) + ForEach.ADAPTER.encodedSizeWithTag(1, node.for_each) + node.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Node node = (Node) obj;
        node.getClass();
        ForEach forEach = node.for_each;
        ForEach forEach2 = forEach != null ? (ForEach) ForEach.ADAPTER.redact(forEach) : null;
        MoneybotScaffold moneybotScaffold = node.moneybot_scaffold;
        MoneybotScaffold moneybotScaffold2 = moneybotScaffold != null ? (MoneybotScaffold) MoneybotScaffold.ADAPTER.redact(moneybotScaffold) : null;
        ComposePlatform composePlatform = node.compose_platform;
        ComposePlatform composePlatform2 = composePlatform != null ? (ComposePlatform) ComposePlatform.ADAPTER.redact(composePlatform) : null;
        Expression expression = node.is_included;
        Expression expression2 = expression != null ? (Expression) Expression.ADAPTER.redact(expression) : null;
        Node.Motion motion = node.motion;
        Node.Motion motion2 = motion != null ? (Node.Motion) Node.Motion.ADAPTER.redact(motion) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Node(forEach2, moneybotScaffold2, composePlatform2, expression2, motion2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Node node = (Node) obj;
        node.getClass();
        Expression.ADAPTER.encodeWithTag(protoWriter, IptcConstants.IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO, node.is_included);
        Node.Motion.ADAPTER.encodeWithTag(protoWriter, IptcConstants.IMAGE_RESOURCE_BLOCK_XML_DATA, node.motion);
        ForEach.ADAPTER.encodeWithTag(protoWriter, 1, node.for_each);
        MoneybotScaffold.ADAPTER.encodeWithTag(protoWriter, 100, node.moneybot_scaffold);
        ComposePlatform.ADAPTER.encodeWithTag(protoWriter, 101, node.compose_platform);
        protoWriter.writeBytes(node.unknownFields());
    }
}
