package kotlinx.serialization.internal;

import defpackage.i3y;
import defpackage.jl40;
import defpackage.ovu0;
import defpackage.sls;
import defpackage.tje;
import defpackage.ud7;
import defpackage.uxs;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public class PluginGeneratedSerialDescriptor implements SerialDescriptor, ud7 {
    public final String a;
    public final uxs b;
    public final int c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public ArrayList g;
    public final boolean[] h;
    public Map i;
    public final i3y j;
    public final i3y k;
    public final i3y l;

    public PluginGeneratedSerialDescriptor(String str, uxs uxsVar, int i) {
        this.a = str;
        this.b = uxsVar;
        this.c = i;
        String[] strArr = new String[i];
        final int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            strArr[i3] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i4 = this.c;
        this.f = new List[i4];
        this.h = new boolean[i4];
        this.i = b.f();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.j = a.b(lazyThreadSafetyMode, new sls(this) { // from class: mzc0
            public final /* synthetic */ PluginGeneratedSerialDescriptor b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                KSerializer[] childSerializers;
                ArrayList arrayList;
                KSerializer[] typeParametersSerializers;
                int i5 = i2;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.b;
                switch (i5) {
                    case 0:
                        uxs uxsVar2 = pluginGeneratedSerialDescriptor.b;
                        return (uxsVar2 == null || (childSerializers = uxsVar2.childSerializers()) == null) ? ooc.d : childSerializers;
                    case 1:
                        uxs uxsVar3 = pluginGeneratedSerialDescriptor.b;
                        if (uxsVar3 == null || (typeParametersSerializers = uxsVar3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (KSerializer kSerializer : typeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return uh6.k(arrayList);
                    default:
                        return Integer.valueOf(tje.H(pluginGeneratedSerialDescriptor, (SerialDescriptor[]) pluginGeneratedSerialDescriptor.k.getValue()));
                }
            }
        });
        final int i5 = 1;
        this.k = a.b(lazyThreadSafetyMode, new sls(this) { // from class: mzc0
            public final /* synthetic */ PluginGeneratedSerialDescriptor b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                KSerializer[] childSerializers;
                ArrayList arrayList;
                KSerializer[] typeParametersSerializers;
                int i52 = i5;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.b;
                switch (i52) {
                    case 0:
                        uxs uxsVar2 = pluginGeneratedSerialDescriptor.b;
                        return (uxsVar2 == null || (childSerializers = uxsVar2.childSerializers()) == null) ? ooc.d : childSerializers;
                    case 1:
                        uxs uxsVar3 = pluginGeneratedSerialDescriptor.b;
                        if (uxsVar3 == null || (typeParametersSerializers = uxsVar3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (KSerializer kSerializer : typeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return uh6.k(arrayList);
                    default:
                        return Integer.valueOf(tje.H(pluginGeneratedSerialDescriptor, (SerialDescriptor[]) pluginGeneratedSerialDescriptor.k.getValue()));
                }
            }
        });
        final int i6 = 2;
        this.l = a.b(lazyThreadSafetyMode, new sls(this) { // from class: mzc0
            public final /* synthetic */ PluginGeneratedSerialDescriptor b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                KSerializer[] childSerializers;
                ArrayList arrayList;
                KSerializer[] typeParametersSerializers;
                int i52 = i6;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.b;
                switch (i52) {
                    case 0:
                        uxs uxsVar2 = pluginGeneratedSerialDescriptor.b;
                        return (uxsVar2 == null || (childSerializers = uxsVar2.childSerializers()) == null) ? ooc.d : childSerializers;
                    case 1:
                        uxs uxsVar3 = pluginGeneratedSerialDescriptor.b;
                        if (uxsVar3 == null || (typeParametersSerializers = uxsVar3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (KSerializer kSerializer : typeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return uh6.k(arrayList);
                    default:
                        return Integer.valueOf(tje.H(pluginGeneratedSerialDescriptor, (SerialDescriptor[]) pluginGeneratedSerialDescriptor.k.getValue()));
                }
            }
        });
    }

    @Override // defpackage.ud7
    public final Set a() {
        return this.i.keySet();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        Integer num = (Integer) this.i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor d(int i) {
        return ((KSerializer[]) this.j.getValue())[i].getDescriptor();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof PluginGeneratedSerialDescriptor) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.a.equals(serialDescriptor.h()) && Arrays.equals((SerialDescriptor[]) this.k.getValue(), (SerialDescriptor[]) ((PluginGeneratedSerialDescriptor) obj).k.getValue())) {
                int e = serialDescriptor.e();
                int i2 = this.c;
                if (i2 == e) {
                    for (0; i < i2; i + 1) {
                        i = (jl40.l(d(i).h(), serialDescriptor.d(i).h()) && jl40.l(d(i).getKind(), serialDescriptor.d(i).getKind())) ? i + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String f(int i) {
        return this.e[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i) {
        List list = this.f[i];
        return list == null ? EmptyList.a : list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        ArrayList arrayList = this.g;
        return arrayList == null ? EmptyList.a : arrayList;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public jl40 getKind() {
        return ovu0.g;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h() {
        return this.a;
    }

    public int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        return this.h[i];
    }

    public final void j(String str, boolean z) {
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.h[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                hashMap.put(strArr[i2], Integer.valueOf(i2));
            }
            this.i = hashMap;
        }
    }

    public final void k(Annotation annotation) {
        int i = this.d;
        List[] listArr = this.f;
        List list = listArr[i];
        if (list == null) {
            list = new ArrayList(1);
            listArr[this.d] = list;
        }
        list.add(annotation);
    }

    public final void l(Annotation annotation) {
        if (this.g == null) {
            this.g = new ArrayList(1);
        }
        this.g.add(annotation);
    }

    public String toString() {
        return tje.g0(this);
    }
}
