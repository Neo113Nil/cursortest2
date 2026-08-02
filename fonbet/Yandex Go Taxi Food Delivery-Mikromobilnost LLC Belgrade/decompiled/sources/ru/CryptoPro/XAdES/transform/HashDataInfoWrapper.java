package ru.CryptoPro.XAdES.transform;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.w3c.dom.Element;

/* loaded from: classes4.dex */
public class HashDataInfoWrapper {
    private final Element element;
    private final List<String> transformAlgorithms;

    public HashDataInfoWrapper(Element element, List<String> list) {
        ArrayList arrayList = new ArrayList();
        this.transformAlgorithms = arrayList;
        this.element = element;
        arrayList.addAll(list);
    }

    public Element getElement() {
        return this.element;
    }

    public List<String> getTransformAlgorithms() {
        return Collections.unmodifiableList(this.transformAlgorithms);
    }
}
