package com.squareup.cash.moneybot.genie.protos;

import com.squareup.cash.moneybot.genie.protos.Node;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.EasingCurve;
import xyz.block.protos.genie.TransitionEffect$Fade;
import xyz.block.protos.genie.TransitionEffect$Instant;
import xyz.block.protos.genie.TransitionEffect$Scale;

/* loaded from: classes6.dex */
public final class Node$Motion$Transition$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Node.Motion.Transition((TransitionEffect$Instant) obj, (TransitionEffect$Fade) obj2, (TransitionEffect$Scale) obj3, (Integer) obj4, (EasingCurve) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransitionEffect$Instant.ADAPTER.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransitionEffect$Fade.ADAPTER.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransitionEffect$Scale.ADAPTER.decode(protoReader);
            } else if (nextTag == 5) {
                obj4 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 6) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = EasingCurve.ADAPTER.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Node.Motion.Transition transition = (Node.Motion.Transition) obj;
        reverseProtoWriter.getClass();
        transition.getClass();
        reverseProtoWriter.writeBytes(transition.unknownFields());
        TransitionEffect$Scale.ADAPTER.encodeWithTag(reverseProtoWriter, 3, transition.scale);
        TransitionEffect$Fade.ADAPTER.encodeWithTag(reverseProtoWriter, 2, transition.fade);
        TransitionEffect$Instant.ADAPTER.encodeWithTag(reverseProtoWriter, 1, transition.instant);
        EasingCurve.ADAPTER.encodeWithTag(reverseProtoWriter, 6, transition.easing_curve);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 5, transition.duration_ms);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Node.Motion.Transition transition = (Node.Motion.Transition) obj;
        transition.getClass();
        return EasingCurve.ADAPTER.encodedSizeWithTag(6, transition.easing_curve) + ProtoAdapter.INT32.encodedSizeWithTag(5, transition.duration_ms) + TransitionEffect$Scale.ADAPTER.encodedSizeWithTag(3, transition.scale) + TransitionEffect$Fade.ADAPTER.encodedSizeWithTag(2, transition.fade) + TransitionEffect$Instant.ADAPTER.encodedSizeWithTag(1, transition.instant) + transition.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Node.Motion.Transition transition = (Node.Motion.Transition) obj;
        transition.getClass();
        TransitionEffect$Instant transitionEffect$Instant = transition.instant;
        TransitionEffect$Instant transitionEffect$Instant2 = transitionEffect$Instant != null ? (TransitionEffect$Instant) TransitionEffect$Instant.ADAPTER.redact(transitionEffect$Instant) : null;
        TransitionEffect$Fade transitionEffect$Fade = transition.fade;
        TransitionEffect$Fade transitionEffect$Fade2 = transitionEffect$Fade != null ? (TransitionEffect$Fade) TransitionEffect$Fade.ADAPTER.redact(transitionEffect$Fade) : null;
        TransitionEffect$Scale transitionEffect$Scale = transition.scale;
        TransitionEffect$Scale transitionEffect$Scale2 = transitionEffect$Scale != null ? (TransitionEffect$Scale) TransitionEffect$Scale.ADAPTER.redact(transitionEffect$Scale) : null;
        EasingCurve easingCurve = transition.easing_curve;
        EasingCurve easingCurve2 = easingCurve != null ? (EasingCurve) EasingCurve.ADAPTER.redact(easingCurve) : null;
        ByteString byteString = ByteString.EMPTY;
        Integer num = transition.duration_ms;
        byteString.getClass();
        return new Node.Motion.Transition(transitionEffect$Instant2, transitionEffect$Fade2, transitionEffect$Scale2, num, easingCurve2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Node.Motion.Transition transition = (Node.Motion.Transition) obj;
        transition.getClass();
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, transition.duration_ms);
        EasingCurve.ADAPTER.encodeWithTag(protoWriter, 6, transition.easing_curve);
        TransitionEffect$Instant.ADAPTER.encodeWithTag(protoWriter, 1, transition.instant);
        TransitionEffect$Fade.ADAPTER.encodeWithTag(protoWriter, 2, transition.fade);
        TransitionEffect$Scale.ADAPTER.encodeWithTag(protoWriter, 3, transition.scale);
        protoWriter.writeBytes(transition.unknownFields());
    }
}
