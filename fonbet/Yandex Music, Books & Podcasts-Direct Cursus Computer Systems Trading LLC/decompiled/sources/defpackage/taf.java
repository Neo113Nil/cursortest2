package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class taf {
    public static final HashMap b;
    public HashMap a = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        try {
            hashMap.put("KeyAttribute", haf.class.getConstructor(null));
            hashMap.put("KeyPosition", ebf.class.getConstructor(null));
            hashMap.put("KeyCycle", kaf.class.getConstructor(null));
            hashMap.put("KeyTimeCycle", jbf.class.getConstructor(null));
            hashMap.put("KeyTrigger", lbf.class.getConstructor(null));
        } catch (NoSuchMethodException e) {
            Log.e("KeyFrames", "unable to load", e);
        }
    }

    public taf(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        caf cafVar;
        HashMap hashMap;
        HashMap hashMap2;
        caf jbfVar;
        try {
            eventType = xmlResourceParser.getEventType();
            cafVar = null;
        } catch (IOException e) {
            Log.e("KeyFrames", "Error parsing XML resource", e);
            return;
        } catch (XmlPullParserException e2) {
            Log.e("KeyFrames", "Error parsing XML resource", e2);
            return;
        }
        while (eventType != 1) {
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (b.containsKey(name)) {
                    switch (name.hashCode()) {
                        case -300573030:
                            if (!name.equals("KeyTimeCycle")) {
                                throw new NullPointerException("Key " + name + " not found");
                            }
                            jbfVar = new jbf();
                            jbfVar.e(context, Xml.asAttributeSet(xmlResourceParser));
                            b(jbfVar);
                            cafVar = jbfVar;
                            break;
                        case -298435811:
                            if (!name.equals("KeyAttribute")) {
                                throw new NullPointerException("Key " + name + " not found");
                            }
                            jbfVar = new haf();
                            jbfVar.e(context, Xml.asAttributeSet(xmlResourceParser));
                            b(jbfVar);
                            cafVar = jbfVar;
                            break;
                        case 540053991:
                            if (!name.equals("KeyCycle")) {
                                throw new NullPointerException("Key " + name + " not found");
                            }
                            jbfVar = new kaf();
                            jbfVar.e(context, Xml.asAttributeSet(xmlResourceParser));
                            b(jbfVar);
                            cafVar = jbfVar;
                            break;
                        case 1153397896:
                            if (!name.equals("KeyPosition")) {
                                throw new NullPointerException("Key " + name + " not found");
                            }
                            jbfVar = new ebf();
                            jbfVar.e(context, Xml.asAttributeSet(xmlResourceParser));
                            b(jbfVar);
                            cafVar = jbfVar;
                            break;
                        case 1308496505:
                            if (!name.equals("KeyTrigger")) {
                                throw new NullPointerException("Key " + name + " not found");
                            }
                            jbfVar = new lbf();
                            jbfVar.e(context, Xml.asAttributeSet(xmlResourceParser));
                            b(jbfVar);
                            cafVar = jbfVar;
                            break;
                        default:
                            throw new NullPointerException("Key " + name + " not found");
                    }
                    return;
                }
                if (name.equalsIgnoreCase("CustomAttribute")) {
                    if (cafVar != null && (hashMap2 = cafVar.d) != null) {
                        p86.d(context, xmlResourceParser, hashMap2);
                    }
                } else if (name.equalsIgnoreCase("CustomMethod") && cafVar != null && (hashMap = cafVar.d) != null) {
                    p86.d(context, xmlResourceParser, hashMap);
                }
            } else if (eventType == 3 && "KeyFrameSet".equals(xmlResourceParser.getName())) {
                return;
            }
            eventType = xmlResourceParser.next();
        }
    }

    public final void a(gei geiVar) {
        ArrayList arrayList = geiVar.w;
        HashMap hashMap = this.a;
        ArrayList arrayList2 = (ArrayList) hashMap.get(Integer.valueOf(geiVar.c));
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        ArrayList arrayList3 = (ArrayList) hashMap.get(-1);
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                caf cafVar = (caf) it.next();
                String str = ((t86) geiVar.b.getLayoutParams()).Y;
                String str2 = cafVar.c;
                if ((str2 == null || str == null) ? false : str.matches(str2)) {
                    arrayList.add(cafVar);
                }
            }
        }
    }

    public final void b(caf cafVar) {
        HashMap hashMap = this.a;
        if (!hashMap.containsKey(Integer.valueOf(cafVar.b))) {
            hashMap.put(Integer.valueOf(cafVar.b), new ArrayList());
        }
        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(cafVar.b));
        if (arrayList != null) {
            arrayList.add(cafVar);
        }
    }
}
