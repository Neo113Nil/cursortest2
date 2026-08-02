package androidx.lifecycle;

import androidx.lifecycle.internal.SavedStateHandleImpl_androidKt;
import androidx.navigation.fragment.NavHostFragment$$ExternalSyntheticLambda1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.JWECryptoParts;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyMap;
import kotlin.collections.builders.MapBuilder;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class SavedStateHandle {
    public final JWECryptoParts impl;
    public final LinkedHashMap liveDatas = new LinkedHashMap();

    public final class SavingStateLiveData extends MutableLiveData {
        public SavedStateHandle handle;
        public String key;

        @Override // androidx.lifecycle.LiveData
        public final void setValue(Object obj) {
            JWECryptoParts jWECryptoParts;
            SavedStateHandle savedStateHandle = this.handle;
            if (savedStateHandle != null && (jWECryptoParts = savedStateHandle.impl) != null) {
                jWECryptoParts.set(obj, this.key);
            }
            super.setValue(obj);
        }
    }

    public SavedStateHandle() {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        this.impl = new JWECryptoParts(emptyMap);
    }

    public final Object get(String str) {
        Object value;
        str.getClass();
        JWECryptoParts jWECryptoParts = this.impl;
        jWECryptoParts.getClass();
        LinkedHashMap linkedHashMap = (LinkedHashMap) jWECryptoParts.header;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) jWECryptoParts.cipherText;
        try {
            MutableStateFlow mutableStateFlow = (MutableStateFlow) linkedHashMap2.get(str);
            if (mutableStateFlow != null && (value = ((StateFlowImpl) mutableStateFlow).getValue()) != null) {
                return value;
            }
            return linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            ((LinkedHashMap) jWECryptoParts.iv).remove(str);
            linkedHashMap2.remove(str);
            return null;
        }
    }

    public final SavingStateLiveData getLiveData(String str) {
        JWECryptoParts jWECryptoParts = this.impl;
        LinkedHashMap linkedHashMap = (LinkedHashMap) jWECryptoParts.cipherText;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) jWECryptoParts.header;
        if (linkedHashMap.containsKey(str)) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m("StateFlow and LiveData are mutually exclusive for the same key. Please use either 'getMutableStateFlow' or 'getLiveData' for key '", str, "', but not both."));
            return null;
        }
        LinkedHashMap linkedHashMap3 = this.liveDatas;
        Object obj = linkedHashMap3.get(str);
        if (obj == null) {
            if (linkedHashMap2.containsKey(str)) {
                SavingStateLiveData savingStateLiveData = new SavingStateLiveData(linkedHashMap2.get(str));
                savingStateLiveData.key = str;
                savingStateLiveData.handle = this;
                obj = savingStateLiveData;
            } else {
                linkedHashMap2.put(str, null);
                SavingStateLiveData savingStateLiveData2 = new SavingStateLiveData(null);
                savingStateLiveData2.key = str;
                savingStateLiveData2.handle = this;
                obj = savingStateLiveData2;
            }
            linkedHashMap3.put(str, obj);
        }
        return (SavingStateLiveData) obj;
    }

    public final ReadonlyStateFlow getStateFlow(Boolean bool, String str) {
        JWECryptoParts jWECryptoParts = this.impl;
        if (((LinkedHashMap) jWECryptoParts.cipherText).containsKey(str)) {
            return FlowKt.asStateFlow(jWECryptoParts.getMutableStateFlow(bool, str));
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) jWECryptoParts.header;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) jWECryptoParts.iv;
        Object obj = linkedHashMap2.get(str);
        if (obj == null) {
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, bool);
            }
            obj = FlowKt.MutableStateFlow(linkedHashMap.get(str));
            linkedHashMap2.put(str, obj);
        }
        return FlowKt.asStateFlow((MutableStateFlow) obj);
    }

    public final NavHostFragment$$ExternalSyntheticLambda1 savedStateProvider() {
        return (NavHostFragment$$ExternalSyntheticLambda1) this.impl.authenticationTag;
    }

    public final void set(Object obj, String str) {
        str.getClass();
        if (obj != null) {
            List list = SavedStateHandleImpl_androidKt.ACCEPTABLE_CLASSES;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((Class) it.next()).isInstance(obj)) {
                    }
                }
            }
            a$$ExternalSyntheticBUOutline0.m("Can't put value with type ", obj.getClass(), " into saved state");
            return;
        }
        List list2 = SavedStateHandleImpl_androidKt.ACCEPTABLE_CLASSES;
        Object obj2 = this.liveDatas.get(str);
        MutableLiveData mutableLiveData = obj2 instanceof MutableLiveData ? (MutableLiveData) obj2 : null;
        if (mutableLiveData != null) {
            mutableLiveData.setValue(obj);
        }
        this.impl.set(obj, str);
    }

    public SavedStateHandle(MapBuilder mapBuilder) {
        this.impl = new JWECryptoParts(mapBuilder);
    }
}
