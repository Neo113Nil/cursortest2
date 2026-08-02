package ru.CryptoPro.XAdES;

import defpackage.ls61;
import defpackage.qv10;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ru.CryptoPro.XAdES.transform.ITransform;

/* loaded from: classes4.dex */
public class DataObjects implements Cloneable {
    public final LinkedList a;
    public final HashMap b;
    public IdentifierGenerator c;
    public boolean w;
    public final LinkedList x;

    public DataObjects(DataObjects dataObjects) {
        LinkedList linkedList = new LinkedList();
        this.a = linkedList;
        this.b = new HashMap();
        this.c = new DefaultIdentifierGenerator();
        this.w = false;
        LinkedList linkedList2 = new LinkedList();
        this.x = linkedList2;
        linkedList.addAll(dataObjects.a);
        linkedList2.addAll(dataObjects.x);
        this.b = new HashMap(dataObjects.b);
        this.c = dataObjects.c;
    }

    public final String a() {
        String generate = this.c.generate();
        this.w = true;
        Iterator it = this.b.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            ((ls61) it.next()).a = qv10.h(i, generate, "-SignedDataObject-");
            i++;
        }
        return generate;
    }

    public void addTransform(ITransform iTransform) {
        this.x.add(iTransform);
    }

    public void addUri(Object obj, ls61 ls61Var) {
        this.a.add(obj);
        ls61 ls61Var2 = new ls61();
        ls61Var.getClass();
        ls61Var2.a = ls61Var.a;
        this.b.put(obj, ls61Var2);
    }

    public final Object clone() {
        return new DataObjects(this);
    }

    public void setSignatureIdGenerator(IdentifierGenerator identifierGenerator) {
        if (identifierGenerator != null) {
            this.c = identifierGenerator;
        }
    }

    public void addUri(Object obj) {
        this.a.add(obj);
    }

    public DataObjects(List list) {
        LinkedList linkedList = new LinkedList();
        this.a = linkedList;
        this.b = new HashMap();
        this.c = new DefaultIdentifierGenerator();
        this.w = false;
        this.x = new LinkedList();
        linkedList.addAll(list);
    }

    public DataObjects() {
        this.a = new LinkedList();
        this.b = new HashMap();
        this.c = new DefaultIdentifierGenerator();
        this.w = false;
        this.x = new LinkedList();
    }
}
