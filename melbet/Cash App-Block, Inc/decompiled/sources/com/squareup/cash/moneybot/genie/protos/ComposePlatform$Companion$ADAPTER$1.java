package com.squareup.cash.moneybot.genie.protos;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class ComposePlatform$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0026. Please report as an issue. */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
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
        Object obj12 = null;
        Object obj13 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            Object obj14 = obj3;
            if (nextTag == -1) {
                return new ComposePlatform((ComposePlatform.Column) obj2, (ComposePlatform.Row) obj14, (ComposePlatform.Box) obj4, (ComposePlatform.Text) obj5, (ComposePlatform.Image) obj6, (ComposePlatform.Button) obj7, (ComposePlatform.TextField) obj8, (ComposePlatform.Switch) obj9, (ComposePlatform.Slider) obj10, (ComposePlatform.DropdownMenu) obj11, (ComposePlatform.DatePicker) obj12, (ComposePlatform.ProgressIndicator) obj13, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag != 100) {
                switch (nextTag) {
                    case 1:
                        obj = ComposePlatform.Column.ADAPTER.decode(protoReader);
                        obj3 = obj14;
                        break;
                    case 2:
                        obj3 = ComposePlatform.Row.ADAPTER.decode(protoReader);
                        obj = obj2;
                        break;
                    case 3:
                        obj4 = ComposePlatform.Box.ADAPTER.decode(protoReader);
                        obj3 = obj14;
                        obj = obj2;
                        break;
                    case 4:
                        obj5 = ComposePlatform.Text.ADAPTER.decode(protoReader);
                        obj3 = obj14;
                        obj = obj2;
                        break;
                    case 5:
                        obj6 = ComposePlatform.Image.ADAPTER.decode(protoReader);
                        obj3 = obj14;
                        obj = obj2;
                        break;
                    case 6:
                        obj7 = ComposePlatform.Button.ADAPTER.decode(protoReader);
                        obj3 = obj14;
                        obj = obj2;
                        break;
                    case 7:
                        obj8 = ComposePlatform.TextField.ADAPTER.decode(protoReader);
                        obj3 = obj14;
                        obj = obj2;
                        break;
                    case 8:
                        obj9 = ComposePlatform.Switch.ADAPTER.decode(protoReader);
                        obj3 = obj14;
                        obj = obj2;
                        break;
                    case 9:
                        obj10 = ComposePlatform.Slider.ADAPTER.decode(protoReader);
                        obj3 = obj14;
                        obj = obj2;
                        break;
                    case 10:
                        obj11 = ComposePlatform.DropdownMenu.ADAPTER.decode(protoReader);
                        obj3 = obj14;
                        obj = obj2;
                        break;
                    case 11:
                        obj12 = ComposePlatform.DatePicker.ADAPTER.decode(protoReader);
                        obj3 = obj14;
                        obj = obj2;
                        break;
                    case 12:
                        obj13 = ComposePlatform.ProgressIndicator.ADAPTER.decode(protoReader);
                        obj3 = obj14;
                        obj = obj2;
                        break;
                    default:
                        protoReader.readUnknownField(nextTag);
                        break;
                }
                obj2 = obj;
            } else {
                m.add(ComposePlatform.Modifier.ADAPTER.decode(protoReader));
            }
            obj = obj2;
            obj3 = obj14;
            obj2 = obj;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ComposePlatform composePlatform = (ComposePlatform) obj;
        reverseProtoWriter.getClass();
        composePlatform.getClass();
        reverseProtoWriter.writeBytes(composePlatform.unknownFields());
        ComposePlatform.ProgressIndicator.ADAPTER.encodeWithTag(reverseProtoWriter, 12, composePlatform.progress_indicator);
        ComposePlatform.DatePicker.ADAPTER.encodeWithTag(reverseProtoWriter, 11, composePlatform.date_picker);
        ComposePlatform.DropdownMenu.ADAPTER.encodeWithTag(reverseProtoWriter, 10, composePlatform.dropdown_menu);
        ComposePlatform.Slider.ADAPTER.encodeWithTag(reverseProtoWriter, 9, composePlatform.slider);
        ComposePlatform.Switch.ADAPTER.encodeWithTag(reverseProtoWriter, 8, composePlatform.switch_control);
        ComposePlatform.TextField.ADAPTER.encodeWithTag(reverseProtoWriter, 7, composePlatform.text_field);
        ComposePlatform.Button.ADAPTER.encodeWithTag(reverseProtoWriter, 6, composePlatform.button);
        ComposePlatform.Image.ADAPTER.encodeWithTag(reverseProtoWriter, 5, composePlatform.image);
        ComposePlatform.Text.ADAPTER.encodeWithTag(reverseProtoWriter, 4, composePlatform.text);
        ComposePlatform.Box.ADAPTER.encodeWithTag(reverseProtoWriter, 3, composePlatform.box);
        ComposePlatform.Row.ADAPTER.encodeWithTag(reverseProtoWriter, 2, composePlatform.row);
        ComposePlatform.Column.ADAPTER.encodeWithTag(reverseProtoWriter, 1, composePlatform.column);
        ComposePlatform.Modifier.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 100, composePlatform.modifiers);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ComposePlatform composePlatform = (ComposePlatform) obj;
        composePlatform.getClass();
        return ComposePlatform.Modifier.ADAPTER.asRepeated().encodedSizeWithTag(100, composePlatform.modifiers) + ComposePlatform.ProgressIndicator.ADAPTER.encodedSizeWithTag(12, composePlatform.progress_indicator) + ComposePlatform.DatePicker.ADAPTER.encodedSizeWithTag(11, composePlatform.date_picker) + ComposePlatform.DropdownMenu.ADAPTER.encodedSizeWithTag(10, composePlatform.dropdown_menu) + ComposePlatform.Slider.ADAPTER.encodedSizeWithTag(9, composePlatform.slider) + ComposePlatform.Switch.ADAPTER.encodedSizeWithTag(8, composePlatform.switch_control) + ComposePlatform.TextField.ADAPTER.encodedSizeWithTag(7, composePlatform.text_field) + ComposePlatform.Button.ADAPTER.encodedSizeWithTag(6, composePlatform.button) + ComposePlatform.Image.ADAPTER.encodedSizeWithTag(5, composePlatform.image) + ComposePlatform.Text.ADAPTER.encodedSizeWithTag(4, composePlatform.text) + ComposePlatform.Box.ADAPTER.encodedSizeWithTag(3, composePlatform.box) + ComposePlatform.Row.ADAPTER.encodedSizeWithTag(2, composePlatform.row) + ComposePlatform.Column.ADAPTER.encodedSizeWithTag(1, composePlatform.column) + composePlatform.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ComposePlatform composePlatform = (ComposePlatform) obj;
        composePlatform.getClass();
        ComposePlatform.Column column = composePlatform.column;
        ComposePlatform.Column column2 = column != null ? (ComposePlatform.Column) ComposePlatform.Column.ADAPTER.redact(column) : null;
        ComposePlatform.Row row = composePlatform.row;
        ComposePlatform.Row row2 = row != null ? (ComposePlatform.Row) ComposePlatform.Row.ADAPTER.redact(row) : null;
        ComposePlatform.Box box = composePlatform.box;
        ComposePlatform.Box box2 = box != null ? (ComposePlatform.Box) ComposePlatform.Box.ADAPTER.redact(box) : null;
        ComposePlatform.Text text = composePlatform.text;
        ComposePlatform.Text text2 = text != null ? (ComposePlatform.Text) ComposePlatform.Text.ADAPTER.redact(text) : null;
        ComposePlatform.Image image = composePlatform.image;
        ComposePlatform.Image image2 = image != null ? (ComposePlatform.Image) ComposePlatform.Image.ADAPTER.redact(image) : null;
        ComposePlatform.Button button = composePlatform.button;
        ComposePlatform.Button button2 = button != null ? (ComposePlatform.Button) ComposePlatform.Button.ADAPTER.redact(button) : null;
        ComposePlatform.TextField textField = composePlatform.text_field;
        ComposePlatform.TextField textField2 = textField != null ? (ComposePlatform.TextField) ComposePlatform.TextField.ADAPTER.redact(textField) : null;
        ComposePlatform.Switch r1 = composePlatform.switch_control;
        ComposePlatform.Switch r11 = r1 != null ? (ComposePlatform.Switch) ComposePlatform.Switch.ADAPTER.redact(r1) : null;
        ComposePlatform.Slider slider = composePlatform.slider;
        ComposePlatform.Slider slider2 = slider != null ? (ComposePlatform.Slider) ComposePlatform.Slider.ADAPTER.redact(slider) : null;
        ComposePlatform.DropdownMenu dropdownMenu = composePlatform.dropdown_menu;
        ComposePlatform.DropdownMenu dropdownMenu2 = dropdownMenu != null ? (ComposePlatform.DropdownMenu) ComposePlatform.DropdownMenu.ADAPTER.redact(dropdownMenu) : null;
        ComposePlatform.DatePicker datePicker = composePlatform.date_picker;
        ComposePlatform.DatePicker datePicker2 = datePicker != null ? (ComposePlatform.DatePicker) ComposePlatform.DatePicker.ADAPTER.redact(datePicker) : null;
        ComposePlatform.ProgressIndicator progressIndicator = composePlatform.progress_indicator;
        ComposePlatform.ProgressIndicator progressIndicator2 = progressIndicator != null ? (ComposePlatform.ProgressIndicator) ComposePlatform.ProgressIndicator.ADAPTER.redact(progressIndicator) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(composePlatform.modifiers, ComposePlatform.Modifier.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ComposePlatform(column2, row2, box2, text2, image2, button2, textField2, r11, slider2, dropdownMenu2, datePicker2, progressIndicator2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ComposePlatform composePlatform = (ComposePlatform) obj;
        composePlatform.getClass();
        ComposePlatform.Modifier.ADAPTER.asRepeated().encodeWithTag(protoWriter, 100, composePlatform.modifiers);
        ComposePlatform.Column.ADAPTER.encodeWithTag(protoWriter, 1, composePlatform.column);
        ComposePlatform.Row.ADAPTER.encodeWithTag(protoWriter, 2, composePlatform.row);
        ComposePlatform.Box.ADAPTER.encodeWithTag(protoWriter, 3, composePlatform.box);
        ComposePlatform.Text.ADAPTER.encodeWithTag(protoWriter, 4, composePlatform.text);
        ComposePlatform.Image.ADAPTER.encodeWithTag(protoWriter, 5, composePlatform.image);
        ComposePlatform.Button.ADAPTER.encodeWithTag(protoWriter, 6, composePlatform.button);
        ComposePlatform.TextField.ADAPTER.encodeWithTag(protoWriter, 7, composePlatform.text_field);
        ComposePlatform.Switch.ADAPTER.encodeWithTag(protoWriter, 8, composePlatform.switch_control);
        ComposePlatform.Slider.ADAPTER.encodeWithTag(protoWriter, 9, composePlatform.slider);
        ComposePlatform.DropdownMenu.ADAPTER.encodeWithTag(protoWriter, 10, composePlatform.dropdown_menu);
        ComposePlatform.DatePicker.ADAPTER.encodeWithTag(protoWriter, 11, composePlatform.date_picker);
        ComposePlatform.ProgressIndicator.ADAPTER.encodeWithTag(protoWriter, 12, composePlatform.progress_indicator);
        protoWriter.writeBytes(composePlatform.unknownFields());
    }
}
