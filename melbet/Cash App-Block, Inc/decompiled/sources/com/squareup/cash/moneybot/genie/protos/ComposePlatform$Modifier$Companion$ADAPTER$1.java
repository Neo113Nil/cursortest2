package com.squareup.cash.moneybot.genie.protos;

import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class ComposePlatform$Modifier$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ComposePlatform.Modifier((ComposePlatform.Modifier.Size) obj, (ComposePlatform.Modifier.Padding) obj2, (ComposePlatform.Modifier.ContentColor) obj3, (ComposePlatform.Modifier.Background) obj4, (ComposePlatform.Modifier.TextStyle) obj5, (ComposePlatform.Modifier.Alpha) obj6, (ComposePlatform.Modifier.Clip) obj7, (ComposePlatform.Modifier.Overlay) obj8, (ComposePlatform.Modifier.Border) obj9, (ComposePlatform.Modifier.WrapContentSize) obj10, (ComposePlatform.Modifier.Tint) obj11, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ComposePlatform.Modifier.Size.ADAPTER.decode(protoReader);
                    break;
                case 2:
                    obj2 = ComposePlatform.Modifier.Padding.ADAPTER.decode(protoReader);
                    break;
                case 3:
                    obj3 = ComposePlatform.Modifier.ContentColor.ADAPTER.decode(protoReader);
                    break;
                case 4:
                    obj4 = ComposePlatform.Modifier.Background.ADAPTER.decode(protoReader);
                    break;
                case 5:
                    obj5 = ComposePlatform.Modifier.TextStyle.ADAPTER.decode(protoReader);
                    break;
                case 6:
                    obj6 = ComposePlatform.Modifier.Alpha.ADAPTER.decode(protoReader);
                    break;
                case 7:
                    obj7 = ComposePlatform.Modifier.Clip.ADAPTER.decode(protoReader);
                    break;
                case 8:
                    obj8 = ComposePlatform.Modifier.Overlay.ADAPTER.decode(protoReader);
                    break;
                case 9:
                    obj9 = ComposePlatform.Modifier.Border.ADAPTER.decode(protoReader);
                    break;
                case 10:
                    obj10 = ComposePlatform.Modifier.WrapContentSize.ADAPTER.decode(protoReader);
                    break;
                case 11:
                    obj11 = ComposePlatform.Modifier.Tint.ADAPTER.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ComposePlatform.Modifier modifier = (ComposePlatform.Modifier) obj;
        reverseProtoWriter.getClass();
        modifier.getClass();
        reverseProtoWriter.writeBytes(modifier.unknownFields());
        ComposePlatform.Modifier.Tint.ADAPTER.encodeWithTag(reverseProtoWriter, 11, modifier.tint);
        ComposePlatform.Modifier.WrapContentSize.ADAPTER.encodeWithTag(reverseProtoWriter, 10, modifier.wrap_content_size);
        ComposePlatform.Modifier.Border.ADAPTER.encodeWithTag(reverseProtoWriter, 9, modifier.border);
        ComposePlatform.Modifier.Overlay.ADAPTER.encodeWithTag(reverseProtoWriter, 8, modifier.overlay);
        ComposePlatform.Modifier.Clip.ADAPTER.encodeWithTag(reverseProtoWriter, 7, modifier.clip);
        ComposePlatform.Modifier.Alpha.ADAPTER.encodeWithTag(reverseProtoWriter, 6, modifier.alpha);
        ComposePlatform.Modifier.TextStyle.ADAPTER.encodeWithTag(reverseProtoWriter, 5, modifier.text_style);
        ComposePlatform.Modifier.Background.ADAPTER.encodeWithTag(reverseProtoWriter, 4, modifier.background);
        ComposePlatform.Modifier.ContentColor.ADAPTER.encodeWithTag(reverseProtoWriter, 3, modifier.content_color);
        ComposePlatform.Modifier.Padding.ADAPTER.encodeWithTag(reverseProtoWriter, 2, modifier.padding);
        ComposePlatform.Modifier.Size.ADAPTER.encodeWithTag(reverseProtoWriter, 1, modifier.size);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ComposePlatform.Modifier modifier = (ComposePlatform.Modifier) obj;
        modifier.getClass();
        return ComposePlatform.Modifier.Tint.ADAPTER.encodedSizeWithTag(11, modifier.tint) + ComposePlatform.Modifier.WrapContentSize.ADAPTER.encodedSizeWithTag(10, modifier.wrap_content_size) + ComposePlatform.Modifier.Border.ADAPTER.encodedSizeWithTag(9, modifier.border) + ComposePlatform.Modifier.Overlay.ADAPTER.encodedSizeWithTag(8, modifier.overlay) + ComposePlatform.Modifier.Clip.ADAPTER.encodedSizeWithTag(7, modifier.clip) + ComposePlatform.Modifier.Alpha.ADAPTER.encodedSizeWithTag(6, modifier.alpha) + ComposePlatform.Modifier.TextStyle.ADAPTER.encodedSizeWithTag(5, modifier.text_style) + ComposePlatform.Modifier.Background.ADAPTER.encodedSizeWithTag(4, modifier.background) + ComposePlatform.Modifier.ContentColor.ADAPTER.encodedSizeWithTag(3, modifier.content_color) + ComposePlatform.Modifier.Padding.ADAPTER.encodedSizeWithTag(2, modifier.padding) + ComposePlatform.Modifier.Size.ADAPTER.encodedSizeWithTag(1, modifier.size) + modifier.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ComposePlatform.Modifier modifier = (ComposePlatform.Modifier) obj;
        modifier.getClass();
        ComposePlatform.Modifier.Size size = modifier.size;
        ComposePlatform.Modifier.Size size2 = size != null ? (ComposePlatform.Modifier.Size) ComposePlatform.Modifier.Size.ADAPTER.redact(size) : null;
        ComposePlatform.Modifier.Padding padding = modifier.padding;
        ComposePlatform.Modifier.Padding padding2 = padding != null ? (ComposePlatform.Modifier.Padding) ComposePlatform.Modifier.Padding.ADAPTER.redact(padding) : null;
        ComposePlatform.Modifier.ContentColor contentColor = modifier.content_color;
        ComposePlatform.Modifier.ContentColor contentColor2 = contentColor != null ? (ComposePlatform.Modifier.ContentColor) ComposePlatform.Modifier.ContentColor.ADAPTER.redact(contentColor) : null;
        ComposePlatform.Modifier.Background background = modifier.background;
        ComposePlatform.Modifier.Background background2 = background != null ? (ComposePlatform.Modifier.Background) ComposePlatform.Modifier.Background.ADAPTER.redact(background) : null;
        ComposePlatform.Modifier.TextStyle textStyle = modifier.text_style;
        ComposePlatform.Modifier.TextStyle textStyle2 = textStyle != null ? (ComposePlatform.Modifier.TextStyle) ComposePlatform.Modifier.TextStyle.ADAPTER.redact(textStyle) : null;
        ComposePlatform.Modifier.Alpha alpha = modifier.alpha;
        ComposePlatform.Modifier.Alpha alpha2 = alpha != null ? (ComposePlatform.Modifier.Alpha) ComposePlatform.Modifier.Alpha.ADAPTER.redact(alpha) : null;
        ComposePlatform.Modifier.Clip clip = modifier.clip;
        ComposePlatform.Modifier.Clip clip2 = clip != null ? (ComposePlatform.Modifier.Clip) ComposePlatform.Modifier.Clip.ADAPTER.redact(clip) : null;
        ComposePlatform.Modifier.Overlay overlay = modifier.overlay;
        ComposePlatform.Modifier.Overlay overlay2 = overlay != null ? (ComposePlatform.Modifier.Overlay) ComposePlatform.Modifier.Overlay.ADAPTER.redact(overlay) : null;
        ComposePlatform.Modifier.Border border = modifier.border;
        ComposePlatform.Modifier.Border border2 = border != null ? (ComposePlatform.Modifier.Border) ComposePlatform.Modifier.Border.ADAPTER.redact(border) : null;
        ComposePlatform.Modifier.WrapContentSize wrapContentSize = modifier.wrap_content_size;
        ComposePlatform.Modifier.WrapContentSize wrapContentSize2 = wrapContentSize != null ? (ComposePlatform.Modifier.WrapContentSize) ComposePlatform.Modifier.WrapContentSize.ADAPTER.redact(wrapContentSize) : null;
        ComposePlatform.Modifier.Tint tint = modifier.tint;
        ComposePlatform.Modifier.Tint tint2 = tint != null ? (ComposePlatform.Modifier.Tint) ComposePlatform.Modifier.Tint.ADAPTER.redact(tint) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ComposePlatform.Modifier(size2, padding2, contentColor2, background2, textStyle2, alpha2, clip2, overlay2, border2, wrapContentSize2, tint2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ComposePlatform.Modifier modifier = (ComposePlatform.Modifier) obj;
        modifier.getClass();
        ComposePlatform.Modifier.Size.ADAPTER.encodeWithTag(protoWriter, 1, modifier.size);
        ComposePlatform.Modifier.Padding.ADAPTER.encodeWithTag(protoWriter, 2, modifier.padding);
        ComposePlatform.Modifier.ContentColor.ADAPTER.encodeWithTag(protoWriter, 3, modifier.content_color);
        ComposePlatform.Modifier.Background.ADAPTER.encodeWithTag(protoWriter, 4, modifier.background);
        ComposePlatform.Modifier.TextStyle.ADAPTER.encodeWithTag(protoWriter, 5, modifier.text_style);
        ComposePlatform.Modifier.Alpha.ADAPTER.encodeWithTag(protoWriter, 6, modifier.alpha);
        ComposePlatform.Modifier.Clip.ADAPTER.encodeWithTag(protoWriter, 7, modifier.clip);
        ComposePlatform.Modifier.Overlay.ADAPTER.encodeWithTag(protoWriter, 8, modifier.overlay);
        ComposePlatform.Modifier.Border.ADAPTER.encodeWithTag(protoWriter, 9, modifier.border);
        ComposePlatform.Modifier.WrapContentSize.ADAPTER.encodeWithTag(protoWriter, 10, modifier.wrap_content_size);
        ComposePlatform.Modifier.Tint.ADAPTER.encodeWithTag(protoWriter, 11, modifier.tint);
        protoWriter.writeBytes(modifier.unknownFields());
    }
}
