package ru.yandex.taxi.layers.source.factory;

import defpackage.an00;
import defpackage.bvf0;
import defpackage.f0k;
import defpackage.fkp;
import defpackage.jl40;
import defpackage.jmp;
import defpackage.jst;
import defpackage.lm00;
import defpackage.mmp;
import defpackage.ny61;
import defpackage.sm00;
import defpackage.tm00;
import defpackage.tpr;
import defpackage.um00;
import defpackage.vm00;
import defpackage.wp31;
import defpackage.ym00;
import defpackage.zlp;
import defpackage.zm00;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.g;
import ru.yandex.taxi.common_models.net.map_object.MapObjectType;
import ru.yandex.taxi.layers.experiments.LayersObjectsAnimationParamsExperiment;
import ru.yandex.taxi.layers.experiments.f;

/* loaded from: classes9.dex */
public final class c {
    public final Set a;
    public final f b;

    public c(Set set, f fVar) {
        this.a = set;
        this.b = fVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:(1:(11:12|13|14|(1:16)|17|(1:19)(1:127)|(1:21)(1:126)|(1:23)(1:125)|24|25|(3:27|(1:29)(1:122)|(37:(36:32|(1:34)|35|36|(1:40)|41|(1:118)(1:47)|48|49|(1:51)(1:117)|(1:53)(1:116)|54|(1:56)(1:115)|(1:58)(1:114)|(1:60)(1:113)|61|(1:63)(1:112)|(1:65)(1:111)|66|(1:68)(1:110)|(1:70)(1:109)|(1:72)(1:108)|(1:74)(1:107)|(1:76)(1:106)|(1:78)(1:105)|(1:80)(1:104)|(1:82)(1:103)|83|(1:85)(1:102)|(1:87)(1:101)|(1:89)(1:100)|90|91|(1:93)|94|(1:99)(2:96|97))|119|35|36|(2:38|40)|41|(1:43)|118|48|49|(0)(0)|(0)(0)|54|(0)(0)|(0)(0)|(0)(0)|61|(0)(0)|(0)(0)|66|(0)(0)|(0)(0)|(0)(0)|(0)(0)|(0)(0)|(0)(0)|(0)(0)|(0)(0)|83|(0)(0)|(0)(0)|(0)(0)|90|91|(0)|94|(0)(0))(2:120|121))(2:123|124))(2:128|129))(9:130|131|132|133|(4:136|(3:138|139|140)(1:142)|141|134)|143|144|(10:147|14|(0)|17|(0)(0)|(0)(0)|(0)(0)|24|25|(0)(0))|146))(3:148|149|150))(3:174|175|(2:177|146)(1:178))|151|(2:152|(3:154|(1:170)(2:156|(1:161)(2:158|159))|160)(2:171|(1:173)))|162|163|(2:165|(2:167|146)(8:168|132|133|(1:134)|143|144|(0)|146))(7:169|133|(1:134)|143|144|(0)|146)))|181|6|7|(0)(0)|151|(3:152|(0)(0)|160)|162|163|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x005d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02d1, code lost:
    
        r11 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02cb A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:13:0x0058, B:14:0x0168, B:16:0x0175, B:17:0x0178, B:19:0x0183, B:21:0x018b, B:23:0x0193, B:24:0x0199, B:27:0x01a3, B:29:0x01a9, B:32:0x01b3, B:36:0x01bf, B:38:0x01c3, B:40:0x01c9, B:43:0x01d7, B:45:0x01dd, B:47:0x01e3, B:49:0x01ed, B:51:0x01f1, B:53:0x01fc, B:58:0x020d, B:60:0x0218, B:61:0x0221, B:63:0x0226, B:66:0x0233, B:68:0x0237, B:70:0x0242, B:72:0x024d, B:74:0x0258, B:76:0x0263, B:78:0x026e, B:80:0x0279, B:82:0x0284, B:83:0x028d, B:85:0x0297, B:87:0x02a2, B:89:0x02ad, B:90:0x02b6, B:119:0x01bc, B:120:0x02c5, B:121:0x02ca, B:123:0x02cb, B:124:0x02d0, B:131:0x007e, B:132:0x0109, B:133:0x0111, B:134:0x0122, B:136:0x0128, B:139:0x0135, B:144:0x0139, B:149:0x008f, B:151:0x00b7, B:152:0x00c8, B:154:0x00ce, B:163:0x00e6, B:165:0x00ea, B:175:0x009b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0128 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:13:0x0058, B:14:0x0168, B:16:0x0175, B:17:0x0178, B:19:0x0183, B:21:0x018b, B:23:0x0193, B:24:0x0199, B:27:0x01a3, B:29:0x01a9, B:32:0x01b3, B:36:0x01bf, B:38:0x01c3, B:40:0x01c9, B:43:0x01d7, B:45:0x01dd, B:47:0x01e3, B:49:0x01ed, B:51:0x01f1, B:53:0x01fc, B:58:0x020d, B:60:0x0218, B:61:0x0221, B:63:0x0226, B:66:0x0233, B:68:0x0237, B:70:0x0242, B:72:0x024d, B:74:0x0258, B:76:0x0263, B:78:0x026e, B:80:0x0279, B:82:0x0284, B:83:0x028d, B:85:0x0297, B:87:0x02a2, B:89:0x02ad, B:90:0x02b6, B:119:0x01bc, B:120:0x02c5, B:121:0x02ca, B:123:0x02cb, B:124:0x02d0, B:131:0x007e, B:132:0x0109, B:133:0x0111, B:134:0x0122, B:136:0x0128, B:139:0x0135, B:144:0x0139, B:149:0x008f, B:151:0x00b7, B:152:0x00c8, B:154:0x00ce, B:163:0x00e6, B:165:0x00ea, B:175:0x009b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00ce A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:13:0x0058, B:14:0x0168, B:16:0x0175, B:17:0x0178, B:19:0x0183, B:21:0x018b, B:23:0x0193, B:24:0x0199, B:27:0x01a3, B:29:0x01a9, B:32:0x01b3, B:36:0x01bf, B:38:0x01c3, B:40:0x01c9, B:43:0x01d7, B:45:0x01dd, B:47:0x01e3, B:49:0x01ed, B:51:0x01f1, B:53:0x01fc, B:58:0x020d, B:60:0x0218, B:61:0x0221, B:63:0x0226, B:66:0x0233, B:68:0x0237, B:70:0x0242, B:72:0x024d, B:74:0x0258, B:76:0x0263, B:78:0x026e, B:80:0x0279, B:82:0x0284, B:83:0x028d, B:85:0x0297, B:87:0x02a2, B:89:0x02ad, B:90:0x02b6, B:119:0x01bc, B:120:0x02c5, B:121:0x02ca, B:123:0x02cb, B:124:0x02d0, B:131:0x007e, B:132:0x0109, B:133:0x0111, B:134:0x0122, B:136:0x0128, B:139:0x0135, B:144:0x0139, B:149:0x008f, B:151:0x00b7, B:152:0x00c8, B:154:0x00ce, B:163:0x00e6, B:165:0x00ea, B:175:0x009b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00ea A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:13:0x0058, B:14:0x0168, B:16:0x0175, B:17:0x0178, B:19:0x0183, B:21:0x018b, B:23:0x0193, B:24:0x0199, B:27:0x01a3, B:29:0x01a9, B:32:0x01b3, B:36:0x01bf, B:38:0x01c3, B:40:0x01c9, B:43:0x01d7, B:45:0x01dd, B:47:0x01e3, B:49:0x01ed, B:51:0x01f1, B:53:0x01fc, B:58:0x020d, B:60:0x0218, B:61:0x0221, B:63:0x0226, B:66:0x0233, B:68:0x0237, B:70:0x0242, B:72:0x024d, B:74:0x0258, B:76:0x0263, B:78:0x026e, B:80:0x0279, B:82:0x0284, B:83:0x028d, B:85:0x0297, B:87:0x02a2, B:89:0x02ad, B:90:0x02b6, B:119:0x01bc, B:120:0x02c5, B:121:0x02ca, B:123:0x02cb, B:124:0x02d0, B:131:0x007e, B:132:0x0109, B:133:0x0111, B:134:0x0122, B:136:0x0128, B:139:0x0135, B:144:0x0139, B:149:0x008f, B:151:0x00b7, B:152:0x00c8, B:154:0x00ce, B:163:0x00e6, B:165:0x00ea, B:175:0x009b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0175 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:13:0x0058, B:14:0x0168, B:16:0x0175, B:17:0x0178, B:19:0x0183, B:21:0x018b, B:23:0x0193, B:24:0x0199, B:27:0x01a3, B:29:0x01a9, B:32:0x01b3, B:36:0x01bf, B:38:0x01c3, B:40:0x01c9, B:43:0x01d7, B:45:0x01dd, B:47:0x01e3, B:49:0x01ed, B:51:0x01f1, B:53:0x01fc, B:58:0x020d, B:60:0x0218, B:61:0x0221, B:63:0x0226, B:66:0x0233, B:68:0x0237, B:70:0x0242, B:72:0x024d, B:74:0x0258, B:76:0x0263, B:78:0x026e, B:80:0x0279, B:82:0x0284, B:83:0x028d, B:85:0x0297, B:87:0x02a2, B:89:0x02ad, B:90:0x02b6, B:119:0x01bc, B:120:0x02c5, B:121:0x02ca, B:123:0x02cb, B:124:0x02d0, B:131:0x007e, B:132:0x0109, B:133:0x0111, B:134:0x0122, B:136:0x0128, B:139:0x0135, B:144:0x0139, B:149:0x008f, B:151:0x00b7, B:152:0x00c8, B:154:0x00ce, B:163:0x00e6, B:165:0x00ea, B:175:0x009b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0183 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:13:0x0058, B:14:0x0168, B:16:0x0175, B:17:0x0178, B:19:0x0183, B:21:0x018b, B:23:0x0193, B:24:0x0199, B:27:0x01a3, B:29:0x01a9, B:32:0x01b3, B:36:0x01bf, B:38:0x01c3, B:40:0x01c9, B:43:0x01d7, B:45:0x01dd, B:47:0x01e3, B:49:0x01ed, B:51:0x01f1, B:53:0x01fc, B:58:0x020d, B:60:0x0218, B:61:0x0221, B:63:0x0226, B:66:0x0233, B:68:0x0237, B:70:0x0242, B:72:0x024d, B:74:0x0258, B:76:0x0263, B:78:0x026e, B:80:0x0279, B:82:0x0284, B:83:0x028d, B:85:0x0297, B:87:0x02a2, B:89:0x02ad, B:90:0x02b6, B:119:0x01bc, B:120:0x02c5, B:121:0x02ca, B:123:0x02cb, B:124:0x02d0, B:131:0x007e, B:132:0x0109, B:133:0x0111, B:134:0x0122, B:136:0x0128, B:139:0x0135, B:144:0x0139, B:149:0x008f, B:151:0x00b7, B:152:0x00c8, B:154:0x00ce, B:163:0x00e6, B:165:0x00ea, B:175:0x009b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x018b A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:13:0x0058, B:14:0x0168, B:16:0x0175, B:17:0x0178, B:19:0x0183, B:21:0x018b, B:23:0x0193, B:24:0x0199, B:27:0x01a3, B:29:0x01a9, B:32:0x01b3, B:36:0x01bf, B:38:0x01c3, B:40:0x01c9, B:43:0x01d7, B:45:0x01dd, B:47:0x01e3, B:49:0x01ed, B:51:0x01f1, B:53:0x01fc, B:58:0x020d, B:60:0x0218, B:61:0x0221, B:63:0x0226, B:66:0x0233, B:68:0x0237, B:70:0x0242, B:72:0x024d, B:74:0x0258, B:76:0x0263, B:78:0x026e, B:80:0x0279, B:82:0x0284, B:83:0x028d, B:85:0x0297, B:87:0x02a2, B:89:0x02ad, B:90:0x02b6, B:119:0x01bc, B:120:0x02c5, B:121:0x02ca, B:123:0x02cb, B:124:0x02d0, B:131:0x007e, B:132:0x0109, B:133:0x0111, B:134:0x0122, B:136:0x0128, B:139:0x0135, B:144:0x0139, B:149:0x008f, B:151:0x00b7, B:152:0x00c8, B:154:0x00ce, B:163:0x00e6, B:165:0x00ea, B:175:0x009b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0193 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:13:0x0058, B:14:0x0168, B:16:0x0175, B:17:0x0178, B:19:0x0183, B:21:0x018b, B:23:0x0193, B:24:0x0199, B:27:0x01a3, B:29:0x01a9, B:32:0x01b3, B:36:0x01bf, B:38:0x01c3, B:40:0x01c9, B:43:0x01d7, B:45:0x01dd, B:47:0x01e3, B:49:0x01ed, B:51:0x01f1, B:53:0x01fc, B:58:0x020d, B:60:0x0218, B:61:0x0221, B:63:0x0226, B:66:0x0233, B:68:0x0237, B:70:0x0242, B:72:0x024d, B:74:0x0258, B:76:0x0263, B:78:0x026e, B:80:0x0279, B:82:0x0284, B:83:0x028d, B:85:0x0297, B:87:0x02a2, B:89:0x02ad, B:90:0x02b6, B:119:0x01bc, B:120:0x02c5, B:121:0x02ca, B:123:0x02cb, B:124:0x02d0, B:131:0x007e, B:132:0x0109, B:133:0x0111, B:134:0x0122, B:136:0x0128, B:139:0x0135, B:144:0x0139, B:149:0x008f, B:151:0x00b7, B:152:0x00c8, B:154:0x00ce, B:163:0x00e6, B:165:0x00ea, B:175:0x009b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01a3 A[Catch: all -> 0x005d, TRY_ENTER, TryCatch #0 {all -> 0x005d, blocks: (B:13:0x0058, B:14:0x0168, B:16:0x0175, B:17:0x0178, B:19:0x0183, B:21:0x018b, B:23:0x0193, B:24:0x0199, B:27:0x01a3, B:29:0x01a9, B:32:0x01b3, B:36:0x01bf, B:38:0x01c3, B:40:0x01c9, B:43:0x01d7, B:45:0x01dd, B:47:0x01e3, B:49:0x01ed, B:51:0x01f1, B:53:0x01fc, B:58:0x020d, B:60:0x0218, B:61:0x0221, B:63:0x0226, B:66:0x0233, B:68:0x0237, B:70:0x0242, B:72:0x024d, B:74:0x0258, B:76:0x0263, B:78:0x026e, B:80:0x0279, B:82:0x0284, B:83:0x028d, B:85:0x0297, B:87:0x02a2, B:89:0x02ad, B:90:0x02b6, B:119:0x01bc, B:120:0x02c5, B:121:0x02ca, B:123:0x02cb, B:124:0x02d0, B:131:0x007e, B:132:0x0109, B:133:0x0111, B:134:0x0122, B:136:0x0128, B:139:0x0135, B:144:0x0139, B:149:0x008f, B:151:0x00b7, B:152:0x00c8, B:154:0x00ce, B:163:0x00e6, B:165:0x00ea, B:175:0x009b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f1 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:13:0x0058, B:14:0x0168, B:16:0x0175, B:17:0x0178, B:19:0x0183, B:21:0x018b, B:23:0x0193, B:24:0x0199, B:27:0x01a3, B:29:0x01a9, B:32:0x01b3, B:36:0x01bf, B:38:0x01c3, B:40:0x01c9, B:43:0x01d7, B:45:0x01dd, B:47:0x01e3, B:49:0x01ed, B:51:0x01f1, B:53:0x01fc, B:58:0x020d, B:60:0x0218, B:61:0x0221, B:63:0x0226, B:66:0x0233, B:68:0x0237, B:70:0x0242, B:72:0x024d, B:74:0x0258, B:76:0x0263, B:78:0x026e, B:80:0x0279, B:82:0x0284, B:83:0x028d, B:85:0x0297, B:87:0x02a2, B:89:0x02ad, B:90:0x02b6, B:119:0x01bc, B:120:0x02c5, B:121:0x02ca, B:123:0x02cb, B:124:0x02d0, B:131:0x007e, B:132:0x0109, B:133:0x0111, B:134:0x0122, B:136:0x0128, B:139:0x0135, B:144:0x0139, B:149:0x008f, B:151:0x00b7, B:152:0x00c8, B:154:0x00ce, B:163:0x00e6, B:165:0x00ea, B:175:0x009b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01fc A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #0 {all -> 0x005d, blocks: (B:13:0x0058, B:14:0x0168, B:16:0x0175, B:17:0x0178, B:19:0x0183, B:21:0x018b, B:23:0x0193, B:24:0x0199, B:27:0x01a3, B:29:0x01a9, B:32:0x01b3, B:36:0x01bf, B:38:0x01c3, B:40:0x01c9, B:43:0x01d7, B:45:0x01dd, B:47:0x01e3, B:49:0x01ed, B:51:0x01f1, B:53:0x01fc, B:58:0x020d, B:60:0x0218, B:61:0x0221, B:63:0x0226, B:66:0x0233, B:68:0x0237, B:70:0x0242, B:72:0x024d, B:74:0x0258, B:76:0x0263, B:78:0x026e, B:80:0x0279, B:82:0x0284, B:83:0x028d, B:85:0x0297, B:87:0x02a2, B:89:0x02ad, B:90:0x02b6, B:119:0x01bc, B:120:0x02c5, B:121:0x02ca, B:123:0x02cb, B:124:0x02d0, B:131:0x007e, B:132:0x0109, B:133:0x0111, B:134:0x0122, B:136:0x0128, B:139:0x0135, B:144:0x0139, B:149:0x008f, B:151:0x00b7, B:152:0x00c8, B:154:0x00ce, B:163:0x00e6, B:165:0x00ea, B:175:0x009b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x020d A[Catch: all -> 0x005d, TRY_ENTER, TryCatch #0 {all -> 0x005d, blocks: (B:13:0x0058, B:14:0x0168, B:16:0x0175, B:17:0x0178, B:19:0x0183, B:21:0x018b, B:23:0x0193, B:24:0x0199, B:27:0x01a3, B:29:0x01a9, B:32:0x01b3, B:36:0x01bf, B:38:0x01c3, B:40:0x01c9, B:43:0x01d7, B:45:0x01dd, B:47:0x01e3, B:49:0x01ed, B:51:0x01f1, B:53:0x01fc, B:58:0x020d, B:60:0x0218, B:61:0x0221, B:63:0x0226, B:66:0x0233, B:68:0x0237, B:70:0x0242, B:72:0x024d, B:74:0x0258, B:76:0x0263, B:78:0x026e, B:80:0x0279, B:82:0x0284, B:83:0x028d, B:85:0x0297, B:87:0x02a2, B:89:0x02ad, B:90:0x02b6, B:119:0x01bc, B:120:0x02c5, B:121:0x02ca, B:123:0x02cb, B:124:0x02d0, B:131:0x007e, B:132:0x0109, B:133:0x0111, B:134:0x0122, B:136:0x0128, B:139:0x0135, B:144:0x0139, B:149:0x008f, B:151:0x00b7, B:152:0x00c8, B:154:0x00ce, B:163:0x00e6, B:165:0x00ea, B:175:0x009b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0218 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:13:0x0058, B:14:0x0168, B:16:0x0175, B:17:0x0178, B:19:0x0183, B:21:0x018b, B:23:0x0193, B:24:0x0199, B:27:0x01a3, B:29:0x01a9, B:32:0x01b3, B:36:0x01bf, B:38:0x01c3, B:40:0x01c9, B:43:0x01d7, B:45:0x01dd, B:47:0x01e3, B:49:0x01ed, B:51:0x01f1, B:53:0x01fc, B:58:0x020d, B:60:0x0218, B:61:0x0221, B:63:0x0226, B:66:0x0233, B:68:0x0237, B:70:0x0242, B:72:0x024d, B:74:0x0258, B:76:0x0263, B:78:0x026e, B:80:0x0279, B:82:0x0284, B:83:0x028d, B:85:0x0297, B:87:0x02a2, B:89:0x02ad, B:90:0x02b6, B:119:0x01bc, B:120:0x02c5, B:121:0x02ca, B:123:0x02cb, B:124:0x02d0, B:131:0x007e, B:132:0x0109, B:133:0x0111, B:134:0x0122, B:136:0x0128, B:139:0x0135, B:144:0x0139, B:149:0x008f, B:151:0x00b7, B:152:0x00c8, B:154:0x00ce, B:163:0x00e6, B:165:0x00ea, B:175:0x009b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0226 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:13:0x0058, B:14:0x0168, B:16:0x0175, B:17:0x0178, B:19:0x0183, B:21:0x018b, B:23:0x0193, B:24:0x0199, B:27:0x01a3, B:29:0x01a9, B:32:0x01b3, B:36:0x01bf, B:38:0x01c3, B:40:0x01c9, B:43:0x01d7, B:45:0x01dd, B:47:0x01e3, B:49:0x01ed, B:51:0x01f1, B:53:0x01fc, B:58:0x020d, B:60:0x0218, B:61:0x0221, B:63:0x0226, B:66:0x0233, B:68:0x0237, B:70:0x0242, B:72:0x024d, B:74:0x0258, B:76:0x0263, B:78:0x026e, B:80:0x0279, B:82:0x0284, B:83:0x028d, B:85:0x0297, B:87:0x02a2, B:89:0x02ad, B:90:0x02b6, B:119:0x01bc, B:120:0x02c5, B:121:0x02ca, B:123:0x02cb, B:124:0x02d0, B:131:0x007e, B:132:0x0109, B:133:0x0111, B:134:0x0122, B:136:0x0128, B:139:0x0135, B:144:0x0139, B:149:0x008f, B:151:0x00b7, B:152:0x00c8, B:154:0x00ce, B:163:0x00e6, B:165:0x00ea, B:175:0x009b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0237 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:13:0x0058, B:14:0x0168, B:16:0x0175, B:17:0x0178, B:19:0x0183, B:21:0x018b, B:23:0x0193, B:24:0x0199, B:27:0x01a3, B:29:0x01a9, B:32:0x01b3, B:36:0x01bf, B:38:0x01c3, B:40:0x01c9, B:43:0x01d7, B:45:0x01dd, B:47:0x01e3, B:49:0x01ed, B:51:0x01f1, B:53:0x01fc, B:58:0x020d, B:60:0x0218, B:61:0x0221, B:63:0x0226, B:66:0x0233, B:68:0x0237, B:70:0x0242, B:72:0x024d, B:74:0x0258, B:76:0x0263, B:78:0x026e, B:80:0x0279, B:82:0x0284, B:83:0x028d, B:85:0x0297, B:87:0x02a2, B:89:0x02ad, B:90:0x02b6, B:119:0x01bc, B:120:0x02c5, B:121:0x02ca, B:123:0x02cb, B:124:0x02d0, B:131:0x007e, B:132:0x0109, B:133:0x0111, B:134:0x0122, B:136:0x0128, B:139:0x0135, B:144:0x0139, B:149:0x008f, B:151:0x00b7, B:152:0x00c8, B:154:0x00ce, B:163:0x00e6, B:165:0x00ea, B:175:0x009b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0242 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:13:0x0058, B:14:0x0168, B:16:0x0175, B:17:0x0178, B:19:0x0183, B:21:0x018b, B:23:0x0193, B:24:0x0199, B:27:0x01a3, B:29:0x01a9, B:32:0x01b3, B:36:0x01bf, B:38:0x01c3, B:40:0x01c9, B:43:0x01d7, B:45:0x01dd, B:47:0x01e3, B:49:0x01ed, B:51:0x01f1, B:53:0x01fc, B:58:0x020d, B:60:0x0218, B:61:0x0221, B:63:0x0226, B:66:0x0233, B:68:0x0237, B:70:0x0242, B:72:0x024d, B:74:0x0258, B:76:0x0263, B:78:0x026e, B:80:0x0279, B:82:0x0284, B:83:0x028d, B:85:0x0297, B:87:0x02a2, B:89:0x02ad, B:90:0x02b6, B:119:0x01bc, B:120:0x02c5, B:121:0x02ca, B:123:0x02cb, B:124:0x02d0, B:131:0x007e, B:132:0x0109, B:133:0x0111, B:134:0x0122, B:136:0x0128, B:139:0x0135, B:144:0x0139, B:149:0x008f, B:151:0x00b7, B:152:0x00c8, B:154:0x00ce, B:163:0x00e6, B:165:0x00ea, B:175:0x009b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x024d A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:13:0x0058, B:14:0x0168, B:16:0x0175, B:17:0x0178, B:19:0x0183, B:21:0x018b, B:23:0x0193, B:24:0x0199, B:27:0x01a3, B:29:0x01a9, B:32:0x01b3, B:36:0x01bf, B:38:0x01c3, B:40:0x01c9, B:43:0x01d7, B:45:0x01dd, B:47:0x01e3, B:49:0x01ed, B:51:0x01f1, B:53:0x01fc, B:58:0x020d, B:60:0x0218, B:61:0x0221, B:63:0x0226, B:66:0x0233, B:68:0x0237, B:70:0x0242, B:72:0x024d, B:74:0x0258, B:76:0x0263, B:78:0x026e, B:80:0x0279, B:82:0x0284, B:83:0x028d, B:85:0x0297, B:87:0x02a2, B:89:0x02ad, B:90:0x02b6, B:119:0x01bc, B:120:0x02c5, B:121:0x02ca, B:123:0x02cb, B:124:0x02d0, B:131:0x007e, B:132:0x0109, B:133:0x0111, B:134:0x0122, B:136:0x0128, B:139:0x0135, B:144:0x0139, B:149:0x008f, B:151:0x00b7, B:152:0x00c8, B:154:0x00ce, B:163:0x00e6, B:165:0x00ea, B:175:0x009b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0258 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:13:0x0058, B:14:0x0168, B:16:0x0175, B:17:0x0178, B:19:0x0183, B:21:0x018b, B:23:0x0193, B:24:0x0199, B:27:0x01a3, B:29:0x01a9, B:32:0x01b3, B:36:0x01bf, B:38:0x01c3, B:40:0x01c9, B:43:0x01d7, B:45:0x01dd, B:47:0x01e3, B:49:0x01ed, B:51:0x01f1, B:53:0x01fc, B:58:0x020d, B:60:0x0218, B:61:0x0221, B:63:0x0226, B:66:0x0233, B:68:0x0237, B:70:0x0242, B:72:0x024d, B:74:0x0258, B:76:0x0263, B:78:0x026e, B:80:0x0279, B:82:0x0284, B:83:0x028d, B:85:0x0297, B:87:0x02a2, B:89:0x02ad, B:90:0x02b6, B:119:0x01bc, B:120:0x02c5, B:121:0x02ca, B:123:0x02cb, B:124:0x02d0, B:131:0x007e, B:132:0x0109, B:133:0x0111, B:134:0x0122, B:136:0x0128, B:139:0x0135, B:144:0x0139, B:149:0x008f, B:151:0x00b7, B:152:0x00c8, B:154:0x00ce, B:163:0x00e6, B:165:0x00ea, B:175:0x009b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0263 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:13:0x0058, B:14:0x0168, B:16:0x0175, B:17:0x0178, B:19:0x0183, B:21:0x018b, B:23:0x0193, B:24:0x0199, B:27:0x01a3, B:29:0x01a9, B:32:0x01b3, B:36:0x01bf, B:38:0x01c3, B:40:0x01c9, B:43:0x01d7, B:45:0x01dd, B:47:0x01e3, B:49:0x01ed, B:51:0x01f1, B:53:0x01fc, B:58:0x020d, B:60:0x0218, B:61:0x0221, B:63:0x0226, B:66:0x0233, B:68:0x0237, B:70:0x0242, B:72:0x024d, B:74:0x0258, B:76:0x0263, B:78:0x026e, B:80:0x0279, B:82:0x0284, B:83:0x028d, B:85:0x0297, B:87:0x02a2, B:89:0x02ad, B:90:0x02b6, B:119:0x01bc, B:120:0x02c5, B:121:0x02ca, B:123:0x02cb, B:124:0x02d0, B:131:0x007e, B:132:0x0109, B:133:0x0111, B:134:0x0122, B:136:0x0128, B:139:0x0135, B:144:0x0139, B:149:0x008f, B:151:0x00b7, B:152:0x00c8, B:154:0x00ce, B:163:0x00e6, B:165:0x00ea, B:175:0x009b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x026e A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:13:0x0058, B:14:0x0168, B:16:0x0175, B:17:0x0178, B:19:0x0183, B:21:0x018b, B:23:0x0193, B:24:0x0199, B:27:0x01a3, B:29:0x01a9, B:32:0x01b3, B:36:0x01bf, B:38:0x01c3, B:40:0x01c9, B:43:0x01d7, B:45:0x01dd, B:47:0x01e3, B:49:0x01ed, B:51:0x01f1, B:53:0x01fc, B:58:0x020d, B:60:0x0218, B:61:0x0221, B:63:0x0226, B:66:0x0233, B:68:0x0237, B:70:0x0242, B:72:0x024d, B:74:0x0258, B:76:0x0263, B:78:0x026e, B:80:0x0279, B:82:0x0284, B:83:0x028d, B:85:0x0297, B:87:0x02a2, B:89:0x02ad, B:90:0x02b6, B:119:0x01bc, B:120:0x02c5, B:121:0x02ca, B:123:0x02cb, B:124:0x02d0, B:131:0x007e, B:132:0x0109, B:133:0x0111, B:134:0x0122, B:136:0x0128, B:139:0x0135, B:144:0x0139, B:149:0x008f, B:151:0x00b7, B:152:0x00c8, B:154:0x00ce, B:163:0x00e6, B:165:0x00ea, B:175:0x009b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0279 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:13:0x0058, B:14:0x0168, B:16:0x0175, B:17:0x0178, B:19:0x0183, B:21:0x018b, B:23:0x0193, B:24:0x0199, B:27:0x01a3, B:29:0x01a9, B:32:0x01b3, B:36:0x01bf, B:38:0x01c3, B:40:0x01c9, B:43:0x01d7, B:45:0x01dd, B:47:0x01e3, B:49:0x01ed, B:51:0x01f1, B:53:0x01fc, B:58:0x020d, B:60:0x0218, B:61:0x0221, B:63:0x0226, B:66:0x0233, B:68:0x0237, B:70:0x0242, B:72:0x024d, B:74:0x0258, B:76:0x0263, B:78:0x026e, B:80:0x0279, B:82:0x0284, B:83:0x028d, B:85:0x0297, B:87:0x02a2, B:89:0x02ad, B:90:0x02b6, B:119:0x01bc, B:120:0x02c5, B:121:0x02ca, B:123:0x02cb, B:124:0x02d0, B:131:0x007e, B:132:0x0109, B:133:0x0111, B:134:0x0122, B:136:0x0128, B:139:0x0135, B:144:0x0139, B:149:0x008f, B:151:0x00b7, B:152:0x00c8, B:154:0x00ce, B:163:0x00e6, B:165:0x00ea, B:175:0x009b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0284 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:13:0x0058, B:14:0x0168, B:16:0x0175, B:17:0x0178, B:19:0x0183, B:21:0x018b, B:23:0x0193, B:24:0x0199, B:27:0x01a3, B:29:0x01a9, B:32:0x01b3, B:36:0x01bf, B:38:0x01c3, B:40:0x01c9, B:43:0x01d7, B:45:0x01dd, B:47:0x01e3, B:49:0x01ed, B:51:0x01f1, B:53:0x01fc, B:58:0x020d, B:60:0x0218, B:61:0x0221, B:63:0x0226, B:66:0x0233, B:68:0x0237, B:70:0x0242, B:72:0x024d, B:74:0x0258, B:76:0x0263, B:78:0x026e, B:80:0x0279, B:82:0x0284, B:83:0x028d, B:85:0x0297, B:87:0x02a2, B:89:0x02ad, B:90:0x02b6, B:119:0x01bc, B:120:0x02c5, B:121:0x02ca, B:123:0x02cb, B:124:0x02d0, B:131:0x007e, B:132:0x0109, B:133:0x0111, B:134:0x0122, B:136:0x0128, B:139:0x0135, B:144:0x0139, B:149:0x008f, B:151:0x00b7, B:152:0x00c8, B:154:0x00ce, B:163:0x00e6, B:165:0x00ea, B:175:0x009b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0297 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:13:0x0058, B:14:0x0168, B:16:0x0175, B:17:0x0178, B:19:0x0183, B:21:0x018b, B:23:0x0193, B:24:0x0199, B:27:0x01a3, B:29:0x01a9, B:32:0x01b3, B:36:0x01bf, B:38:0x01c3, B:40:0x01c9, B:43:0x01d7, B:45:0x01dd, B:47:0x01e3, B:49:0x01ed, B:51:0x01f1, B:53:0x01fc, B:58:0x020d, B:60:0x0218, B:61:0x0221, B:63:0x0226, B:66:0x0233, B:68:0x0237, B:70:0x0242, B:72:0x024d, B:74:0x0258, B:76:0x0263, B:78:0x026e, B:80:0x0279, B:82:0x0284, B:83:0x028d, B:85:0x0297, B:87:0x02a2, B:89:0x02ad, B:90:0x02b6, B:119:0x01bc, B:120:0x02c5, B:121:0x02ca, B:123:0x02cb, B:124:0x02d0, B:131:0x007e, B:132:0x0109, B:133:0x0111, B:134:0x0122, B:136:0x0128, B:139:0x0135, B:144:0x0139, B:149:0x008f, B:151:0x00b7, B:152:0x00c8, B:154:0x00ce, B:163:0x00e6, B:165:0x00ea, B:175:0x009b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02a2 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:13:0x0058, B:14:0x0168, B:16:0x0175, B:17:0x0178, B:19:0x0183, B:21:0x018b, B:23:0x0193, B:24:0x0199, B:27:0x01a3, B:29:0x01a9, B:32:0x01b3, B:36:0x01bf, B:38:0x01c3, B:40:0x01c9, B:43:0x01d7, B:45:0x01dd, B:47:0x01e3, B:49:0x01ed, B:51:0x01f1, B:53:0x01fc, B:58:0x020d, B:60:0x0218, B:61:0x0221, B:63:0x0226, B:66:0x0233, B:68:0x0237, B:70:0x0242, B:72:0x024d, B:74:0x0258, B:76:0x0263, B:78:0x026e, B:80:0x0279, B:82:0x0284, B:83:0x028d, B:85:0x0297, B:87:0x02a2, B:89:0x02ad, B:90:0x02b6, B:119:0x01bc, B:120:0x02c5, B:121:0x02ca, B:123:0x02cb, B:124:0x02d0, B:131:0x007e, B:132:0x0109, B:133:0x0111, B:134:0x0122, B:136:0x0128, B:139:0x0135, B:144:0x0139, B:149:0x008f, B:151:0x00b7, B:152:0x00c8, B:154:0x00ce, B:163:0x00e6, B:165:0x00ea, B:175:0x009b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02ad A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:13:0x0058, B:14:0x0168, B:16:0x0175, B:17:0x0178, B:19:0x0183, B:21:0x018b, B:23:0x0193, B:24:0x0199, B:27:0x01a3, B:29:0x01a9, B:32:0x01b3, B:36:0x01bf, B:38:0x01c3, B:40:0x01c9, B:43:0x01d7, B:45:0x01dd, B:47:0x01e3, B:49:0x01ed, B:51:0x01f1, B:53:0x01fc, B:58:0x020d, B:60:0x0218, B:61:0x0221, B:63:0x0226, B:66:0x0233, B:68:0x0237, B:70:0x0242, B:72:0x024d, B:74:0x0258, B:76:0x0263, B:78:0x026e, B:80:0x0279, B:82:0x0284, B:83:0x028d, B:85:0x0297, B:87:0x02a2, B:89:0x02ad, B:90:0x02b6, B:119:0x01bc, B:120:0x02c5, B:121:0x02ca, B:123:0x02cb, B:124:0x02d0, B:131:0x007e, B:132:0x0109, B:133:0x0111, B:134:0x0122, B:136:0x0128, B:139:0x0135, B:144:0x0139, B:149:0x008f, B:151:0x00b7, B:152:0x00c8, B:154:0x00ce, B:163:0x00e6, B:165:0x00ea, B:175:0x009b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, fkp fkpVar, int i, int i2, ContinuationImpl continuationImpl) {
        MapObjectFactory$createMapObject$1 mapObjectFactory$createMapObject$1;
        int i3;
        Object failure;
        Throwable a;
        int i4;
        fkp fkpVar2;
        int i5;
        an00 an00Var;
        Iterator it;
        zm00 zm00Var;
        ym00 ym00Var;
        c cVar2;
        int i6;
        fkp fkpVar3;
        an00 an00Var2;
        Object W;
        ym00 ym00Var2;
        fkp fkpVar4;
        int i7;
        String a2;
        MapObjectType mapObjectType;
        mmp h;
        Float b;
        mmp h2;
        c cVar3 = cVar;
        cVar3.getClass();
        if (continuationImpl instanceof MapObjectFactory$createMapObject$1) {
            mapObjectFactory$createMapObject$1 = (MapObjectFactory$createMapObject$1) continuationImpl;
            int i8 = mapObjectFactory$createMapObject$1.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                mapObjectFactory$createMapObject$1.label = i8 - Integer.MIN_VALUE;
                Object obj = mapObjectFactory$createMapObject$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = mapObjectFactory$createMapObject$1.label;
                boolean z = false;
                if (i3 != 0) {
                    kotlin.b.b(obj);
                    mapObjectFactory$createMapObject$1.L$0 = fkpVar;
                    mapObjectFactory$createMapObject$1.L$1 = cVar3;
                    mapObjectFactory$createMapObject$1.I$0 = i;
                    i4 = i2;
                    mapObjectFactory$createMapObject$1.I$1 = i4;
                    mapObjectFactory$createMapObject$1.label = 1;
                    Object b2 = cVar3.b(fkpVar, mapObjectFactory$createMapObject$1);
                    if (b2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    fkpVar2 = fkpVar;
                    i5 = i;
                    obj = b2;
                } else if (i3 == 1) {
                    int i9 = mapObjectFactory$createMapObject$1.I$1;
                    i5 = mapObjectFactory$createMapObject$1.I$0;
                    c cVar4 = (c) mapObjectFactory$createMapObject$1.L$1;
                    fkpVar2 = (fkp) mapObjectFactory$createMapObject$1.L$0;
                    kotlin.b.b(obj);
                    i4 = i9;
                    cVar3 = cVar4;
                } else {
                    if (i3 == 2) {
                        i6 = mapObjectFactory$createMapObject$1.I$1;
                        i5 = mapObjectFactory$createMapObject$1.I$0;
                        an00Var2 = (an00) mapObjectFactory$createMapObject$1.L$3;
                        cVar2 = (c) mapObjectFactory$createMapObject$1.L$1;
                        fkpVar3 = (fkp) mapObjectFactory$createMapObject$1.L$0;
                        kotlin.b.b(obj);
                        ym00Var = (ym00) obj;
                        an00Var = an00Var2;
                        fkpVar2 = fkpVar3;
                        i4 = i6;
                        cVar3 = cVar2;
                        an00 a3 = an00.a(an00Var, ym00Var);
                        Set set = cVar3.a;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : set) {
                            if (!((zm00) obj2).b()) {
                                arrayList.add(obj2);
                            }
                        }
                        tpr C = kotlinx.coroutines.flow.e.C(new g(arrayList), new MapObjectFactory$createMapObject$lambda$0$$inlined$flatMapMerge$1(null, ym00Var, a3));
                        mapObjectFactory$createMapObject$1.L$0 = fkpVar2;
                        mapObjectFactory$createMapObject$1.L$1 = null;
                        mapObjectFactory$createMapObject$1.L$2 = null;
                        mapObjectFactory$createMapObject$1.L$3 = null;
                        mapObjectFactory$createMapObject$1.L$4 = ym00Var;
                        mapObjectFactory$createMapObject$1.L$5 = null;
                        mapObjectFactory$createMapObject$1.L$6 = null;
                        mapObjectFactory$createMapObject$1.L$7 = null;
                        mapObjectFactory$createMapObject$1.I$0 = i5;
                        mapObjectFactory$createMapObject$1.I$1 = i4;
                        mapObjectFactory$createMapObject$1.label = 3;
                        W = kotlinx.coroutines.flow.e.W(C, mapObjectFactory$createMapObject$1);
                        if (W != coroutineSingletons) {
                            ym00Var2 = ym00Var;
                            fkpVar4 = fkpVar2;
                            obj = W;
                            i7 = i4;
                            List list = (List) obj;
                            HashSet hashSet = new HashSet(list.size());
                            if (ym00Var2 != null) {
                            }
                            hashSet.addAll(list);
                            jmp b3 = fkpVar4.getB();
                            if (b3 == null) {
                            }
                            if (r4 == null) {
                            }
                            if (r6 == null) {
                            }
                            a2 = fkpVar4.getA();
                            if (a2 != null) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i3 != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i7 = mapObjectFactory$createMapObject$1.I$1;
                    i5 = mapObjectFactory$createMapObject$1.I$0;
                    ym00Var2 = (ym00) mapObjectFactory$createMapObject$1.L$4;
                    fkpVar4 = (fkp) mapObjectFactory$createMapObject$1.L$0;
                    kotlin.b.b(obj);
                    List list2 = (List) obj;
                    HashSet hashSet2 = new HashSet(list2.size());
                    if (ym00Var2 != null) {
                        hashSet2.add(ym00Var2);
                    }
                    hashSet2.addAll(list2);
                    jmp b32 = fkpVar4.getB();
                    f0k j = b32 == null ? b32.getJ() : null;
                    f0k.a e = j == null ? j.getE() : null;
                    f0k.a.C0095a d = e == null ? e.getD() : null;
                    a2 = fkpVar4.getA();
                    if (a2 != null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    zlp c = fkpVar4.getC();
                    zzs a4 = c != null ? c.getA() : null;
                    if (a4 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    if (b32 != null) {
                        mapObjectType = b32.getK();
                        if (mapObjectType == null) {
                        }
                        MapObjectType mapObjectType2 = mapObjectType;
                        if (b32 != null && (h2 = b32.getH()) != null) {
                            z = jl40.l(h2.getA(), Boolean.TRUE);
                        }
                        boolean z2 = z;
                        float floatValue = (b32 != null || (h = b32.getH()) == null || (b = h.getB()) == null) ? 1.0f : b.floatValue();
                        int i10 = i7 - i5;
                        Float b4 = j == null ? j.getB() : null;
                        List a5 = e == null ? e.getA() : null;
                        EmptyList emptyList = EmptyList.a;
                        wp31 wp31Var = new wp31(z2, floatValue, i10, b4, a5 != null ? emptyList : a5, e == null ? e.getB() : null, e == null ? e.getC() : null);
                        List i11 = b32 == null ? b32.getI() : null;
                        failure = new lm00(a2, a4, mapObjectType2, wp31Var, i11 != null ? emptyList : i11, hashSet2, false, new sm00(d == null ? d.getA() : null, d == null ? d.getB() : null, d == null ? d.getC() : null, d == null ? d.getD() : null, d == null ? d.getE() : null, d == null ? d.getF() : null, d == null ? d.getG() : null, d == null ? d.getH() : null, fkpVar4.getC().getA(), d == null ? d.getI() : null, d == null ? d.getJ() : null, d == null ? d.getK() : null, 512));
                        a = Result.a(failure);
                        if (a != null) {
                            jst.e.k(a, "Failed to prepare map object");
                        }
                        if (failure instanceof Result.Failure) {
                            return failure;
                        }
                        return null;
                    }
                    mapObjectType = MapObjectType.UNKNOWN;
                    MapObjectType mapObjectType22 = mapObjectType;
                    if (b32 != null) {
                        z = jl40.l(h2.getA(), Boolean.TRUE);
                    }
                    boolean z22 = z;
                    float floatValue2 = (b32 != null || (h = b32.getH()) == null || (b = h.getB()) == null) ? 1.0f : b.floatValue();
                    int i102 = i7 - i5;
                    if (j == null) {
                    }
                    if (e == null) {
                    }
                    EmptyList emptyList2 = EmptyList.a;
                    wp31 wp31Var2 = new wp31(z22, floatValue2, i102, b4, a5 != null ? emptyList2 : a5, e == null ? e.getB() : null, e == null ? e.getC() : null);
                    if (b32 == null) {
                    }
                    failure = new lm00(a2, a4, mapObjectType22, wp31Var2, i11 != null ? emptyList2 : i11, hashSet2, false, new sm00(d == null ? d.getA() : null, d == null ? d.getB() : null, d == null ? d.getC() : null, d == null ? d.getD() : null, d == null ? d.getE() : null, d == null ? d.getF() : null, d == null ? d.getG() : null, d == null ? d.getH() : null, fkpVar4.getC().getA(), d == null ? d.getI() : null, d == null ? d.getJ() : null, d == null ? d.getK() : null, 512));
                    a = Result.a(failure);
                    if (a != null) {
                    }
                    if (failure instanceof Result.Failure) {
                    }
                }
                an00Var = new an00(fkpVar2, (vm00) obj, null);
                it = cVar3.a.iterator();
                boolean z3 = false;
                Object obj3 = null;
                while (true) {
                    if (!it.hasNext()) {
                        Object next = it.next();
                        if (((zm00) next).b()) {
                            if (z3) {
                                break;
                            }
                            z3 = true;
                            obj3 = next;
                        }
                    } else if (!z3) {
                    }
                }
                obj3 = null;
                zm00Var = (zm00) obj3;
                if (zm00Var != null) {
                    ym00Var = null;
                    an00 a32 = an00.a(an00Var, ym00Var);
                    Set set2 = cVar3.a;
                    ArrayList arrayList2 = new ArrayList();
                    while (r0.hasNext()) {
                    }
                    tpr C2 = kotlinx.coroutines.flow.e.C(new g(arrayList2), new MapObjectFactory$createMapObject$lambda$0$$inlined$flatMapMerge$1(null, ym00Var, a32));
                    mapObjectFactory$createMapObject$1.L$0 = fkpVar2;
                    mapObjectFactory$createMapObject$1.L$1 = null;
                    mapObjectFactory$createMapObject$1.L$2 = null;
                    mapObjectFactory$createMapObject$1.L$3 = null;
                    mapObjectFactory$createMapObject$1.L$4 = ym00Var;
                    mapObjectFactory$createMapObject$1.L$5 = null;
                    mapObjectFactory$createMapObject$1.L$6 = null;
                    mapObjectFactory$createMapObject$1.L$7 = null;
                    mapObjectFactory$createMapObject$1.I$0 = i5;
                    mapObjectFactory$createMapObject$1.I$1 = i4;
                    mapObjectFactory$createMapObject$1.label = 3;
                    W = kotlinx.coroutines.flow.e.W(C2, mapObjectFactory$createMapObject$1);
                    if (W != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                tpr a6 = zm00Var.a(an00Var);
                mapObjectFactory$createMapObject$1.L$0 = fkpVar2;
                mapObjectFactory$createMapObject$1.L$1 = cVar3;
                mapObjectFactory$createMapObject$1.L$2 = null;
                mapObjectFactory$createMapObject$1.L$3 = an00Var;
                mapObjectFactory$createMapObject$1.L$4 = null;
                mapObjectFactory$createMapObject$1.I$0 = i5;
                mapObjectFactory$createMapObject$1.I$1 = i4;
                mapObjectFactory$createMapObject$1.label = 2;
                obj = kotlinx.coroutines.flow.e.A(a6, mapObjectFactory$createMapObject$1);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                cVar2 = cVar3;
                i6 = i4;
                fkpVar3 = fkpVar2;
                an00Var2 = an00Var;
                ym00Var = (ym00) obj;
                an00Var = an00Var2;
                fkpVar2 = fkpVar3;
                i4 = i6;
                cVar3 = cVar2;
                an00 a322 = an00.a(an00Var, ym00Var);
                Set set22 = cVar3.a;
                ArrayList arrayList22 = new ArrayList();
                while (r0.hasNext()) {
                }
                tpr C22 = kotlinx.coroutines.flow.e.C(new g(arrayList22), new MapObjectFactory$createMapObject$lambda$0$$inlined$flatMapMerge$1(null, ym00Var, a322));
                mapObjectFactory$createMapObject$1.L$0 = fkpVar2;
                mapObjectFactory$createMapObject$1.L$1 = null;
                mapObjectFactory$createMapObject$1.L$2 = null;
                mapObjectFactory$createMapObject$1.L$3 = null;
                mapObjectFactory$createMapObject$1.L$4 = ym00Var;
                mapObjectFactory$createMapObject$1.L$5 = null;
                mapObjectFactory$createMapObject$1.L$6 = null;
                mapObjectFactory$createMapObject$1.L$7 = null;
                mapObjectFactory$createMapObject$1.I$0 = i5;
                mapObjectFactory$createMapObject$1.I$1 = i4;
                mapObjectFactory$createMapObject$1.label = 3;
                W = kotlinx.coroutines.flow.e.W(C22, mapObjectFactory$createMapObject$1);
                if (W != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
        }
        mapObjectFactory$createMapObject$1 = new MapObjectFactory$createMapObject$1(cVar3, continuationImpl);
        Object obj4 = mapObjectFactory$createMapObject$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = mapObjectFactory$createMapObject$1.label;
        boolean z4 = false;
        if (i3 != 0) {
        }
        an00Var = new an00(fkpVar2, (vm00) obj4, null);
        it = cVar3.a.iterator();
        boolean z32 = false;
        Object obj32 = null;
        while (true) {
            if (!it.hasNext()) {
            }
        }
        obj32 = null;
        zm00Var = (zm00) obj32;
        if (zm00Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(fkp fkpVar, ContinuationImpl continuationImpl) {
        MapObjectFactory$createMapObjectAnimation$1 mapObjectFactory$createMapObjectAnimation$1;
        int i;
        f0k j;
        if (continuationImpl instanceof MapObjectFactory$createMapObjectAnimation$1) {
            mapObjectFactory$createMapObjectAnimation$1 = (MapObjectFactory$createMapObjectAnimation$1) continuationImpl;
            int i2 = mapObjectFactory$createMapObjectAnimation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapObjectFactory$createMapObjectAnimation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapObjectFactory$createMapObjectAnimation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapObjectFactory$createMapObjectAnimation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    jmp b = fkpVar.getB();
                    if (!((b == null || (j = b.getJ()) == null) ? false : jl40.l(j.getD(), Boolean.TRUE))) {
                        return null;
                    }
                    mapObjectFactory$createMapObjectAnimation$1.L$0 = fkpVar;
                    mapObjectFactory$createMapObjectAnimation$1.label = 1;
                    obj = this.b.a(mapObjectFactory$createMapObjectAnimation$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fkpVar = (fkp) mapObjectFactory$createMapObjectAnimation$1.L$0;
                    kotlin.b.b(obj);
                }
                LayersObjectsAnimationParamsExperiment.AnimationParams animationParams = (LayersObjectsAnimationParamsExperiment.AnimationParams) obj;
                if (fkpVar.getB().getK() == MapObjectType.ADVERT) {
                    if ((animationParams != null ? animationParams.b : null) == LayersObjectsAnimationParamsExperiment.AnimationParams.AnimationType.FADE) {
                        return new um00(animationParams.a);
                    }
                }
                return tm00.a;
            }
        }
        mapObjectFactory$createMapObjectAnimation$1 = new MapObjectFactory$createMapObjectAnimation$1(this, continuationImpl);
        Object obj2 = mapObjectFactory$createMapObjectAnimation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapObjectFactory$createMapObjectAnimation$1.label;
        if (i != 0) {
        }
        LayersObjectsAnimationParamsExperiment.AnimationParams animationParams2 = (LayersObjectsAnimationParamsExperiment.AnimationParams) obj2;
        if (fkpVar.getB().getK() == MapObjectType.ADVERT) {
        }
        return tm00.a;
    }

    public final Object c(ArrayList arrayList, Continuation continuation) {
        return bvf0.n(new MapObjectFactory$createMapObjects$2(arrayList, this, null), continuation);
    }
}
