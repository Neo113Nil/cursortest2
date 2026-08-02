package com.fillr.browsersdk.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.passcode.screens.EndAppLock;
import com.fillr.core.model.ModelBase;
import com.fillr.core.utilities.SchemaTranslation;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.oneformapp.ProfileStore_;
import net.oneformapp.schema.Element;
import net.oneformapp.schema.Schema_;

/* loaded from: classes4.dex */
public final class FillrMappingsHelper extends ModelBase {
    public static final Parcelable.Creator<FillrMappingsHelper> CREATOR = new EndAppLock.Creator(28);
    public Map mappings;

    public static HashMap getMappings(Context context, ArrayList arrayList, boolean z, int i, boolean z2) {
        int i2;
        int i3;
        Element element;
        Element firstChildElement;
        boolean z3;
        int i4 = i;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Schema_ instance_ = Schema_.getInstance_(context);
        int i5 = 0;
        while (i5 < arrayList.size()) {
            FillrMappedField fillrMappedField = (FillrMappedField) arrayList.get(i5);
            if (fillrMappedField != null) {
                boolean z4 = fillrMappedField.isHiddenPostMutation;
                ArrayList arrayList2 = fillrMappedField.params;
                String str = fillrMappedField.param;
                if (!hashMap.containsKey(str) || !z4) {
                    if (str == null || arrayList2.contains(str) || !z2 || !str.startsWith("AddressDetails")) {
                        if (str == null || arrayList2.contains(str) || !z2) {
                            i2 = 1;
                            i3 = 0;
                        } else {
                            Element element2 = instance_.getElement(str);
                            if (element2 != null && element2.isNonRecursiveType() && element2.hasChildElements()) {
                                z3 = true;
                                for (Element element3 : element2.actingElement().children) {
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        if (element3.actingElement().pathKey.equals(((FillrMappedField) it.next()).param)) {
                                            z3 = false;
                                        }
                                    }
                                }
                                i2 = 1;
                                i3 = 0;
                            } else {
                                i2 = 1;
                                i3 = 0;
                                z3 = true;
                            }
                            if (z3) {
                                hashMap.put(str, fillrMappedField);
                                i5++;
                                i4 = i;
                            }
                        }
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            String str2 = (String) it2.next();
                            if (str2 != null && !str2.equalsIgnoreCase("ignore")) {
                                if (i4 == 0 || i4 != 3) {
                                    int i6 = i3;
                                    while (true) {
                                        ArrayList arrayList3 = SchemaTranslation.replaceArray;
                                        if (i6 >= arrayList3.size()) {
                                            break;
                                        }
                                        String str3 = (String) arrayList3.get(i6);
                                        String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i6, ".Address[", "]");
                                        if (str2.contains(str3)) {
                                            str2 = str2.replace(str3, m);
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                                if (!hashMap.containsKey(str2)) {
                                    hashMap.put(str2, fillrMappedField);
                                } else if (z) {
                                    if (context != null) {
                                        Schema_ instance_2 = Schema_.getInstance_(context);
                                        ProfileStore_.getInstance_(context);
                                        Element element4 = instance_2.getElement(str2);
                                        if (element4 != null && element4.actingElement().isFieldArray) {
                                            String formattedPathKey = Toolbar.AnonymousClass1.getFormattedPathKey(str2);
                                            if (formattedPathKey != null) {
                                                int length = formattedPathKey.split("\\.").length;
                                                element = instance_2.getElement(formattedPathKey);
                                                if (element != null) {
                                                    for (int i7 = i2; i7 < length; i7++) {
                                                        if (element != null) {
                                                            if (element.actingElement().isArrayType) {
                                                                break;
                                                            }
                                                            element = instance_2.getElement(element.getFormattedParentPathKey());
                                                        }
                                                    }
                                                }
                                            } else {
                                                element = null;
                                            }
                                            if (element != null && (firstChildElement = element.getFirstChildElement()) != null) {
                                                Integer num = (Integer) hashMap2.get(str2);
                                                if (num == null) {
                                                    num = Integer.valueOf(i3);
                                                }
                                                Integer valueOf = Integer.valueOf(num.intValue() + 1);
                                                hashMap2.put(str2, valueOf);
                                                StringBuilder sb = new StringBuilder();
                                                NavAction$$ExternalSyntheticOutline0.m(sb, firstChildElement.actingElement().pathKey, "[", valueOf, "]");
                                                sb.append(element4.actingElement().pathKey.substring(firstChildElement.actingElement().pathKey.length(), element4.actingElement().pathKey.length()));
                                                str2 = sb.toString();
                                            }
                                        }
                                    }
                                    if (!hashMap.containsKey(str2) || !z4) {
                                        hashMap.put(str2, fillrMappedField);
                                    }
                                }
                            }
                            i4 = i;
                        }
                        i5++;
                        i4 = i;
                    } else {
                        hashMap.put(str, fillrMappedField);
                    }
                }
            }
            i5++;
            i4 = i;
        }
        return hashMap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.fillr.core.model.ModelBase
    public final boolean onValidate() {
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable((Serializable) this.mappings);
    }
}
