package com.fillr.browsersdk.model;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.profileinstaller.DeviceProfileWriter;
import coil3.request.OneShotDisposable;
import com.fillr.core.utilities.AppPreferenceStore;
import com.fillr.core.utilities.SchemaTranslation;
import com.fillr.n;
import com.fillr.service.CaptureFieldsMappingService;
import com.squareup.cash.R;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.text.MatchResult;
import net.idrnd.face.iad.capture.internal.o0;
import net.oneformapp.ProfileStore_;
import net.oneformapp.helper.CalendarConverter;
import net.oneformapp.helper.matching.POPMatchingGender;
import net.oneformapp.schema.Element;
import net.oneformapp.schema.ElementType;
import net.oneformapp.schema.Schema_;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class FillrMappingProcessor implements Serializable {
    public HashMap arrayGroupRequired;
    public final Toolbar.AnonymousClass1 arrayManager;
    public final DeviceProfileWriter captureValuesProcessor;
    public final CaptureFieldsMappingService context;
    public final HashMap fieldNamespaces;
    public final FillrMappedFields fields;
    public final LinkedHashMap fieldsWithData;
    public final HashMap mFieldValues;
    public final AppPreferenceStore mPreferences;
    public final n.b massager;
    public final ProfileStore_ profileStore;
    public final Schema_ schema;

    public FillrMappingProcessor(CaptureFieldsMappingService captureFieldsMappingService, FillrMappedFields fillrMappedFields, String str) {
        this.context = captureFieldsMappingService;
        this.schema = Schema_.getInstance_(captureFieldsMappingService);
        ProfileStore_ instance_ = ProfileStore_.getInstance_(captureFieldsMappingService);
        this.profileStore = instance_;
        if (!instance_.hasLoaded) {
            instance_.load();
        }
        this.arrayManager = new Toolbar.AnonymousClass1(instance_);
        this.mPreferences = new AppPreferenceStore(captureFieldsMappingService);
        fillrMappedFields.getClass();
        this.fieldsWithData = new LinkedHashMap();
        HashMap hashMap = fillrMappedFields.basicFieldPopIdMapping;
        this.fieldNamespaces = hashMap;
        this.fields = fillrMappedFields;
        for (String str2 : hashMap.keySet()) {
            this.fieldsWithData.put(str2, this.profileStore.getData(str2));
        }
        SharedPreferences sharedPreferences = this.mPreferences.mPreferences;
        String string2 = sharedPreferences != null ? sharedPreferences.getString("F_LAST_MAPPING_REQUEST_META", null) : null;
        JSONObject jSONObject = this.fields.location;
        if (string2 == null || (jSONObject != null && !jSONObject.toString().equals(string2))) {
            refreshMappingCache();
        }
        this.captureValuesProcessor = new DeviceProfileWriter(captureFieldsMappingService, this);
        Schema_ schema_ = this.schema;
        n.b bVar = new n.b(15);
        bVar.b = schema_;
        this.massager = bVar;
        this.mFieldValues = new HashMap();
        JSONObject jSONObject2 = new JSONObject(str).getJSONObject("values");
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String string3 = jSONObject2.getString(next);
            if (string3.trim().length() > 0) {
                this.mFieldValues.put(next, string3);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:279:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x08fb  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0964  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x096c  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0969 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0966  */
    /* JADX WARN: Type inference failed for: r8v70 */
    /* JADX WARN: Type inference failed for: r8v71 */
    /* JADX WARN: Type inference failed for: r8v78 */
    /* JADX WARN: Type inference failed for: r8v79 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HashMap captureFormFieldValues() {
        String str;
        HashMap hashMap;
        String str2;
        boolean z;
        HashMap hashMap2;
        Toolbar.AnonymousClass1 anonymousClass1;
        Iterator it;
        Toolbar.AnonymousClass1 anonymousClass12;
        AppPreferenceStore appPreferenceStore;
        HashMap hashMap3;
        FillrMappingProcessor fillrMappingProcessor;
        Set<Element> set;
        int i;
        Element element;
        Element element2;
        ?? r8;
        POPMatchingGender pOPMatchingGender;
        String valueFromVariants;
        String str3;
        String validMonthYearOrDateElementValue;
        List list;
        Element element3;
        Toolbar.AnonymousClass1 anonymousClass13;
        Element element4;
        DeviceProfileWriter deviceProfileWriter = this.captureValuesProcessor;
        Schema_ schema_ = (Schema_) deviceProfileWriter.mTranscodedProfile;
        AppPreferenceStore appPreferenceStore2 = (AppPreferenceStore) deviceProfileWriter.mAssetManager;
        Toolbar.AnonymousClass1 anonymousClass14 = (Toolbar.AnonymousClass1) deviceProfileWriter.mCurProfile;
        ProfileStore_ profileStore_ = (ProfileStore_) deviceProfileWriter.mDiagnostics;
        HashMap hashMap4 = new HashMap();
        FillrMappingProcessor fillrMappingProcessor2 = (FillrMappingProcessor) deviceProfileWriter.mExecutor;
        HashMap hashMap5 = fillrMappingProcessor2.fieldNamespaces;
        Schema_ schema_2 = fillrMappingProcessor2.schema;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : fillrMappingProcessor2.fieldsWithData.entrySet()) {
            Element element5 = schema_2.getElement((String) entry.getKey());
            if (element5 != null) {
                Element element6 = new Element(element5);
                if (!element6.isSingleSelection) {
                    element6.setElementValue((String) entry.getValue());
                }
                linkedHashMap.put((String) entry.getKey(), element6);
            }
        }
        Toolbar.AnonymousClass1 anonymousClass15 = fillrMappingProcessor2.arrayManager;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        HashMap hashMap6 = new HashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Element element7 = (Element) entry2.getValue();
            Element element8 = schema_2.getElement(element7.actingElement().parentPathKey);
            if (element8 != null ? ElementType.isNonRecursiveType(element8.actingElement().elementTypeName) : false) {
                String str4 = (String) entry2.getKey();
                anonymousClass15.getClass();
                String formattedPathKey = Toolbar.AnonymousClass1.getFormattedPathKey(str4);
                Toolbar.AnonymousClass1 anonymousClass16 = anonymousClass15;
                ArrayList arrayList2 = new ArrayList();
                AppPreferenceStore appPreferenceStore3 = appPreferenceStore2;
                if (formattedPathKey != null) {
                    String[] split = formattedPathKey.split("\\.");
                    anonymousClass13 = anonymousClass14;
                    int length = split.length;
                    Element element9 = schema_2.getElement(formattedPathKey);
                    if (element9 != null) {
                        int length2 = split.length;
                        Element element10 = element9;
                        int i2 = 0;
                        while (i2 < length2) {
                            String str5 = split[i2];
                            int i3 = i2;
                            if (element10 != null) {
                                if (element10.actingElement().isArrayType) {
                                    arrayList2.add(element10);
                                    element10 = schema_2.getElement(element10.getFormattedParentPathKey());
                                } else {
                                    element10 = schema_2.getElement(element10.getFormattedParentPathKey());
                                }
                            }
                            i2 = i3 + 1;
                        }
                    }
                } else {
                    anonymousClass13 = anonymousClass14;
                }
                if (arrayList2.size() <= 1) {
                    arrayList.add((String) entry2.getKey());
                    String str6 = element7.actingElement().parentPathKey;
                    int extractIndex = Toolbar.AnonymousClass1.extractIndex(element7.actingElement().pathKey);
                    if (extractIndex >= 0) {
                        Element isFieldArrayElement = Toolbar.AnonymousClass1.isFieldArrayElement(schema_2, (String) entry2.getKey());
                        isFieldArrayElement.getClass();
                        Element firstChildElement = new Element(isFieldArrayElement).getFirstChildElement();
                        firstChildElement.getClass();
                        Element element11 = new Element(firstChildElement);
                        element11.alterPathForArrays(extractIndex);
                        Element findLeafElement = Element.findLeafElement(element7.getFormattedPathKey(), element11);
                        if (findLeafElement != null) {
                            Element findLeafElement2 = Element.findLeafElement(element7.getFormattedParentPathKey(), element11);
                            String str7 = findLeafElement.actingElement().parentPathKey;
                            hashMap6.put(str7, findLeafElement2);
                            findLeafElement.setElementValue(element7.actingElement().elementValue);
                            element4 = new Element(findLeafElement);
                            str6 = str7;
                        }
                    } else {
                        element4 = element7;
                    }
                    ArrayList arrayList3 = (ArrayList) linkedHashMap2.get(str6);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap2.put(str6, arrayList3);
                    }
                    arrayList3.add(element4);
                }
                anonymousClass15 = anonymousClass16;
                appPreferenceStore2 = appPreferenceStore3;
                anonymousClass14 = anonymousClass13;
            }
        }
        AppPreferenceStore appPreferenceStore4 = appPreferenceStore2;
        Toolbar.AnonymousClass1 anonymousClass17 = anonymousClass14;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            linkedHashMap.remove((String) it2.next());
        }
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            if (hashMap6.get(entry3.getKey()) != null) {
                Element element12 = (Element) hashMap6.get(entry3.getKey());
                element12.getClass();
                element3 = new Element(element12);
            } else {
                element3 = schema_2.getElement((String) entry3.getKey());
            }
            if (element3 != null) {
                element3.setChildElements((Collection) entry3.getValue());
                linkedHashMap.put((String) entry3.getKey(), element3);
            }
        }
        Iterator it3 = linkedHashMap.entrySet().iterator();
        while (it3.hasNext()) {
            ((Element) ((Map.Entry) it3.next()).getValue()).actingElement().children.clear();
        }
        fillrMappingProcessor2.arrayGroupRequired = new HashMap();
        HashMap hashMap7 = new HashMap();
        for (Map.Entry entry4 : linkedHashMap.entrySet()) {
            Element element13 = (Element) entry4.getValue();
            if (element13.actingElement().isFieldArray && element13.actingElement().parentPathKey != null && !element13.isSingleSelection) {
                String substring = ((String) entry4.getKey()).substring(0, ((String) entry4.getKey()).lastIndexOf(element13.actingElement().elementName) - 1);
                Integer num = (Integer) fillrMappingProcessor2.arrayGroupRequired.get(substring);
                if (num == null) {
                    num = 0;
                }
                int extractIndex2 = Toolbar.AnonymousClass1.extractIndex(element13.actingElement().pathKey);
                int i4 = extractIndex2 < 0 ? 1 : extractIndex2 + 1;
                if (i4 > num.intValue()) {
                    fillrMappingProcessor2.arrayGroupRequired.put(substring, Integer.valueOf(i4));
                }
                hashMap7.put((String) entry4.getKey(), substring);
            }
        }
        HashMap hashMap8 = new HashMap();
        for (Map.Entry entry5 : hashMap7.entrySet()) {
            Element element14 = (Element) hashMap8.get(entry5.getValue());
            if (element14 == null) {
                Element element15 = schema_2.getElement(Toolbar.AnonymousClass1.getFormattedPathKey((String) entry5.getValue()));
                if (element15 != null) {
                    Element element16 = new Element(element15);
                    hashMap8.put((String) entry5.getValue(), element16);
                    element16.actingElement().children.clear();
                    element14 = element16;
                }
            }
            element14.actingElement().children.add((Element) linkedHashMap.get(entry5.getKey()));
        }
        Iterator it4 = hashMap7.keySet().iterator();
        while (it4.hasNext()) {
            linkedHashMap.remove((String) it4.next());
        }
        linkedHashMap.putAll(hashMap8);
        ArrayList arrayList4 = new ArrayList();
        Iterator it5 = linkedHashMap.entrySet().iterator();
        while (true) {
            str = "AddressDetails.Address";
            if (!it5.hasNext()) {
                break;
            }
            Map.Entry entry6 = (Map.Entry) it5.next();
            if (((String) entry6.getKey()).contains("AddressDetails.Address")) {
                arrayList4.add((String) entry6.getKey());
            }
        }
        Iterator it6 = arrayList4.iterator();
        while (it6.hasNext()) {
            String str8 = (String) it6.next();
            linkedHashMap.remove(str8);
            Element element17 = schema_2.getElement(str8);
            if (element17 != null) {
                linkedHashMap.put(str8, new Element(element17));
            }
        }
        arrayList4.clear();
        HashMap hashMap9 = new HashMap();
        Iterator it7 = linkedHashMap.entrySet().iterator();
        while (it7.hasNext()) {
            Map.Entry entry7 = (Map.Entry) it7.next();
            if (((String) entry7.getKey()).contains("|")) {
                Element element18 = (Element) entry7.getValue();
                ArrayList arrayList5 = new ArrayList();
                Iterator it8 = it7;
                String[] split2 = ((String) entry7.getKey()).split("\\|");
                int length3 = split2.length;
                int i5 = 0;
                while (i5 < length3) {
                    int i6 = i5;
                    String str9 = split2[i6];
                    int i7 = length3;
                    HashMap hashMap10 = hashMap4;
                    String substring2 = str9.substring(0, str9.lastIndexOf(46));
                    arrayList4.add(str9);
                    Element element19 = schema_2.getElement(substring2);
                    Schema_ schema_3 = schema_2;
                    if (element19 != null) {
                        arrayList5.add(new Element(element19));
                    }
                    FillrMappedField fillrMappedField = (FillrMappedField) hashMap5.get(entry7.getKey());
                    String str10 = str;
                    FillrMappedField fillrMappedField2 = (FillrMappedField) hashMap5.get(str9);
                    if (!hashMap5.containsKey(str9) || (hashMap5.get(str9) != null && hashMap5.get(entry7.getKey()) != null && fillrMappedField != null && fillrMappedField2 != null && fillrMappedField2.popId == fillrMappedField.popId)) {
                        arrayList4.add(substring2);
                    } else if (element19 != null) {
                        fillrMappingProcessor2.cleanupArrays(substring2);
                        hashMap9.put(substring2, element19);
                    }
                    i5 = i6 + 1;
                    length3 = i7;
                    hashMap4 = hashMap10;
                    schema_2 = schema_3;
                    str = str10;
                }
                HashMap hashMap11 = hashMap4;
                Schema_ schema_4 = schema_2;
                String str11 = str;
                element18.children = arrayList5;
                if (!fillrMappingProcessor2.arrayGroupRequired.containsKey(entry7.getKey())) {
                    fillrMappingProcessor2.arrayGroupRequired.put((String) entry7.getKey(), 0);
                }
                fillrMappingProcessor2.arrayGroupRequired.put((String) entry7.getKey(), Integer.valueOf(((Integer) fillrMappingProcessor2.arrayGroupRequired.get(entry7.getKey())).intValue() + 1));
                it7 = it8;
                hashMap4 = hashMap11;
                schema_2 = schema_4;
                str = str11;
            }
        }
        HashMap hashMap12 = hashMap4;
        String str12 = str;
        Iterator it9 = arrayList4.iterator();
        while (it9.hasNext()) {
            String str13 = (String) it9.next();
            linkedHashMap.remove(str13);
            fillrMappingProcessor2.cleanupArrays(str13);
        }
        linkedHashMap.putAll(hashMap9);
        Iterator it10 = linkedHashMap.entrySet().iterator();
        while (it10.hasNext()) {
            Map.Entry entry8 = (Map.Entry) it10.next();
            String str14 = (String) entry8.getKey();
            Element element20 = (Element) entry8.getValue();
            String str15 = null;
            if (element20.isSingleSelection) {
                Element element21 = element20.children.size() <= 0 ? null : (Element) element20.children.get(0);
                if (element21 != null) {
                    Iterator it11 = element21.actingElement().children.iterator();
                    while (true) {
                        if (it11.hasNext()) {
                            String valueForField = deviceProfileWriter.getValueForField(DeviceProfileWriter.getFormFieldKey(str14, element20, (Element) it11.next()));
                            if (valueForField != null && valueForField.contains("@")) {
                                element20 = 1 >= element20.children.size() ? null : (Element) element20.children.get(1);
                            }
                        }
                    }
                }
            }
            Element element22 = element20;
            if (element22.actingElement().isArrayType || element22.actingElement().isFieldArray) {
                hashMap = hashMap12;
                str2 = str12;
                if (deviceProfileWriter.mDeviceSupportsAotProfile || !str14.contains("CreditCards.CreditCard")) {
                    if (element22.isAddress()) {
                        z = deviceProfileWriter.containsValidAddressData(str14, element22);
                    } else {
                        boolean z2 = false;
                        for (Element element23 : element22.actingElement().children) {
                            String valueForField2 = deviceProfileWriter.getValueForField(DeviceProfileWriter.getFormFieldKey(str14, element22, element23));
                            if (valueForField2 != null && valueForField2.trim().length() > 0) {
                                z2 = element23.actingElement().isEmail ? valueForField2.trim().length() > 0 ? Patterns.EMAIL_ADDRESS.matcher(valueForField2.trim()).matches() : false : true;
                            }
                            if (z2) {
                                z = z2;
                            }
                        }
                        z = z2;
                    }
                    if (z) {
                        Element element24 = new Element(element22);
                        Element element25 = schema_.getElement(element24.actingElement().parentPathKey);
                        boolean isAddress = element22.isAddress();
                        if (isAddress) {
                            hashMap2 = hashMap;
                            anonymousClass1 = anonymousClass17;
                        } else {
                            anonymousClass1 = anonymousClass17;
                            ArrayList readAllArrayElemetsForNameSpace = anonymousClass1.readAllArrayElemetsForNameSpace(element24);
                            if (!readAllArrayElemetsForNameSpace.isEmpty()) {
                                Iterator it12 = readAllArrayElemetsForNameSpace.iterator();
                                while (it12.hasNext()) {
                                    Element element26 = (Element) it12.next();
                                    if (!Toolbar.AnonymousClass1.arrayHasData(profileStore_, element26) && element26 != null) {
                                        anonymousClass1.removeProfileData(schema_.getElement(element26.actingElement().parentPathKey), element26, (CaptureFieldsMappingService) deviceProfileWriter.mProfile);
                                        hashMap = hashMap;
                                    }
                                }
                            }
                            hashMap2 = hashMap;
                        }
                        ArrayList readAllArrayElemetsForNameSpace2 = anonymousClass1.readAllArrayElemetsForNameSpace(element24);
                        if (readAllArrayElemetsForNameSpace2.isEmpty()) {
                            it = it10;
                            str12 = str2;
                            anonymousClass12 = anonymousClass1;
                            appPreferenceStore = appPreferenceStore4;
                            hashMap3 = hashMap2;
                            fillrMappingProcessor = fillrMappingProcessor2;
                            deviceProfileWriter.createNewArrayForFieldMapping(hashMap3, str14, element22, element24, element25);
                        } else if (isAddress) {
                            Element element27 = new Element(element22);
                            Element element28 = schema_.getElement(element27.actingElement().parentPathKey);
                            if (deviceProfileWriter.containsValidAddressData(str14, element22)) {
                                String profilePathIfExists = deviceProfileWriter.getProfilePathIfExists(str14);
                                if (profilePathIfExists == null) {
                                    hashMap3 = hashMap2;
                                    deviceProfileWriter.createNewArrayForFieldMapping(hashMap3, str14, element22, element27, element28);
                                    it = it10;
                                    str12 = str2;
                                    anonymousClass12 = anonymousClass1;
                                    appPreferenceStore = appPreferenceStore4;
                                    fillrMappingProcessor = fillrMappingProcessor2;
                                } else {
                                    hashMap3 = hashMap2;
                                    Element findProfileElement = DeviceProfileWriter.findProfileElement(profilePathIfExists, readAllArrayElemetsForNameSpace2);
                                    if (findProfileElement == null) {
                                        appPreferenceStore = appPreferenceStore4;
                                        try {
                                            appPreferenceStore.removeNamespaceForProfilePath(str14, profilePathIfExists);
                                        } catch (JSONException unused) {
                                        }
                                        deviceProfileWriter.createNewArrayForFieldMapping(hashMap3, str14, element22, element27, element28);
                                    } else {
                                        appPreferenceStore = appPreferenceStore4;
                                        if (((OneShotDisposable) deviceProfileWriter.mApkName) != null) {
                                            StringBuilder sb = new StringBuilder();
                                            ArrayList arrayList6 = new ArrayList();
                                            for (Element element29 : element22.actingElement().children) {
                                                Iterator it13 = it10;
                                                String valueForField3 = deviceProfileWriter.getValueForField(DeviceProfileWriter.getFormFieldKey(str14, element22, element29));
                                                if (element29.isAddress() && valueForField3 != null && !arrayList6.contains(valueForField3)) {
                                                    arrayList6.add(valueForField3);
                                                }
                                                it10 = it13;
                                            }
                                            it = it10;
                                            sb.append(TextUtils.join(" ", arrayList6));
                                            ((OneShotDisposable) deviceProfileWriter.mApkName).convertQueryToAddress(str14, sb.toString(), fillrMappingProcessor2.getDomain(), findProfileElement);
                                            fillrMappingProcessor = fillrMappingProcessor2;
                                            str12 = str2;
                                            anonymousClass12 = anonymousClass1;
                                        }
                                    }
                                    it = it10;
                                    fillrMappingProcessor = fillrMappingProcessor2;
                                    str12 = str2;
                                    anonymousClass12 = anonymousClass1;
                                }
                            } else {
                                it = it10;
                                appPreferenceStore = appPreferenceStore4;
                                fillrMappingProcessor = fillrMappingProcessor2;
                                str12 = str2;
                                anonymousClass12 = anonymousClass1;
                                hashMap3 = hashMap2;
                            }
                        } else {
                            it = it10;
                            appPreferenceStore = appPreferenceStore4;
                            hashMap3 = hashMap2;
                            HashMap hashMap13 = new HashMap();
                            HashMap hashMap14 = new HashMap();
                            Iterator it14 = readAllArrayElemetsForNameSpace2.iterator();
                            boolean z3 = false;
                            while (true) {
                                Iterator it15 = it14;
                                if (it14.hasNext()) {
                                    Element element30 = (Element) it15.next();
                                    boolean z4 = z3;
                                    List list2 = element30.actingElement().children;
                                    fillrMappingProcessor = fillrMappingProcessor2;
                                    str12 = str2;
                                    int i8 = 0;
                                    boolean z5 = false;
                                    while (true) {
                                        if (i8 < list2.size()) {
                                            Element element31 = (Element) list2.get(i8);
                                            List list3 = list2;
                                            if (i8 == 0) {
                                                Element element32 = schema_.getElement(element30.getFormattedParentPathKey());
                                                if (element32 != null) {
                                                    i = i8;
                                                    String str16 = element31.actingElement().mProfilePath;
                                                    if (str16 == null) {
                                                        str16 = element31.actingElement().pathKey;
                                                    }
                                                    int extractIndex3 = Toolbar.AnonymousClass1.extractIndex(str16);
                                                    element = element30;
                                                    Element element33 = new Element(element32);
                                                    if (element33.getFirstChildElement() != null) {
                                                        Element firstChildElement2 = element33.getFirstChildElement();
                                                        firstChildElement2.getClass();
                                                        Element element34 = new Element(firstChildElement2);
                                                        element34.alterPathForArrays(extractIndex3);
                                                        element2 = Element.findPrimaryKeyPath(element34);
                                                        if (element2 != null) {
                                                            element2.setElementValue(((ProfileStore_) anonymousClass1.this$0).getData(element2.actingElement().pathKey));
                                                        }
                                                        if (element2 != null) {
                                                            String formattedPathKey2 = element2.getFormattedPathKey();
                                                            anonymousClass1.getClass();
                                                            Element findChildElementRecursively = Toolbar.AnonymousClass1.findChildElementRecursively(formattedPathKey2, element22);
                                                            String formFieldKey = findChildElementRecursively != null ? DeviceProfileWriter.getFormFieldKey(str14, element22, findChildElementRecursively) : null;
                                                            String valueForField4 = deviceProfileWriter.getValueForField(formFieldKey);
                                                            String data = profileStore_.getData(element2.actingElement().pathKey);
                                                            if (formFieldKey != null && valueForField4 != null && valueForField4.length() > 0 && data != null && data.length() > 0) {
                                                                anonymousClass12 = anonymousClass1;
                                                                r8 = (formFieldKey.equals("ContactDetails.CellPhones.CellPhone.Number") || formFieldKey.equals("ContactDetails.LandlinePhones.LandlinePhone.Number") ? !data.replaceAll("[^\\d]", "").equals(valueForField4.replaceAll("[^\\d]", "")) : !data.equalsIgnoreCase(valueForField4)) ? -1 : 1;
                                                                boolean z6 = r8 > 0;
                                                                if (r8 < 0) {
                                                                    z3 = z6;
                                                                } else {
                                                                    z5 = r8;
                                                                    z4 = z6;
                                                                }
                                                            }
                                                        }
                                                        anonymousClass12 = anonymousClass1;
                                                        r8 = 0;
                                                        if (r8 > 0) {
                                                        }
                                                        if (r8 < 0) {
                                                        }
                                                    }
                                                } else {
                                                    i = i8;
                                                    element = element30;
                                                }
                                                element2 = null;
                                                if (element2 != null) {
                                                }
                                                anonymousClass12 = anonymousClass1;
                                                r8 = 0;
                                                if (r8 > 0) {
                                                }
                                                if (r8 < 0) {
                                                }
                                            } else {
                                                i = i8;
                                                element = element30;
                                                anonymousClass12 = anonymousClass1;
                                            }
                                            if (z4) {
                                                deviceProfileWriter.updateProfileArrayElement(hashMap3, str14, element22, element31);
                                            } else if (!z5) {
                                                String data2 = profileStore_.getData(element31.actingElement().pathKey);
                                                String formattedPathKey3 = element31.getFormattedPathKey();
                                                anonymousClass12.getClass();
                                                Element findChildElementRecursively2 = Toolbar.AnonymousClass1.findChildElementRecursively(formattedPathKey3, element22);
                                                String valueForField5 = deviceProfileWriter.getValueForField(findChildElementRecursively2 != null ? DeviceProfileWriter.getFormFieldKey(str14, element22, findChildElementRecursively2) : null);
                                                if (data2 == null || data2.length() <= 0 || !data2.equals(valueForField5)) {
                                                    Set set2 = (Set) hashMap14.get(element.actingElement().pathKey);
                                                    if (set2 == null) {
                                                        set2 = new HashSet();
                                                    }
                                                    set2.add(element31);
                                                    hashMap14.put(element.actingElement().pathKey, set2);
                                                } else {
                                                    Set set3 = (Set) hashMap13.get(element.actingElement().pathKey);
                                                    if (set3 == null) {
                                                        set3 = new HashSet();
                                                    }
                                                    set3.add(element31);
                                                    hashMap13.put(element.actingElement().pathKey, set3);
                                                }
                                            }
                                            i8 = i + 1;
                                            list2 = list3;
                                            element30 = element;
                                            anonymousClass1 = anonymousClass12;
                                        } else {
                                            anonymousClass12 = anonymousClass1;
                                            z3 = z4;
                                        }
                                    }
                                    if (z3) {
                                        hashMap13.clear();
                                        hashMap14.clear();
                                    } else {
                                        it14 = it15;
                                        fillrMappingProcessor2 = fillrMappingProcessor;
                                        anonymousClass1 = anonymousClass12;
                                        str2 = str12;
                                    }
                                } else {
                                    fillrMappingProcessor = fillrMappingProcessor2;
                                    str12 = str2;
                                    anonymousClass12 = anonymousClass1;
                                }
                            }
                            String profilePathIfExists2 = deviceProfileWriter.getProfilePathIfExists(str14);
                            if (hashMap13.size() > 0) {
                                String str17 = null;
                                int i9 = 0;
                                for (Map.Entry entry9 : hashMap13.entrySet()) {
                                    Set set4 = (Set) entry9.getValue();
                                    if (set4.size() >= i9) {
                                        i9 = set4.size();
                                        str17 = (String) entry9.getKey();
                                    }
                                }
                                if (hashMap14.size() > 0 && (set = (Set) hashMap14.get(str17)) != null) {
                                    for (Element element35 : set) {
                                        String data3 = profileStore_.getData(element35.actingElement().pathKey);
                                        if (data3 == null || data3.trim().equals("")) {
                                            deviceProfileWriter.updateProfileArrayElement(hashMap3, str14, element22, element35);
                                        }
                                    }
                                }
                            } else if (!z3 && profilePathIfExists2 == null) {
                                Element element36 = new Element(element22);
                                Element element37 = schema_.getElement(element36.actingElement().parentPathKey);
                                if (profilePathIfExists2 != null) {
                                    try {
                                        appPreferenceStore.removeNamespaceForProfilePath(str14, profilePathIfExists2);
                                    } catch (JSONException unused2) {
                                    }
                                }
                                deviceProfileWriter.createNewArrayForFieldMapping(hashMap3, str14, element22, element36, element37);
                            } else if (!z3) {
                                Element findProfileElement2 = DeviceProfileWriter.findProfileElement(profilePathIfExists2, readAllArrayElemetsForNameSpace2);
                                if (findProfileElement2 == null) {
                                    findProfileElement2 = (Element) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1, readAllArrayElemetsForNameSpace2);
                                }
                                List list4 = findProfileElement2.actingElement().children;
                                for (int i10 = 0; i10 < list4.size(); i10++) {
                                    deviceProfileWriter.updateProfileArrayElement(hashMap3, str14, element22, (Element) list4.get(i10));
                                }
                            }
                        }
                        hashMap12 = hashMap3;
                        it10 = it;
                        fillrMappingProcessor2 = fillrMappingProcessor;
                        anonymousClass17 = anonymousClass12;
                        appPreferenceStore4 = appPreferenceStore;
                    }
                }
            } else {
                HashMap hashMap15 = new HashMap();
                String data4 = profileStore_.getData(str14);
                if (data4 == null || data4.isEmpty()) {
                    if (element22.isNonRecursiveType()) {
                        List<Element> list5 = schema_.getElement(element22.actingElement().pathKey).actingElement().children;
                        HashMap hashMap16 = new HashMap();
                        if (list5 != null) {
                            String str18 = null;
                            String str19 = null;
                            for (Element element38 : list5) {
                                String str20 = element38.actingElement().pathKey;
                                String valueForField6 = deviceProfileWriter.getValueForField(str20);
                                if (valueForField6 == null || valueForField6.trim().length() <= 0) {
                                    list = list5;
                                } else {
                                    hashMap16.put(str20, valueForField6);
                                    list = list5;
                                    if (element38.actingElement().pathKey.endsWith(".Day")) {
                                        str15 = valueForField6;
                                    }
                                    if (element38.actingElement().pathKey.endsWith(".Month")) {
                                        str18 = valueForField6;
                                    }
                                    if (element38.actingElement().pathKey.endsWith(".Year")) {
                                        str19 = valueForField6;
                                    }
                                }
                                list5 = list;
                            }
                            if (hashMap16.size() == list5.size() && (validMonthYearOrDateElementValue = deviceProfileWriter.validMonthYearOrDateElementValue(str15, str18, str19, element22)) != null && validMonthYearOrDateElementValue.trim().length() > 0) {
                                hashMap16.put(element22.actingElement().pathKey, validMonthYearOrDateElementValue);
                                hashMap15.putAll(hashMap16);
                                hashMap = hashMap12;
                                str2 = str12;
                                hashMap.putAll(hashMap15);
                            }
                        }
                    } else {
                        String valueForField7 = deviceProfileWriter.getValueForField(str14);
                        MatchResult.Destructured destructured = (MatchResult.Destructured) deviceProfileWriter.mDesiredVersion;
                        if (((o0) destructured.match) != null) {
                            if (valueForField7 != null) {
                                if (element22.actingElement().elementTypeName != null && element22.actingElement().elementTypeName.contains("HonorificType")) {
                                    pOPMatchingGender = new POPMatchingGender(valueForField7, 2);
                                    str2 = str12;
                                } else if (element22.actingElement().elementTypeName != null && element22.actingElement().elementTypeName.contains("GenderEnumType")) {
                                    pOPMatchingGender = new POPMatchingGender(valueForField7, 0);
                                    str2 = str12;
                                } else if (element22.actingElement().elementTypeName == null || (str3 = element22.actingElement().pathKey) == null) {
                                    str2 = str12;
                                } else {
                                    str2 = str12;
                                    if (str3.startsWith(str2) && str3.endsWith(".AdministrativeArea")) {
                                        pOPMatchingGender = new POPMatchingGender(valueForField7, 1);
                                    }
                                }
                                if (pOPMatchingGender != null) {
                                    o0 o0Var = (o0) destructured.match;
                                    o0Var.getClass();
                                    if (pOPMatchingGender.mIsValid) {
                                        CaptureFieldsMappingService captureFieldsMappingService = (CaptureFieldsMappingService) o0Var.a;
                                        String str21 = pOPMatchingGender.mStrFormValue;
                                        switch (pOPMatchingGender.$r8$classId) {
                                            case 0:
                                                valueFromVariants = POPMatchingGender.getValueFromVariants(str21, pOPMatchingGender.getMatchingFile(captureFieldsMappingService, R.raw.gender));
                                                break;
                                            case 1:
                                                valueFromVariants = POPMatchingGender.getValueFromVariants(str21, pOPMatchingGender.getMatchingFile(captureFieldsMappingService, R.raw.administrative_areas));
                                                break;
                                            default:
                                                valueFromVariants = POPMatchingGender.getValueFromVariants(str21, pOPMatchingGender.getMatchingFile(captureFieldsMappingService, R.raw.honourifics));
                                                break;
                                        }
                                        str15 = valueFromVariants;
                                    }
                                    if (str15 != null && !str15.trim().isEmpty()) {
                                        hashMap15.put(str14, str15);
                                    }
                                    hashMap = hashMap12;
                                    hashMap.putAll(hashMap15);
                                }
                            } else {
                                str2 = str12;
                            }
                            pOPMatchingGender = null;
                            if (pOPMatchingGender != null) {
                            }
                        } else {
                            str2 = str12;
                        }
                        str15 = valueForField7;
                        if (str15 != null) {
                            hashMap15.put(str14, str15);
                        }
                        hashMap = hashMap12;
                        hashMap.putAll(hashMap15);
                    }
                }
                str2 = str12;
                hashMap = hashMap12;
                hashMap.putAll(hashMap15);
            }
            hashMap12 = hashMap;
            str12 = str2;
        }
        return hashMap12;
    }

    public final void cleanupArrays(String str) {
        if (this.arrayGroupRequired.containsKey(str)) {
            int intValue = ((Integer) this.arrayGroupRequired.get(str)).intValue() - 1;
            HashMap hashMap = this.arrayGroupRequired;
            if (intValue <= 0) {
                hashMap.remove(str);
            } else {
                hashMap.put(str, Integer.valueOf(intValue));
            }
        }
    }

    public final String getDomain() {
        StringBuilder sb = new StringBuilder();
        FillrMappedFields fillrMappedFields = this.fields;
        sb.append(fillrMappedFields.domain);
        sb.append(fillrMappedFields.path);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0475  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HashMap getFieldNamespaceValueMappings(boolean z) {
        HashMap hashMap;
        int i;
        String translateSchemaNamespaceToMiddlewareNamespace;
        boolean z2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        FillrMappingProcessor fillrMappingProcessor = this;
        CaptureFieldsMappingService captureFieldsMappingService = fillrMappingProcessor.context;
        FillrMappedFields fillrMappedFields = fillrMappingProcessor.fields;
        fillrMappedFields.getClass();
        int i2 = 1;
        try {
            hashMap = FillrMappingsHelper.getMappings(captureFieldsMappingService, fillrMappedFields.formFields, fillrMappedFields.expandIndices, fillrMappedFields.mappingFlow, true);
        } catch (JSONException e) {
            e.printStackTrace();
            hashMap = fillrMappedFields.basicFieldPopIdMapping;
        }
        Map map = hashMap;
        HashMap hashMap2 = new HashMap();
        for (String str8 : map.keySet()) {
            if (!z || !str8.contains("CreditCards.CreditCard")) {
                Element element = fillrMappingProcessor.schema.getElement(str8);
                FillrMappedField fillrMappedField = (FillrMappedField) map.get(str8);
                if (fillrMappedField != null) {
                    String str9 = fillrMappedField.param;
                    String str10 = (String) fillrMappingProcessor.mFieldValues.get(Integer.toString(fillrMappedField.popId));
                    if (str10 != null && str10.length() > 0) {
                        n.b bVar = fillrMappingProcessor.massager;
                        if (element != null) {
                            int i3 = i2;
                            if ((element.actingElement().pathKey.endsWith("BirthDate") || element.actingElement().pathKey.equals("CreditCards.CreditCard.Expiry")) && (element.isMonthYearType() || element.isDateType())) {
                                bVar.getClass();
                                String str11 = fillrMappedField.placeholder;
                                if (str11 != null) {
                                    char c = ((Schema_) bVar.b).getElementType(element).f1544type == 4 ? (char) 2 : (char) 5;
                                    if (c == 2) {
                                        str6 = "(?i)(m{1,2}|y{2,4})([\\s-/]+)(m{1,2}|y{2,4})";
                                    } else if (c == 3) {
                                        str6 = "(?i)(d{1})|(d{2})";
                                    } else if (c == 4) {
                                        str6 = "(?i)(m{1})|(m{2})";
                                    } else {
                                        if (c != 5) {
                                            throw null;
                                        }
                                        str6 = "(?i)(y{2})|(y{4})";
                                    }
                                    z2 = Pattern.compile(str6).matcher(str11).matches();
                                    str11 = str11.replaceAll("d", "D").replaceAll("m", "M").replaceAll("Y", "y").trim().replace(" ", "");
                                } else {
                                    z2 = false;
                                }
                                String replace = str10.trim().replace(" ", "");
                                if (element.isDateType()) {
                                    if (!z2) {
                                        try {
                                            CalendarConverter.AnonymousClass1 anonymousClass1 = CalendarConverter.DATE_FORMAT_REGEXPS;
                                            Iterator it = anonymousClass1.keySet().iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    str11 = null;
                                                    break;
                                                }
                                                String str12 = (String) it.next();
                                                if (replace.toLowerCase(Locale.US).matches(str12)) {
                                                    str11 = (String) anonymousClass1.get(str12);
                                                    break;
                                                }
                                            }
                                        } catch (ParseException e2) {
                                            e2.printStackTrace();
                                        }
                                    }
                                    if (str11 != null) {
                                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str11, Locale.getDefault());
                                        if (replace == null) {
                                            throw new IllegalArgumentException("Please sure a valid arguments are passed");
                                        }
                                        Date parse = simpleDateFormat.parse(replace);
                                        Calendar calendar = Calendar.getInstance();
                                        calendar.setTime(parse);
                                        String[] strArr = CalendarConverter.MONTH_FORMAT_ARRAY;
                                        str10 = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).format(calendar.getTime());
                                    }
                                } else if (element.isMonthYearType()) {
                                    if (!z2) {
                                        try {
                                            CalendarConverter.AnonymousClass1 anonymousClass12 = CalendarConverter.MONTH_YEAR_FORMAT_REGEXPS;
                                            Iterator it2 = anonymousClass12.keySet().iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    str11 = null;
                                                    break;
                                                }
                                                String str13 = (String) it2.next();
                                                if (replace.toLowerCase(Locale.US).matches(str13)) {
                                                    str11 = (String) anonymousClass12.get(str13);
                                                    break;
                                                }
                                            }
                                        } catch (ParseException e3) {
                                            e3.printStackTrace();
                                        }
                                    }
                                    if (str11 != null) {
                                        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str11, Locale.getDefault());
                                        if (replace == null) {
                                            throw new IllegalArgumentException("Please sure a valid arguments are passed");
                                        }
                                        Date parse2 = simpleDateFormat2.parse(replace);
                                        Calendar calendar2 = Calendar.getInstance();
                                        calendar2.setTime(parse2);
                                        String[] strArr2 = CalendarConverter.MONTH_FORMAT_ARRAY;
                                        str10 = new SimpleDateFormat("MM-yyyy", Locale.ENGLISH).format(calendar2.getTime());
                                    }
                                }
                                if (str10 != null) {
                                    if (element.isDateType()) {
                                        String str14 = element.actingElement().pathKey;
                                        String m$1 = Recorder$$ExternalSyntheticOutline2.m$1(str14, ".Day");
                                        if (str10.trim().equals("")) {
                                            str3 = "";
                                        } else {
                                            Calendar fromString = CalendarConverter.fromString(str10);
                                            if (fromString == null) {
                                                fromString = Calendar.getInstance();
                                            }
                                            str3 = String.format("%02d", Integer.valueOf(fromString.get(5)));
                                        }
                                        hashMap2.put(m$1, str3);
                                        String str15 = str14 + ".Month";
                                        if (str10.trim().equals("")) {
                                            str4 = "";
                                        } else {
                                            Calendar fromString2 = CalendarConverter.fromString(str10);
                                            if (fromString2 == null) {
                                                fromString2 = Calendar.getInstance();
                                            }
                                            str4 = String.format("%02d", Integer.valueOf(fromString2.get(2) + 1));
                                        }
                                        hashMap2.put(str15, str4);
                                        String str16 = str14 + ".Year";
                                        if (str10.trim().equals("")) {
                                            str5 = "";
                                        } else {
                                            Calendar fromString3 = CalendarConverter.fromString(str10);
                                            if (fromString3 == null) {
                                                fromString3 = Calendar.getInstance();
                                            }
                                            str5 = "" + fromString3.get(i3);
                                        }
                                        hashMap2.put(str16, str5);
                                    } else if (element.isMonthYearType()) {
                                        String str17 = element.actingElement().pathKey;
                                        String m$12 = Recorder$$ExternalSyntheticOutline2.m$1(str17, ".Month");
                                        if (str10.trim().equals("")) {
                                            str = "";
                                        } else {
                                            Calendar fromMonthYearString = CalendarConverter.fromMonthYearString(str10);
                                            if (fromMonthYearString == null) {
                                                fromMonthYearString = Calendar.getInstance();
                                            }
                                            str = String.format("%02d", Integer.valueOf(fromMonthYearString.get(2) + 1));
                                        }
                                        hashMap2.put(m$12, str);
                                        String str18 = str17 + ".Year";
                                        if (str10.trim().equals("")) {
                                            str2 = "";
                                        } else {
                                            Calendar fromMonthYearString2 = CalendarConverter.fromMonthYearString(str10);
                                            if (fromMonthYearString2 == null) {
                                                fromMonthYearString2 = Calendar.getInstance();
                                            }
                                            str2 = "" + fromMonthYearString2.get(1);
                                        }
                                        hashMap2.put(str18, str2);
                                    }
                                }
                            }
                            if ("CreditCards.CreditCard.Expiry.Month".equals(str9)) {
                                bVar.getClass();
                                if (Pattern.compile("(?i)(\\d{1,2})|(^(Jan(?:uary)?|Feb(?:ruary)?|Mar(?:ch)?|Apr(?:il)?|May|Jun(?:e)?|Jul(?:y)?|Aug(?:ust)?|Sep(?:tember)?|Oct(?:ober)?|Nov(?:ember)?|Dec(?:ember)?)$)").matcher(str10.trim()).find()) {
                                    String trim = str10.trim();
                                    if (trim == null || trim.trim().equals("")) {
                                        str7 = "";
                                    } else {
                                        String[] strArr3 = CalendarConverter.MONTH_FORMAT_ARRAY;
                                        Calendar calendar3 = Calendar.getInstance();
                                        String[] strArr4 = CalendarConverter.MONTH_FORMAT_ARRAY;
                                        int i4 = 0;
                                        while (true) {
                                            if (i4 >= 4) {
                                                str7 = null;
                                                break;
                                            }
                                            try {
                                                SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(strArr4[i4], Locale.US);
                                                calendar3.setTime(simpleDateFormat3.parse(trim));
                                                simpleDateFormat3.applyPattern("MM");
                                                str7 = simpleDateFormat3.format(calendar3.getTime());
                                                break;
                                            } catch (Exception unused) {
                                                Log.w(CalendarConverter.class.getClass().getName(), "There was a problem parsing the date ".concat(trim));
                                                i4++;
                                            }
                                        }
                                    }
                                    if (str7 != null && !str7.equals("")) {
                                        hashMap2.put(element.actingElement().pathKey, str7);
                                        str10 = str7;
                                    }
                                }
                            }
                        } else if ("PersonalDetails.FullName".equals(str9)) {
                            bVar.getClass();
                            String replaceAll = str10.trim().replaceAll("[,.]", "");
                            String[] strArr5 = {"mr", "mrs", "ms", "miss", "dr", "sir", "madam", "master", "fr", "rev", "atty", "hon", "prof", "pres", "vp", "gov", "ofc"};
                            for (int i5 = 0; i5 < 17; i5++) {
                                replaceAll = replaceAll.replaceAll("(?i)" + strArr5[i5], "");
                            }
                            String[] split = replaceAll.trim().replaceAll("\\s+", " ").split("\\s+");
                            if (split.length == 1) {
                                n.b.appendIfMappingDoesNotExist(hashMap2, "PersonalDetails.FirstName", split[0]);
                                i = 1;
                                translateSchemaNamespaceToMiddlewareNamespace = SchemaTranslation.translateSchemaNamespaceToMiddlewareNamespace(str8);
                                if (translateSchemaNamespaceToMiddlewareNamespace != null) {
                                    hashMap2.put(translateSchemaNamespaceToMiddlewareNamespace, str10);
                                }
                                fillrMappingProcessor = this;
                                i2 = i;
                            } else if (split.length == 2) {
                                n.b.appendIfMappingDoesNotExist(hashMap2, "PersonalDetails.FirstName", split[0]);
                                n.b.appendIfMappingDoesNotExist(hashMap2, "PersonalDetails.LastName", split[1]);
                            } else if (split.length >= 3) {
                                StringBuilder sb = new StringBuilder();
                                for (int i6 = 0; i6 < split.length; i6++) {
                                    if (i6 == 0) {
                                        n.b.appendIfMappingDoesNotExist(hashMap2, "PersonalDetails.FirstName", split[i6]);
                                    } else if (i6 == split.length - 1) {
                                        n.b.appendIfMappingDoesNotExist(hashMap2, "PersonalDetails.LastName", split[i6]);
                                        n.b.appendIfMappingDoesNotExist(hashMap2, "PersonalDetails.MiddleName", sb.toString());
                                    } else {
                                        sb.append(sb.length() != 0 ? " " + split[i6] : split[i6]);
                                    }
                                }
                            }
                        }
                        i = 1;
                        translateSchemaNamespaceToMiddlewareNamespace = SchemaTranslation.translateSchemaNamespaceToMiddlewareNamespace(str8);
                        if (translateSchemaNamespaceToMiddlewareNamespace != null) {
                        }
                        fillrMappingProcessor = this;
                        i2 = i;
                    }
                }
                fillrMappingProcessor = this;
            }
        }
        return hashMap2;
    }

    public final void refreshMappingCache() {
        JSONObject jSONObject = this.fields.location;
        if (jSONObject != null) {
            String jSONObject2 = jSONObject.toString();
            AppPreferenceStore appPreferenceStore = this.mPreferences;
            SharedPreferences sharedPreferences = appPreferenceStore.mPreferences;
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString("F_LAST_MAPPING_REQUEST_META", jSONObject2);
                edit.apply();
            }
            SharedPreferences sharedPreferences2 = appPreferenceStore.mPreferences;
            if (sharedPreferences2 != null) {
                SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                edit2.putStringSet("F_LAST_CREATED_ARRAYS", null);
                edit2.commit();
            }
        }
    }
}
