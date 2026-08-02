package ru.CryptoPro.JCPRequest.ca15.decoder;

import java.util.Vector;

/* loaded from: classes4.dex */
public class CA15UserRegistrationField extends SimpleHTMLDecoder {
    public static final int EDIT_TYPE = 0;
    public static final int SELECT_TYPE = 2;
    public static final int SEPARATOR_TYPE = 2;
    public static final int TEXTAREA_TYPE = 1;
    public static final int UNKNOWN_TYPE = -1;
    public static final String[] i = {"<nobr>", "&nbsp;", "</nobr>", "&quot;", "'"};
    public boolean b = false;
    public String c = "";
    public String d = "";
    public int e = -1;
    public String f = "";
    public final Vector g = new Vector(0);
    public int h = -1;

    public CA15UserRegistrationField(String str) {
        this.a = str;
    }

    public Vector getAllowedValues() {
        return this.g;
    }

    public int getComponentType() {
        return this.h;
    }

    public String getFormName() {
        return this.d;
    }

    public boolean getMandatory() {
        return this.b;
    }

    public int getMaxLength() {
        return this.e;
    }

    public String getName() {
        return this.c;
    }

    public String getValue() {
        return this.f;
    }
}
