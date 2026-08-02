package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class KeyFrames {
    public static final HashMap sKeyMakers;
    public HashMap mFramesMap = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        sKeyMakers = hashMap;
        try {
            hashMap.put("KeyAttribute", KeyAttributes.class.getConstructor(null));
            hashMap.put("KeyPosition", KeyPosition.class.getConstructor(null));
            hashMap.put("KeyCycle", KeyCycle.class.getConstructor(null));
            hashMap.put("KeyTimeCycle", KeyTimeCycle.class.getConstructor(null));
            hashMap.put("KeyTrigger", KeyTrigger.class.getConstructor(null));
        } catch (NoSuchMethodException e) {
            Log.e("KeyFrames", "unable to load", e);
        }
    }

    public KeyFrames(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        Key key;
        HashMap hashMap;
        HashMap hashMap2;
        Key keyTimeCycle;
        try {
            eventType = xmlResourceParser.getEventType();
            key = null;
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
                if (sKeyMakers.containsKey(name)) {
                    switch (name.hashCode()) {
                        case -300573030:
                            if (!name.equals("KeyTimeCycle")) {
                                throw new NullPointerException("Key " + name + " not found");
                            }
                            keyTimeCycle = new KeyTimeCycle();
                            keyTimeCycle.load(context, Xml.asAttributeSet(xmlResourceParser));
                            addKey(keyTimeCycle);
                            key = keyTimeCycle;
                            break;
                        case -298435811:
                            if (!name.equals("KeyAttribute")) {
                                throw new NullPointerException("Key " + name + " not found");
                            }
                            keyTimeCycle = new KeyAttributes();
                            keyTimeCycle.load(context, Xml.asAttributeSet(xmlResourceParser));
                            addKey(keyTimeCycle);
                            key = keyTimeCycle;
                            break;
                        case 540053991:
                            if (!name.equals("KeyCycle")) {
                                throw new NullPointerException("Key " + name + " not found");
                            }
                            keyTimeCycle = new KeyCycle();
                            keyTimeCycle.load(context, Xml.asAttributeSet(xmlResourceParser));
                            addKey(keyTimeCycle);
                            key = keyTimeCycle;
                            break;
                        case 1153397896:
                            if (!name.equals("KeyPosition")) {
                                throw new NullPointerException("Key " + name + " not found");
                            }
                            keyTimeCycle = new KeyPosition();
                            keyTimeCycle.load(context, Xml.asAttributeSet(xmlResourceParser));
                            addKey(keyTimeCycle);
                            key = keyTimeCycle;
                            break;
                        case 1308496505:
                            if (!name.equals("KeyTrigger")) {
                                throw new NullPointerException("Key " + name + " not found");
                            }
                            keyTimeCycle = new KeyTrigger();
                            keyTimeCycle.load(context, Xml.asAttributeSet(xmlResourceParser));
                            addKey(keyTimeCycle);
                            key = keyTimeCycle;
                            break;
                        default:
                            throw new NullPointerException("Key " + name + " not found");
                    }
                    return;
                }
                if (name.equalsIgnoreCase("CustomAttribute")) {
                    if (key != null && (hashMap2 = key.mCustomConstraints) != null) {
                        ConstraintAttribute.parse(context, xmlResourceParser, hashMap2);
                    }
                } else if (name.equalsIgnoreCase("CustomMethod") && key != null && (hashMap = key.mCustomConstraints) != null) {
                    ConstraintAttribute.parse(context, xmlResourceParser, hashMap);
                }
            } else if (eventType == 3 && "KeyFrameSet".equals(xmlResourceParser.getName())) {
                return;
            }
            eventType = xmlResourceParser.next();
        }
    }

    public final void addFrames(MotionController motionController) {
        ArrayList arrayList = motionController.mKeyList;
        HashMap hashMap = this.mFramesMap;
        ArrayList arrayList2 = (ArrayList) hashMap.get(Integer.valueOf(motionController.mId));
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        ArrayList arrayList3 = (ArrayList) hashMap.get(-1);
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                Key key = (Key) it.next();
                String str = ((ConstraintLayout.LayoutParams) motionController.mView.getLayoutParams()).constraintTag;
                String str2 = key.mTargetString;
                if ((str2 == null || str == null) ? false : str.matches(str2)) {
                    arrayList.add(key);
                }
            }
        }
    }

    public final void addKey(Key key) {
        HashMap hashMap = this.mFramesMap;
        if (!hashMap.containsKey(Integer.valueOf(key.mTargetId))) {
            hashMap.put(Integer.valueOf(key.mTargetId), new ArrayList());
        }
        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(key.mTargetId));
        if (arrayList != null) {
            arrayList.add(key);
        }
    }
}
