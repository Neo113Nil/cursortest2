package com.fillr;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import org.w3c.dom.Element;

/* loaded from: classes4.dex */
public abstract class s0 extends v {
    public String i;

    public static s0 a(Element element) {
        s0 d1Var;
        String localName = element.getLocalName();
        element.getAttribute("fixed").equals("true");
        if (localName.equals("enumeration")) {
            d1Var = new p0();
        } else if (localName.equals("fractionDigits")) {
            d1Var = new a2();
        } else if (localName.equals("length")) {
            d1Var = new a2();
        } else if (localName.equals("maxExclusive")) {
            d1Var = new d1();
        } else if (localName.equals("maxInclusive")) {
            d1Var = new d1();
        } else if (localName.equals("maxLength")) {
            d1Var = new a2();
        } else if (localName.equals("minLength")) {
            d1Var = new a2();
        } else if (localName.equals("minExclusive")) {
            d1Var = new d1();
        } else if (localName.equals("minInclusive")) {
            d1Var = new d1();
        } else if (localName.equals("pattern")) {
            d1Var = new d1();
        } else if (localName.equals("totalDigits")) {
            d1Var = new a2();
        } else {
            if (!localName.equals("whiteSpace")) {
                throw new q0(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Incorrect facet with name \"", localName, "\" found."));
            }
            d1Var = new d1();
        }
        if (element.hasAttribute("id")) {
            d1Var.f = element.getAttribute("id");
        }
        d1Var.i = element.getAttribute("value");
        return d1Var;
    }
}
