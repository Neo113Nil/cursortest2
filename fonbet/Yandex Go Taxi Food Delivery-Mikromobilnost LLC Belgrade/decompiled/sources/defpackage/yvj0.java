package defpackage;

import com.ybsdk.core.common.data.cache.CacheMissException;
import com.ybsdk.core.common.data.network.dto.cache.DataEntryDescriptorDto;
import com.ybsdk.core.common.data.network.dto.cache.ExpireableDto;
import com.ybsdk.core.common.data.network.dto.cache.ThemedDataEntryDescriptorDto;
import com.ybsdk.core.common.domain.entities.cache.ExpireableEntity$Behaviour;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class yvj0 {
    public final Object a;
    public final boolean b;
    public final long c;
    public final LinkedHashMap d;
    public final ArrayList e = new ArrayList();

    public yvj0(Object obj, boolean z, long j, LinkedHashMap linkedHashMap) {
        this.a = obj;
        this.b = z;
        this.c = j;
        this.d = linkedHashMap;
    }

    public static ExpireableEntity$Behaviour b(DataEntryDescriptorDto.Behaviour behaviour) {
        int i = xvj0.a[behaviour.ordinal()];
        if (i == 1) {
            return ExpireableEntity$Behaviour.REQUIRED;
        }
        if (i == 2) {
            return ExpireableEntity$Behaviour.OPTIONAL;
        }
        w511.b();
        return null;
    }

    public final aso a(ExpireableDto expireableDto) {
        long ttl = expireableDto.getTtl();
        aso asoVar = new aso(expireableDto.getContent(), ttl, this.c, b(expireableDto.getBehaviour()));
        if (System.currentTimeMillis() > xga1.d(asoVar) && expireableDto.getBehaviour() == DataEntryDescriptorDto.Behaviour.REQUIRED) {
            throw new CacheMissException("Failed to extract required content");
        }
        this.e.add(asoVar);
        return asoVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r2 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final aso c(DataEntryDescriptorDto dataEntryDescriptorDto) {
        aso asoVar;
        aog aogVar = (aog) this.d.get(dataEntryDescriptorDto.getKey());
        if (aogVar != null) {
            asoVar = new aso(aogVar.c, aogVar.a, aogVar.b, b(dataEntryDescriptorDto.getBehaviour()));
        } else {
            asoVar = null;
        }
        int i = xvj0.a[dataEntryDescriptorDto.getBehaviour().ordinal()];
        if (i == 1) {
            if (asoVar != null) {
                if (xga1.d(asoVar) <= System.currentTimeMillis()) {
                    asoVar = null;
                }
            }
            throw new CacheMissException(dataEntryDescriptorDto.getKey());
        }
        if (i != 2) {
            w511.b();
            return null;
        }
        if (asoVar == null) {
            return null;
        }
        this.e.add(asoVar);
        return asoVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:
    
        if (r6 != null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final aso d(ThemedDataEntryDescriptorDto themedDataEntryDescriptorDto) {
        String dark = themedDataEntryDescriptorDto.getDark();
        LinkedHashMap linkedHashMap = this.d;
        aog aogVar = (aog) linkedHashMap.get(dark);
        aog aogVar2 = (aog) linkedHashMap.get(themedDataEntryDescriptorDto.getLight());
        Object obj = aogVar != null ? aogVar.c : null;
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = aogVar2 != null ? aogVar2.c : null;
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        aso asoVar = (str == null || evu0.J(str) || str2 == null || evu0.J(str2)) ? null : new aso(new fxy0(str, str2), Math.min(aogVar.a, aogVar2.a), Math.min(aogVar.b, aogVar2.b), b(themedDataEntryDescriptorDto.getBehaviour()));
        int i = xvj0.a[themedDataEntryDescriptorDto.getBehaviour().ordinal()];
        if (i == 1) {
            if (asoVar != null) {
                if (xga1.d(asoVar) <= System.currentTimeMillis()) {
                    asoVar = null;
                }
            }
            throw new CacheMissException(g8e.p(themedDataEntryDescriptorDto.getDark(), " AND ", themedDataEntryDescriptorDto.getLight()));
        }
        if (i != 2) {
            w511.b();
            return null;
        }
        if (asoVar == null) {
            return null;
        }
        this.e.add(asoVar);
        return asoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yvj0)) {
            return false;
        }
        yvj0 yvj0Var = (yvj0) obj;
        return jl40.l(this.a, yvj0Var.a) && this.b == yvj0Var.b && this.c == yvj0Var.c && this.d.equals(yvj0Var.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + qv10.c(unr0.e((obj == null ? 0 : obj.hashCode()) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "ResponseCacheMapperInfo(dto=" + this.a + ", stale=" + this.b + ", receivedAt=" + this.c + ", commonData=" + this.d + Extension.C_BRAKE;
    }
}
