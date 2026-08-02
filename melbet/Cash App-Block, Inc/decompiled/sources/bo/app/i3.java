package bo.app;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;

/* loaded from: classes3.dex */
public enum i3 {
    INTEGER(InquiryField.IntegerField.TYPE),
    COLOR("color"),
    BOOLEAN("bool"),
    STRING(InquiryField.StringField.TYPE),
    DRAWABLE_IDENTIFIER("drawable"),
    STRING_ARRAY("array");

    public final String a;

    i3(String str) {
        this.a = str;
    }
}
