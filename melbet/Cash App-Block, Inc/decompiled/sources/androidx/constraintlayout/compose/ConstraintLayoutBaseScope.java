package androidx.constraintlayout.compose;

import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.ConstraintSetParser$FiniteGenerator;
import androidx.constraintlayout.core.state.ConstraintSetParser$Generator;
import androidx.constraintlayout.core.state.State$Chain;
import androidx.constraintlayout.core.state.State$Wrap;
import androidx.constraintlayout.core.state.helpers.BarrierReference;
import androidx.constraintlayout.core.state.helpers.ChainReference;
import androidx.constraintlayout.core.state.helpers.Facade;
import androidx.constraintlayout.core.state.helpers.FlowReference;
import androidx.constraintlayout.core.state.helpers.GridReference;
import androidx.constraintlayout.core.state.helpers.HorizontalChainReference;
import androidx.constraintlayout.core.state.helpers.VerticalChainReference;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaky;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class ConstraintLayoutBaseScope {
    public final CLObject containerObject;

    public final class HorizontalAnchor {
        public final Object id;
        public final int index;
        public final ConstrainedLayoutReference reference;

        public HorizontalAnchor(Object obj, int i, ConstrainedLayoutReference constrainedLayoutReference) {
            this.id = obj;
            this.index = i;
            this.reference = constrainedLayoutReference;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HorizontalAnchor)) {
                return false;
            }
            HorizontalAnchor horizontalAnchor = (HorizontalAnchor) obj;
            return this.id.equals(horizontalAnchor.id) && this.index == horizontalAnchor.index && this.reference.equals(horizontalAnchor.reference);
        }

        public final int hashCode() {
            return this.reference.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.index, this.id.hashCode() * 31, 31);
        }

        public final String toString() {
            return "HorizontalAnchor(id=" + this.id + ", index=" + this.index + ", reference=" + this.reference + ')';
        }
    }

    public final class VerticalAnchor {
        public final Object id;
        public final int index;
        public final ConstrainedLayoutReference reference;

        public VerticalAnchor(Object obj, int i, ConstrainedLayoutReference constrainedLayoutReference) {
            this.id = obj;
            this.index = i;
            this.reference = constrainedLayoutReference;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VerticalAnchor)) {
                return false;
            }
            VerticalAnchor verticalAnchor = (VerticalAnchor) obj;
            return this.id.equals(verticalAnchor.id) && this.index == verticalAnchor.index && this.reference.equals(verticalAnchor.reference);
        }

        public final int hashCode() {
            return this.reference.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.index, this.id.hashCode() * 31, 31);
        }

        public final String toString() {
            return "VerticalAnchor(id=" + this.id + ", index=" + this.index + ", reference=" + this.reference + ')';
        }
    }

    public ConstraintLayoutBaseScope(CLObject cLObject) {
        new ArrayList();
        this.containerObject = cLObject != null ? cLObject.mo1081clone() : new CLObject(new char[0]);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(11:117|(2:119|(11:121|(1:123)(1:134)|124|125|126|(1:128)|129|(1:131)|109|110|47))|135|125|126|(0)|129|(0)|109|110|47) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:193|(2:195|(8:197|(1:199)(1:211)|200|201|(1:203)|204|(2:206|207)(1:208)|47))|212|200|201|(0)|204|(0)(0)|47) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0465 A[Catch: NumberFormatException -> 0x03e8, TryCatch #2 {NumberFormatException -> 0x03e8, blocks: (B:126:0x0457, B:128:0x0465, B:129:0x046b, B:131:0x0473), top: B:125:0x0457 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0473 A[Catch: NumberFormatException -> 0x03e8, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x03e8, blocks: (B:126:0x0457, B:128:0x0465, B:129:0x046b, B:131:0x0473), top: B:125:0x0457 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x06a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0610 A[Catch: NumberFormatException -> 0x06a9, TryCatch #3 {NumberFormatException -> 0x06a9, blocks: (B:201:0x0602, B:203:0x0610, B:204:0x0616, B:206:0x061e), top: B:200:0x0602 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x061e A[Catch: NumberFormatException -> 0x06a9, TRY_LEAVE, TryCatch #3 {NumberFormatException -> 0x06a9, blocks: (B:201:0x0602, B:203:0x0610, B:204:0x0616, B:206:0x061e), top: B:200:0x0602 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x06a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x06a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:410:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x08ce  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x0c05  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x0c4d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03de A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r36v0, types: [androidx.constraintlayout.compose.State] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v189 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void applyTo(State state) {
        ?? r7;
        CLObject cLObject;
        Iterator it;
        char c;
        CLObject cLObject2;
        String stringOrNull;
        CLObject cLObject3;
        String stringOrNull2;
        String str;
        String str2;
        ?? r8;
        char c2;
        String str3;
        int i;
        CLElement cLElement;
        float int$1;
        float f;
        float f2;
        float f3;
        Recorder.AnonymousClass3 anonymousClass3;
        char c3;
        Iterator it2;
        String str4;
        Recorder.AnonymousClass3 anonymousClass32;
        Iterator it3;
        int i2;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        String content;
        char c4;
        char c5;
        FlowReference flowReference;
        Iterator it4;
        char c6;
        Recorder.AnonymousClass3 anonymousClass33;
        String str5;
        String str6;
        String content2;
        String str7;
        String str8;
        Float valueOf;
        Float f10;
        Float f11;
        char c7;
        String content3;
        String str9;
        String str10;
        float int$12;
        float f12;
        float f13;
        float f14;
        Float valueOf2;
        Float f15;
        Float f16;
        CLElement cLElement2;
        Recorder.AnonymousClass3 anonymousClass34;
        CLArray cLArray;
        float f17;
        float f18;
        float f19;
        boolean z = false;
        Recorder.AnonymousClass3 anonymousClass35 = new Recorder.AnonymousClass3(20, z);
        anonymousClass35.val$completer = new HashMap();
        anonymousClass35.val$recordingToStart = new HashMap();
        anonymousClass35.this$0 = new HashMap();
        CLObject cLObject4 = this.containerObject;
        for (Iterator it5 = cLObject4.names().iterator(); it5.hasNext(); it5 = it) {
            String str11 = (String) it5.next();
            CLElement cLElement3 = cLObject4.get(str11);
            str11.getClass();
            switch (str11.hashCode()) {
                case -1824489883:
                    if (str11.equals("Helpers")) {
                        r7 = z;
                        break;
                    }
                    r7 = -1;
                    break;
                case 1875016085:
                    if (str11.equals("Generate")) {
                        r7 = 1;
                        break;
                    }
                    r7 = -1;
                    break;
                case 1921490263:
                    if (str11.equals("Variables")) {
                        r7 = 2;
                        break;
                    }
                    r7 = -1;
                    break;
                default:
                    r7 = -1;
                    break;
            }
            switch (r7) {
                case 0:
                    cLObject = cLObject4;
                    it = it5;
                    if (cLElement3 instanceof CLArray) {
                        CLArray cLArray2 = (CLArray) cLElement3;
                        for (int i3 = 0; i3 < cLArray2.mElements.size(); i3++) {
                            CLElement cLElement4 = cLArray2.get(i3);
                            if (cLElement4 instanceof CLArray) {
                                CLArray cLArray3 = (CLArray) cLElement4;
                                if (cLArray3.mElements.size() > 1) {
                                    String string2 = cLArray3.getString(0);
                                    switch (string2.hashCode()) {
                                        case -1785507558:
                                            if (string2.equals("vGuideline")) {
                                                c = 0;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1252464839:
                                            if (string2.equals("hChain")) {
                                                c = 1;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -851656725:
                                            if (string2.equals("vChain")) {
                                                c = 2;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 965681512:
                                            if (string2.equals("hGuideline")) {
                                                c = 3;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        default:
                                            c = 65535;
                                            break;
                                    }
                                    switch (c) {
                                        case 0:
                                            CLElement cLElement5 = cLArray3.get(1);
                                            if ((cLElement5 instanceof CLObject) && (stringOrNull = (cLObject2 = (CLObject) cLElement5).getStringOrNull("id")) != null) {
                                                zzaky.parseGuidelineParams(1, state, stringOrNull, cLObject2);
                                                break;
                                            }
                                            break;
                                        case 1:
                                            zzaky.parseChain(0, state, anonymousClass35, cLArray3);
                                            break;
                                        case 2:
                                            zzaky.parseChain(1, state, anonymousClass35, cLArray3);
                                            break;
                                        case 3:
                                            CLElement cLElement6 = cLArray3.get(1);
                                            if ((cLElement6 instanceof CLObject) && (stringOrNull2 = (cLObject3 = (CLObject) cLElement6).getStringOrNull("id")) != null) {
                                                zzaky.parseGuidelineParams(0, state, stringOrNull2, cLObject3);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }
                        }
                        break;
                    }
                    break;
                case 1:
                    cLObject = cLObject4;
                    it = it5;
                    if (cLElement3 instanceof CLObject) {
                        CLObject cLObject5 = (CLObject) cLElement3;
                        Iterator it6 = cLObject5.names().iterator();
                        while (it6.hasNext()) {
                            String str12 = (String) it6.next();
                            CLElement cLElement7 = cLObject5.get(str12);
                            HashMap hashMap = (HashMap) anonymousClass35.this$0;
                            ArrayList arrayList = hashMap.containsKey(str12) ? (ArrayList) hashMap.get(str12) : null;
                            if (arrayList != null && (cLElement7 instanceof CLObject)) {
                                Iterator it7 = arrayList.iterator();
                                while (it7.hasNext()) {
                                    zzaky.parseWidget(state, anonymousClass35, (String) it7.next(), (CLObject) cLElement7);
                                }
                            }
                        }
                        break;
                    }
                    break;
                case 2:
                    cLObject = cLObject4;
                    it = it5;
                    if (cLElement3 instanceof CLObject) {
                        CLObject cLObject6 = (CLObject) cLElement3;
                        Iterator it8 = cLObject6.names().iterator();
                        while (it8.hasNext()) {
                            String str13 = (String) it8.next();
                            CLElement cLElement8 = cLObject6.get(str13);
                            if (cLElement8 instanceof CLNumber) {
                                ((HashMap) anonymousClass35.val$completer).put(str13, Integer.valueOf(cLElement8.getInt$1()));
                            } else if (cLElement8 instanceof CLObject) {
                                CLObject cLObject7 = (CLObject) cLElement8;
                                if (cLObject7.has("from") && cLObject7.has("to")) {
                                    float f20 = anonymousClass35.get(cLObject7.get("from"));
                                    float f21 = anonymousClass35.get(cLObject7.get("to"));
                                    String stringOrNull3 = cLObject7.getStringOrNull("prefix");
                                    String stringOrNull4 = cLObject7.getStringOrNull("postfix");
                                    HashMap hashMap2 = (HashMap) anonymousClass35.val$recordingToStart;
                                    if (hashMap2.containsKey(str13)) {
                                        hashMap2.get(str13);
                                    }
                                    ConstraintSetParser$FiniteGenerator constraintSetParser$FiniteGenerator = new ConstraintSetParser$FiniteGenerator();
                                    constraintSetParser$FiniteGenerator.mStop = false;
                                    constraintSetParser$FiniteGenerator.mCurrent = RecyclerView.DECELERATION_RATE;
                                    if (stringOrNull3 == null) {
                                        stringOrNull3 = "";
                                    }
                                    constraintSetParser$FiniteGenerator.mPrefix = stringOrNull3;
                                    if (stringOrNull4 == null) {
                                        stringOrNull4 = "";
                                    }
                                    constraintSetParser$FiniteGenerator.mPostfix = stringOrNull4;
                                    constraintSetParser$FiniteGenerator.mMax = f21;
                                    hashMap2.put(str13, constraintSetParser$FiniteGenerator);
                                    HashMap hashMap3 = (HashMap) anonymousClass35.this$0;
                                    ArrayList arrayList2 = new ArrayList();
                                    int i4 = (int) f20;
                                    int i5 = (int) f21;
                                    int i6 = i4;
                                    while (i4 <= i5) {
                                        arrayList2.add(constraintSetParser$FiniteGenerator.mPrefix + i6 + constraintSetParser$FiniteGenerator.mPostfix);
                                        i6++;
                                        i4++;
                                    }
                                    hashMap3.put(str13, arrayList2);
                                } else if (cLObject7.has("from") && cLObject7.has("step")) {
                                    float f22 = anonymousClass35.get(cLObject7.get("from"));
                                    float f23 = anonymousClass35.get(cLObject7.get("step"));
                                    HashMap hashMap4 = (HashMap) anonymousClass35.val$recordingToStart;
                                    if (hashMap4.containsKey(str13)) {
                                        hashMap4.get(str13);
                                    }
                                    ConstraintSetParser$Generator constraintSetParser$Generator = new ConstraintSetParser$Generator();
                                    constraintSetParser$Generator.mIncrementBy = f23;
                                    constraintSetParser$Generator.mCurrent = f22;
                                    hashMap4.put(str13, constraintSetParser$Generator);
                                } else if (cLObject7.has("ids")) {
                                    CLElement cLElement9 = cLObject7.get("ids");
                                    if (!(cLElement9 instanceof CLArray)) {
                                        throw new CLParsingException("no array found for key <ids>, found [" + cLElement9.getStrClass() + "] : " + cLElement9, cLObject7);
                                    }
                                    CLArray cLArray4 = (CLArray) cLElement9;
                                    ArrayList arrayList3 = new ArrayList();
                                    for (int i7 = 0; i7 < cLArray4.mElements.size(); i7++) {
                                        arrayList3.add(cLArray4.getString(i7));
                                    }
                                    ((HashMap) anonymousClass35.this$0).put(str13, arrayList3);
                                } else if (cLObject7.has("tag")) {
                                    String string3 = cLObject7.getString("tag");
                                    HashMap hashMap5 = state.mTags;
                                    ((HashMap) anonymousClass35.this$0).put(str13, hashMap5.containsKey(string3) ? (ArrayList) hashMap5.get(string3) : null);
                                }
                            }
                        }
                        break;
                    }
                    break;
                default:
                    if (cLElement3 instanceof CLObject) {
                        CLObject cLObject8 = (CLObject) cLElement3;
                        Iterator it9 = cLObject8.names().iterator();
                        while (true) {
                            str = "type";
                            if (!it9.hasNext()) {
                                str2 = null;
                            } else if (((String) it9.next()).equals("type")) {
                                str2 = cLObject8.getString("type");
                            }
                        }
                        if (str2 != null) {
                            switch (str2.hashCode()) {
                                case -1785507558:
                                    if (str2.equals("vGuideline")) {
                                        r8 = z;
                                        break;
                                    }
                                    r8 = -1;
                                    break;
                                case -1354837162:
                                    if (str2.equals("column")) {
                                        r8 = 1;
                                        break;
                                    }
                                    r8 = -1;
                                    break;
                                case -1252464839:
                                    if (str2.equals("hChain")) {
                                        r8 = 2;
                                        break;
                                    }
                                    r8 = -1;
                                    break;
                                case -851656725:
                                    if (str2.equals("vChain")) {
                                        r8 = 3;
                                        break;
                                    }
                                    r8 = -1;
                                    break;
                                case -333143113:
                                    if (str2.equals("barrier")) {
                                        r8 = 4;
                                        break;
                                    }
                                    r8 = -1;
                                    break;
                                case 113114:
                                    if (str2.equals("row")) {
                                        r8 = 5;
                                        break;
                                    }
                                    r8 = -1;
                                    break;
                                case 3181382:
                                    if (str2.equals("grid")) {
                                        r8 = 6;
                                        break;
                                    }
                                    r8 = -1;
                                    break;
                                case 98238902:
                                    if (str2.equals("hFlow")) {
                                        r8 = 7;
                                        break;
                                    }
                                    r8 = -1;
                                    break;
                                case 111168196:
                                    if (str2.equals("vFlow")) {
                                        r8 = 8;
                                        break;
                                    }
                                    r8 = -1;
                                    break;
                                case 965681512:
                                    if (str2.equals("hGuideline")) {
                                        r8 = 9;
                                        break;
                                    }
                                    r8 = -1;
                                    break;
                                default:
                                    r8 = -1;
                                    break;
                            }
                            String str14 = "\"";
                            cLObject = cLObject4;
                            switch (r8) {
                                case 0:
                                    it = it5;
                                    zzaky.parseGuidelineParams(1, state, str11, cLObject8);
                                    break;
                                case 1:
                                case 5:
                                case 6:
                                    it = it5;
                                    ConstraintReference constraints = state.constraints(str11);
                                    Facade facade = constraints.mFacade;
                                    if (facade == null || !(facade instanceof GridReference)) {
                                        GridReference gridReference = new GridReference(state, str2.charAt(0) == 'r' ? 10 : str2.charAt(0) == 'c' ? 11 : 9);
                                        constraints.mFacade = gridReference;
                                        constraints.setConstraintWidget(gridReference.getConstraintWidget());
                                    }
                                    GridReference gridReference2 = (GridReference) constraints.mFacade;
                                    Iterator it10 = cLObject8.names().iterator();
                                    while (it10.hasNext()) {
                                        String str15 = (String) it10.next();
                                        str15.getClass();
                                        switch (str15.hashCode()) {
                                            case -1439500848:
                                                if (str15.equals("orientation")) {
                                                    c2 = 0;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case -806339567:
                                                if (str15.equals("padding")) {
                                                    c2 = 1;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case -567445985:
                                                if (str15.equals("contains")) {
                                                    c2 = 2;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 3169614:
                                                if (str15.equals("hGap")) {
                                                    c2 = 3;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 3506649:
                                                if (str15.equals("rows")) {
                                                    c2 = 4;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 3586688:
                                                if (str15.equals("vGap")) {
                                                    c2 = 5;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 97513095:
                                                if (str15.equals("flags")) {
                                                    c2 = 6;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 109497044:
                                                if (str15.equals("skips")) {
                                                    c2 = 7;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 109638249:
                                                if (str15.equals("spans")) {
                                                    c2 = '\b';
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 144441793:
                                                if (str15.equals("rowWeights")) {
                                                    c2 = '\t';
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 949721053:
                                                if (str15.equals("columns")) {
                                                    c2 = '\n';
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 2033353925:
                                                if (str15.equals("columnWeights")) {
                                                    c2 = 11;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            default:
                                                c2 = 65535;
                                                break;
                                        }
                                        switch (c2) {
                                            case 0:
                                                gridReference2.mOrientation = cLObject8.get(str15).getInt$1();
                                                break;
                                            case 1:
                                                CLElement cLElement10 = cLObject8.get(str15);
                                                if (cLElement10 instanceof CLArray) {
                                                    CLArray cLArray5 = (CLArray) cLElement10;
                                                    if (cLArray5.mElements.size() > 1) {
                                                        int$1 = cLArray5.getInt(0);
                                                        f3 = cLArray5.getInt(1);
                                                        if (cLArray5.mElements.size() > 2) {
                                                            f2 = cLArray5.getInt(2);
                                                            try {
                                                                try {
                                                                    f = ((CLArray) cLElement10).getInt(3);
                                                                } catch (ArrayIndexOutOfBoundsException unused) {
                                                                    f = RecyclerView.DECELERATION_RATE;
                                                                    gridReference2.mPaddingStart = Math.round(state.mDpToPixel.toPixels(int$1));
                                                                    gridReference2.mPaddingTop = Math.round(state.mDpToPixel.toPixels(f3));
                                                                    gridReference2.mPaddingEnd = Math.round(state.mDpToPixel.toPixels(f2));
                                                                    gridReference2.mPaddingBottom = Math.round(state.mDpToPixel.toPixels(f));
                                                                }
                                                            } catch (ArrayIndexOutOfBoundsException unused2) {
                                                            }
                                                        } else {
                                                            f2 = int$1;
                                                            f = f3;
                                                        }
                                                        gridReference2.mPaddingStart = Math.round(state.mDpToPixel.toPixels(int$1));
                                                        gridReference2.mPaddingTop = Math.round(state.mDpToPixel.toPixels(f3));
                                                        gridReference2.mPaddingEnd = Math.round(state.mDpToPixel.toPixels(f2));
                                                        gridReference2.mPaddingBottom = Math.round(state.mDpToPixel.toPixels(f));
                                                    }
                                                }
                                                int$1 = cLElement10.getInt$1();
                                                f = int$1;
                                                f2 = f;
                                                f3 = f2;
                                                gridReference2.mPaddingStart = Math.round(state.mDpToPixel.toPixels(int$1));
                                                gridReference2.mPaddingTop = Math.round(state.mDpToPixel.toPixels(f3));
                                                gridReference2.mPaddingEnd = Math.round(state.mDpToPixel.toPixels(f2));
                                                gridReference2.mPaddingBottom = Math.round(state.mDpToPixel.toPixels(f));
                                            case 2:
                                                CLElement orNull = cLObject8.getOrNull(str15);
                                                CLArray cLArray6 = orNull instanceof CLArray ? (CLArray) orNull : null;
                                                if (cLArray6 != null) {
                                                    for (int i8 = 0; i8 < cLArray6.mElements.size(); i8++) {
                                                        gridReference2.add(state.constraints(cLArray6.get(i8).content()));
                                                    }
                                                }
                                                break;
                                            case 3:
                                                gridReference2.mHorizontalGaps = state.mDpToPixel.toPixels(cLObject8.get(str15).getFloat());
                                                break;
                                            case 4:
                                                int int$13 = cLObject8.get(str15).getInt$1();
                                                if (int$13 > 0 && gridReference2.mType != 11) {
                                                    gridReference2.mRowsSet = int$13;
                                                }
                                                break;
                                            case 5:
                                                gridReference2.mVerticalGaps = state.mDpToPixel.toPixels(cLObject8.get(str15).getFloat());
                                                break;
                                            case 6:
                                                try {
                                                    cLElement = cLObject8.get(str15);
                                                } catch (Exception e) {
                                                    System.err.println("Error parsing grid flags " + e);
                                                    str3 = "";
                                                }
                                                if (cLElement instanceof CLNumber) {
                                                    i = cLElement.getInt$1();
                                                    str3 = "";
                                                    if (str3.isEmpty()) {
                                                        gridReference2.getClass();
                                                        if (!str3.isEmpty()) {
                                                            String[] split = str3.split("\\|");
                                                            gridReference2.mFlags = 0;
                                                            for (String str16 : split) {
                                                                String lowerCase = str16.toLowerCase();
                                                                lowerCase.getClass();
                                                                if (lowerCase.equals("subgridbycolrow")) {
                                                                    gridReference2.mFlags |= 1;
                                                                } else if (lowerCase.equals("spansrespectwidgetorder")) {
                                                                    gridReference2.mFlags |= 2;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        gridReference2.mFlags = i;
                                                    }
                                                    break;
                                                } else {
                                                    str3 = cLElement.content();
                                                    i = 0;
                                                    if (str3.isEmpty()) {
                                                    }
                                                }
                                            case 7:
                                                String content4 = cLObject8.get(str15).content();
                                                if (content4.contains(":")) {
                                                    gridReference2.mSkips = content4;
                                                }
                                                break;
                                            case '\b':
                                                String content5 = cLObject8.get(str15).content();
                                                if (content5.contains(":")) {
                                                    gridReference2.mSpans = content5;
                                                }
                                                break;
                                            case '\t':
                                                String content6 = cLObject8.get(str15).content();
                                                if (content6.contains(",")) {
                                                    gridReference2.mRowWeights = content6;
                                                }
                                                break;
                                            case '\n':
                                                int int$14 = cLObject8.get(str15).getInt$1();
                                                if (int$14 > 0) {
                                                    if (gridReference2.mType != 10) {
                                                        gridReference2.mColumnsSet = int$14;
                                                    }
                                                    break;
                                                }
                                            case 11:
                                                String content7 = cLObject8.get(str15).content();
                                                if (content7.contains(",")) {
                                                    gridReference2.mColumnWeights = content7;
                                                }
                                                break;
                                            default:
                                                zzaky.applyAttribute(anonymousClass35, state, cLObject8, state.constraints(str11), str15);
                                                break;
                                        }
                                    }
                                    break;
                                case 2:
                                case 3:
                                    anonymousClass3 = anonymousClass35;
                                    String str17 = "\"";
                                    it = it5;
                                    ChainReference chainReference = str2.charAt(0) == 'h' ? (HorizontalChainReference) state.helper(1) : (VerticalChainReference) state.helper(2);
                                    chainReference.mKey = str11;
                                    Iterator it11 = cLObject8.names().iterator();
                                    while (it11.hasNext()) {
                                        String str18 = (String) it11.next();
                                        str18.getClass();
                                        switch (str18.hashCode()) {
                                            case -1383228885:
                                                if (str18.equals("bottom")) {
                                                    c3 = 0;
                                                    break;
                                                }
                                                c3 = 65535;
                                                break;
                                            case -567445985:
                                                if (str18.equals("contains")) {
                                                    c3 = 1;
                                                    break;
                                                }
                                                c3 = 65535;
                                                break;
                                            case 100571:
                                                if (str18.equals("end")) {
                                                    c3 = 2;
                                                    break;
                                                }
                                                c3 = 65535;
                                                break;
                                            case 115029:
                                                if (str18.equals("top")) {
                                                    c3 = 3;
                                                    break;
                                                }
                                                c3 = 65535;
                                                break;
                                            case 3317767:
                                                if (str18.equals("left")) {
                                                    c3 = 4;
                                                    break;
                                                }
                                                c3 = 65535;
                                                break;
                                            case 108511772:
                                                if (str18.equals("right")) {
                                                    c3 = 5;
                                                    break;
                                                }
                                                c3 = 65535;
                                                break;
                                            case 109757538:
                                                if (str18.equals("start")) {
                                                    c3 = 6;
                                                    break;
                                                }
                                                c3 = 65535;
                                                break;
                                            case 109780401:
                                                if (str18.equals("style")) {
                                                    c3 = 7;
                                                    break;
                                                }
                                                c3 = 65535;
                                                break;
                                            default:
                                                c3 = 65535;
                                                break;
                                        }
                                        switch (c3) {
                                            case 0:
                                            case 2:
                                            case 3:
                                            case 4:
                                            case 5:
                                            case 6:
                                                it2 = it11;
                                                str4 = str17;
                                                anonymousClass32 = anonymousClass3;
                                                zzaky.parseConstraint(anonymousClass32, state, cLObject8, chainReference, str18);
                                                anonymousClass3 = anonymousClass32;
                                                str17 = str4;
                                                it11 = it2;
                                            case 1:
                                                CLElement cLElement11 = cLObject8.get(str18);
                                                if (cLElement11 instanceof CLArray) {
                                                    CLArray cLArray7 = (CLArray) cLElement11;
                                                    if (cLArray7.mElements.size() >= 1) {
                                                        int i9 = 0;
                                                        while (i9 < cLArray7.mElements.size()) {
                                                            CLElement cLElement12 = cLArray7.get(i9);
                                                            if (cLElement12 instanceof CLArray) {
                                                                CLArray cLArray8 = (CLArray) cLElement12;
                                                                if (cLArray8.mElements.size() > 0) {
                                                                    String content8 = cLArray8.get(0).content();
                                                                    int size = cLArray8.mElements.size();
                                                                    it3 = it11;
                                                                    if (size != 2) {
                                                                        if (size == 3) {
                                                                            f9 = cLArray8.getFloat(1);
                                                                            f5 = state.mDpToPixel.toPixels(cLArray8.getFloat(2));
                                                                            f8 = f5;
                                                                        } else if (size == 4) {
                                                                            f9 = cLArray8.getFloat(1);
                                                                            float pixels = state.mDpToPixel.toPixels(cLArray8.getFloat(2));
                                                                            f5 = state.mDpToPixel.toPixels(cLArray8.getFloat(3));
                                                                            f8 = pixels;
                                                                        } else if (size != 6) {
                                                                            f5 = Float.NaN;
                                                                            f6 = Float.NaN;
                                                                            f7 = Float.NaN;
                                                                            f4 = Float.NaN;
                                                                            f8 = Float.NaN;
                                                                        } else {
                                                                            float f24 = cLArray8.getFloat(1);
                                                                            float pixels2 = state.mDpToPixel.toPixels(cLArray8.getFloat(2));
                                                                            float pixels3 = state.mDpToPixel.toPixels(cLArray8.getFloat(3));
                                                                            float pixels4 = state.mDpToPixel.toPixels(cLArray8.getFloat(4));
                                                                            f7 = state.mDpToPixel.toPixels(cLArray8.getFloat(5));
                                                                            f5 = pixels3;
                                                                            f8 = pixels2;
                                                                            f4 = f24;
                                                                            f6 = pixels4;
                                                                        }
                                                                        f4 = f9;
                                                                        f6 = Float.NaN;
                                                                        f7 = Float.NaN;
                                                                    } else {
                                                                        f4 = cLArray8.getFloat(1);
                                                                        f5 = Float.NaN;
                                                                        f6 = Float.NaN;
                                                                        f7 = Float.NaN;
                                                                        f8 = Float.NaN;
                                                                    }
                                                                    chainReference.add(content8);
                                                                    String obj = content8.toString();
                                                                    if (Float.isNaN(f4)) {
                                                                        i2 = i9;
                                                                    } else {
                                                                        i2 = i9;
                                                                        chainReference.mMapWeights.put(obj, Float.valueOf(f4));
                                                                    }
                                                                    if (!Float.isNaN(f8)) {
                                                                        chainReference.mMapPreMargin.put(obj, Float.valueOf(f8));
                                                                    }
                                                                    if (!Float.isNaN(f5)) {
                                                                        chainReference.mMapPostMargin.put(obj, Float.valueOf(f5));
                                                                    }
                                                                    if (!Float.isNaN(f6)) {
                                                                        if (chainReference.mMapPreGoneMargin == null) {
                                                                            chainReference.mMapPreGoneMargin = new HashMap();
                                                                        }
                                                                        chainReference.mMapPreGoneMargin.put(obj, Float.valueOf(f6));
                                                                    }
                                                                    if (!Float.isNaN(f7)) {
                                                                        if (chainReference.mMapPostGoneMargin == null) {
                                                                            chainReference.mMapPostGoneMargin = new HashMap();
                                                                        }
                                                                        chainReference.mMapPostGoneMargin.put(obj, Float.valueOf(f7));
                                                                    }
                                                                } else {
                                                                    it3 = it11;
                                                                    i2 = i9;
                                                                }
                                                            } else {
                                                                it3 = it11;
                                                                i2 = i9;
                                                                chainReference.add(cLElement12.content());
                                                            }
                                                            i9 = i2 + 1;
                                                            it11 = it3;
                                                        }
                                                        it2 = it11;
                                                        str4 = str17;
                                                        anonymousClass32 = anonymousClass3;
                                                        anonymousClass3 = anonymousClass32;
                                                        str17 = str4;
                                                        it11 = it2;
                                                    }
                                                }
                                                PrintStream printStream = System.err;
                                                StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(str11, " contains should be an array \"");
                                                m108m.append(cLElement11.content());
                                                m108m.append(str17);
                                                printStream.println(m108m.toString());
                                                break;
                                            case 7:
                                                CLElement cLElement13 = cLObject8.get(str18);
                                                if (cLElement13 instanceof CLArray) {
                                                    CLArray cLArray9 = (CLArray) cLElement13;
                                                    if (cLArray9.mElements.size() > 1) {
                                                        content = cLArray9.getString(0);
                                                        chainReference.mBias = cLArray9.getFloat(1);
                                                        if (!content.equals("packed")) {
                                                            chainReference.mStyle = State$Chain.PACKED;
                                                        } else if (content.equals("spread_inside")) {
                                                            chainReference.mStyle = State$Chain.SPREAD_INSIDE;
                                                        } else {
                                                            chainReference.mStyle = State$Chain.SPREAD;
                                                        }
                                                        it2 = it11;
                                                        str4 = str17;
                                                        anonymousClass32 = anonymousClass3;
                                                        anonymousClass3 = anonymousClass32;
                                                        str17 = str4;
                                                        it11 = it2;
                                                    }
                                                }
                                                content = cLElement13.content();
                                                if (!content.equals("packed")) {
                                                }
                                                it2 = it11;
                                                str4 = str17;
                                                anonymousClass32 = anonymousClass3;
                                                anonymousClass3 = anonymousClass32;
                                                str17 = str4;
                                                it11 = it2;
                                            default:
                                                it2 = it11;
                                                str4 = str17;
                                                anonymousClass32 = anonymousClass3;
                                                anonymousClass3 = anonymousClass32;
                                                str17 = str4;
                                                it11 = it2;
                                        }
                                        anonymousClass35 = anonymousClass3;
                                        break;
                                    }
                                    anonymousClass35 = anonymousClass3;
                                case 4:
                                    anonymousClass3 = anonymousClass35;
                                    it = it5;
                                    boolean z2 = state.mIsLtr;
                                    ConstraintReference constraints2 = state.constraints(str11);
                                    Facade facade2 = constraints2.mFacade;
                                    if (facade2 == null || !(facade2 instanceof BarrierReference)) {
                                        BarrierReference barrierReference = new BarrierReference(state, 5);
                                        barrierReference.mDirection = 4;
                                        constraints2.mFacade = barrierReference;
                                        constraints2.setConstraintWidget(barrierReference.getConstraintWidget());
                                    }
                                    BarrierReference barrierReference2 = (BarrierReference) constraints2.mFacade;
                                    Iterator it12 = cLObject8.names().iterator();
                                    while (it12.hasNext()) {
                                        String str19 = (String) it12.next();
                                        str19.getClass();
                                        switch (str19.hashCode()) {
                                            case -1081309778:
                                                if (str19.equals("margin")) {
                                                    c4 = 0;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case -962590849:
                                                if (str19.equals("direction")) {
                                                    c4 = 1;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case -567445985:
                                                if (str19.equals("contains")) {
                                                    c4 = 2;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            default:
                                                c4 = 65535;
                                                break;
                                        }
                                        switch (c4) {
                                            case 0:
                                                CLElement orNull2 = cLObject8.getOrNull(str19);
                                                float f25 = orNull2 instanceof CLNumber ? orNull2.getFloat() : Float.NaN;
                                                if (Float.isNaN(f25)) {
                                                    break;
                                                } else {
                                                    barrierReference2.margin(Float.valueOf(state.mDpToPixel.toPixels(f25)));
                                                    break;
                                                }
                                            case 1:
                                                String string4 = cLObject8.getString(str19);
                                                switch (string4.hashCode()) {
                                                    case -1383228885:
                                                        if (string4.equals("bottom")) {
                                                            c5 = 0;
                                                            break;
                                                        }
                                                        c5 = 65535;
                                                        break;
                                                    case 100571:
                                                        if (string4.equals("end")) {
                                                            c5 = 1;
                                                            break;
                                                        }
                                                        c5 = 65535;
                                                        break;
                                                    case 115029:
                                                        if (string4.equals("top")) {
                                                            c5 = 2;
                                                            break;
                                                        }
                                                        c5 = 65535;
                                                        break;
                                                    case 3317767:
                                                        if (string4.equals("left")) {
                                                            c5 = 3;
                                                            break;
                                                        }
                                                        c5 = 65535;
                                                        break;
                                                    case 108511772:
                                                        if (string4.equals("right")) {
                                                            c5 = 4;
                                                            break;
                                                        }
                                                        c5 = 65535;
                                                        break;
                                                    case 109757538:
                                                        if (string4.equals("start")) {
                                                            c5 = 5;
                                                            break;
                                                        }
                                                        c5 = 65535;
                                                        break;
                                                    default:
                                                        c5 = 65535;
                                                        break;
                                                }
                                                switch (c5) {
                                                    case 0:
                                                        barrierReference2.mDirection = 6;
                                                        break;
                                                    case 1:
                                                        if (z2) {
                                                            barrierReference2.mDirection = 2;
                                                            break;
                                                        } else {
                                                            barrierReference2.mDirection = 1;
                                                            break;
                                                        }
                                                    case 2:
                                                        barrierReference2.mDirection = 5;
                                                        break;
                                                    case 3:
                                                        barrierReference2.mDirection = 1;
                                                        break;
                                                    case 4:
                                                        barrierReference2.mDirection = 2;
                                                        break;
                                                    case 5:
                                                        if (z2) {
                                                            barrierReference2.mDirection = 1;
                                                            break;
                                                        } else {
                                                            barrierReference2.mDirection = 2;
                                                            break;
                                                        }
                                                }
                                            case 2:
                                                CLElement orNull3 = cLObject8.getOrNull(str19);
                                                CLArray cLArray10 = orNull3 instanceof CLArray ? (CLArray) orNull3 : null;
                                                if (cLArray10 != null) {
                                                    for (int i10 = 0; i10 < cLArray10.mElements.size(); i10++) {
                                                        barrierReference2.add(state.constraints(cLArray10.get(i10).content()));
                                                    }
                                                    break;
                                                } else {
                                                    break;
                                                }
                                        }
                                    }
                                    anonymousClass35 = anonymousClass3;
                                    break;
                                case 7:
                                case 8:
                                    Float valueOf3 = Float.valueOf(0.5f);
                                    boolean z3 = str2.charAt(0) == 'v';
                                    ConstraintReference constraints3 = state.constraints(str11);
                                    boolean z4 = z3;
                                    Facade facade3 = constraints3.mFacade;
                                    if (facade3 == null || !(facade3 instanceof FlowReference)) {
                                        if (z4) {
                                            it = it5;
                                            flowReference = new FlowReference(state, 8);
                                        } else {
                                            it = it5;
                                            flowReference = new FlowReference(state, 7);
                                        }
                                        constraints3.mFacade = flowReference;
                                        constraints3.setConstraintWidget(flowReference.getConstraintWidget());
                                    } else {
                                        it = it5;
                                    }
                                    FlowReference flowReference2 = (FlowReference) constraints3.mFacade;
                                    Iterator it13 = cLObject8.names().iterator();
                                    while (it13.hasNext()) {
                                        String str20 = (String) it13.next();
                                        str20.getClass();
                                        switch (str20.hashCode()) {
                                            case -1254185091:
                                                it4 = it13;
                                                if (str20.equals("hAlign")) {
                                                    c6 = 0;
                                                    break;
                                                }
                                                c6 = 65535;
                                                break;
                                            case -1237307863:
                                                it4 = it13;
                                                if (str20.equals("hStyle")) {
                                                    c6 = 1;
                                                    break;
                                                }
                                                c6 = 65535;
                                                break;
                                            case -1198076529:
                                                it4 = it13;
                                                if (str20.equals("hFlowBias")) {
                                                    c6 = 2;
                                                    break;
                                                }
                                                c6 = 65535;
                                                break;
                                            case -853376977:
                                                it4 = it13;
                                                if (str20.equals("vAlign")) {
                                                    c6 = 3;
                                                    break;
                                                }
                                                c6 = 65535;
                                                break;
                                            case -836499749:
                                                it4 = it13;
                                                if (str20.equals("vStyle")) {
                                                    c6 = 4;
                                                    break;
                                                }
                                                c6 = 65535;
                                                break;
                                            case -806339567:
                                                it4 = it13;
                                                if (str20.equals("padding")) {
                                                    c6 = 5;
                                                    break;
                                                }
                                                c6 = 65535;
                                                break;
                                            case -732635235:
                                                it4 = it13;
                                                if (str20.equals("vFlowBias")) {
                                                    c6 = 6;
                                                    break;
                                                }
                                                c6 = 65535;
                                                break;
                                            case -567445985:
                                                it4 = it13;
                                                if (str20.equals("contains")) {
                                                    c6 = 7;
                                                    break;
                                                }
                                                c6 = 65535;
                                                break;
                                            case -488900360:
                                                it4 = it13;
                                                if (str20.equals("maxElement")) {
                                                    c6 = '\b';
                                                    break;
                                                }
                                                c6 = 65535;
                                                break;
                                            case 3169614:
                                                it4 = it13;
                                                if (str20.equals("hGap")) {
                                                    c6 = '\t';
                                                    break;
                                                }
                                                c6 = 65535;
                                                break;
                                            case 3575610:
                                                it4 = it13;
                                                if (str20.equals(str)) {
                                                    c6 = '\n';
                                                    break;
                                                }
                                                c6 = 65535;
                                                break;
                                            case 3586688:
                                                it4 = it13;
                                                if (str20.equals("vGap")) {
                                                    c6 = 11;
                                                    break;
                                                }
                                                c6 = 65535;
                                                break;
                                            case 3657802:
                                                it4 = it13;
                                                if (str20.equals("wrap")) {
                                                    c6 = '\f';
                                                    break;
                                                }
                                                c6 = 65535;
                                                break;
                                            default:
                                                it4 = it13;
                                                c6 = 65535;
                                                break;
                                        }
                                        switch (c6) {
                                            case 0:
                                                anonymousClass33 = anonymousClass35;
                                                str5 = str14;
                                                str6 = str;
                                                String content9 = cLObject8.get(str20).content();
                                                if (content9.equals("end")) {
                                                    flowReference2.mHorizontalAlign = 1;
                                                } else if (content9.equals("start")) {
                                                    flowReference2.mHorizontalAlign = 0;
                                                } else {
                                                    flowReference2.mHorizontalAlign = 2;
                                                }
                                                it13 = it4;
                                                str14 = str5;
                                                str = str6;
                                                anonymousClass35 = anonymousClass33;
                                            case 1:
                                                anonymousClass33 = anonymousClass35;
                                                str5 = str14;
                                                str6 = str;
                                                CLElement cLElement14 = cLObject8.get(str20);
                                                if (cLElement14 instanceof CLArray) {
                                                    CLArray cLArray11 = (CLArray) cLElement14;
                                                    if (cLArray11.mElements.size() > 1) {
                                                        str7 = cLArray11.getString(0);
                                                        content2 = cLArray11.getString(1);
                                                        str8 = cLArray11.mElements.size() > 2 ? cLArray11.getString(2) : "";
                                                        if (!content2.equals("")) {
                                                            flowReference2.mHorizontalStyle = State$Chain.getValueByString(content2);
                                                        }
                                                        if (!str7.equals("")) {
                                                            flowReference2.mFirstHorizontalStyle = State$Chain.getValueByString(str7);
                                                        }
                                                        if (str8.equals("")) {
                                                            flowReference2.mLastHorizontalStyle = State$Chain.getValueByString(str8);
                                                        }
                                                        it13 = it4;
                                                        str14 = str5;
                                                        str = str6;
                                                        anonymousClass35 = anonymousClass33;
                                                    }
                                                }
                                                content2 = cLElement14.content();
                                                str7 = "";
                                                str8 = str7;
                                                if (!content2.equals("")) {
                                                }
                                                if (!str7.equals("")) {
                                                }
                                                if (str8.equals("")) {
                                                }
                                                it13 = it4;
                                                str14 = str5;
                                                str = str6;
                                                anonymousClass35 = anonymousClass33;
                                            case 2:
                                                anonymousClass33 = anonymousClass35;
                                                str5 = str14;
                                                str6 = str;
                                                CLElement cLElement15 = cLObject8.get(str20);
                                                if (cLElement15 instanceof CLArray) {
                                                    CLArray cLArray12 = (CLArray) cLElement15;
                                                    if (cLArray12.mElements.size() > 1) {
                                                        f10 = Float.valueOf(cLArray12.getFloat(0));
                                                        valueOf = Float.valueOf(cLArray12.getFloat(1));
                                                        f11 = cLArray12.mElements.size() > 2 ? Float.valueOf(cLArray12.getFloat(2)) : valueOf3;
                                                        flowReference2.mHorizontalBias = valueOf.floatValue();
                                                        if (f10.floatValue() != 0.5f) {
                                                            flowReference2.mFirstHorizontalBias = f10.floatValue();
                                                        }
                                                        if (f11.floatValue() == 0.5f) {
                                                            flowReference2.mLastHorizontalBias = f11.floatValue();
                                                        }
                                                        it13 = it4;
                                                        str14 = str5;
                                                        str = str6;
                                                        anonymousClass35 = anonymousClass33;
                                                    }
                                                }
                                                valueOf = Float.valueOf(cLElement15.getFloat());
                                                f10 = valueOf3;
                                                f11 = f10;
                                                flowReference2.mHorizontalBias = valueOf.floatValue();
                                                if (f10.floatValue() != 0.5f) {
                                                }
                                                if (f11.floatValue() == 0.5f) {
                                                }
                                                it13 = it4;
                                                str14 = str5;
                                                str = str6;
                                                anonymousClass35 = anonymousClass33;
                                            case 3:
                                                anonymousClass33 = anonymousClass35;
                                                str5 = str14;
                                                str6 = str;
                                                String content10 = cLObject8.get(str20).content();
                                                switch (content10.hashCode()) {
                                                    case -1720785339:
                                                        if (content10.equals("baseline")) {
                                                            c7 = 0;
                                                            break;
                                                        }
                                                        c7 = 65535;
                                                        break;
                                                    case -1383228885:
                                                        if (content10.equals("bottom")) {
                                                            c7 = 1;
                                                            break;
                                                        }
                                                        c7 = 65535;
                                                        break;
                                                    case 115029:
                                                        if (content10.equals("top")) {
                                                            c7 = 2;
                                                            break;
                                                        }
                                                        c7 = 65535;
                                                        break;
                                                    default:
                                                        c7 = 65535;
                                                        break;
                                                }
                                                switch (c7) {
                                                    case 0:
                                                        flowReference2.mVerticalAlign = 3;
                                                        break;
                                                    case 1:
                                                        flowReference2.mVerticalAlign = 1;
                                                        break;
                                                    case 2:
                                                        flowReference2.mVerticalAlign = 0;
                                                        break;
                                                    default:
                                                        flowReference2.mVerticalAlign = 2;
                                                        break;
                                                }
                                                it13 = it4;
                                                str14 = str5;
                                                str = str6;
                                                anonymousClass35 = anonymousClass33;
                                            case 4:
                                                anonymousClass33 = anonymousClass35;
                                                str5 = str14;
                                                str6 = str;
                                                CLElement cLElement16 = cLObject8.get(str20);
                                                if (cLElement16 instanceof CLArray) {
                                                    CLArray cLArray13 = (CLArray) cLElement16;
                                                    if (cLArray13.mElements.size() > 1) {
                                                        str9 = cLArray13.getString(0);
                                                        content3 = cLArray13.getString(1);
                                                        str10 = cLArray13.mElements.size() > 2 ? cLArray13.getString(2) : "";
                                                        if (!content3.equals("")) {
                                                            flowReference2.mVerticalStyle = State$Chain.getValueByString(content3);
                                                        }
                                                        if (!str9.equals("")) {
                                                            flowReference2.mFirstVerticalStyle = State$Chain.getValueByString(str9);
                                                        }
                                                        if (str10.equals("")) {
                                                            flowReference2.mLastVerticalStyle = State$Chain.getValueByString(str10);
                                                        }
                                                        it13 = it4;
                                                        str14 = str5;
                                                        str = str6;
                                                        anonymousClass35 = anonymousClass33;
                                                    }
                                                }
                                                content3 = cLElement16.content();
                                                str9 = "";
                                                str10 = str9;
                                                if (!content3.equals("")) {
                                                }
                                                if (!str9.equals("")) {
                                                }
                                                if (str10.equals("")) {
                                                }
                                                it13 = it4;
                                                str14 = str5;
                                                str = str6;
                                                anonymousClass35 = anonymousClass33;
                                            case 5:
                                                anonymousClass33 = anonymousClass35;
                                                str6 = str;
                                                CLElement cLElement17 = cLObject8.get(str20);
                                                if (cLElement17 instanceof CLArray) {
                                                    CLArray cLArray14 = (CLArray) cLElement17;
                                                    if (cLArray14.mElements.size() > 1) {
                                                        float f26 = cLArray14.getInt(0);
                                                        f13 = cLArray14.getInt(1);
                                                        if (cLArray14.mElements.size() > 2) {
                                                            float f27 = cLArray14.getInt(2);
                                                            try {
                                                                str5 = str14;
                                                                f14 = ((CLArray) cLElement17).getInt(3);
                                                                f12 = f27;
                                                                int$12 = f26;
                                                            } catch (ArrayIndexOutOfBoundsException unused3) {
                                                                f12 = f27;
                                                                str5 = str14;
                                                                int$12 = f26;
                                                                f14 = RecyclerView.DECELERATION_RATE;
                                                            }
                                                        } else {
                                                            str5 = str14;
                                                            f14 = f13;
                                                            int$12 = f26;
                                                            f12 = int$12;
                                                        }
                                                        flowReference2.mPaddingLeft = Math.round(state.mDpToPixel.toPixels(int$12));
                                                        flowReference2.mPaddingTop = Math.round(state.mDpToPixel.toPixels(f13));
                                                        flowReference2.mPaddingRight = Math.round(state.mDpToPixel.toPixels(f12));
                                                        flowReference2.mPaddingBottom = Math.round(state.mDpToPixel.toPixels(f14));
                                                        it13 = it4;
                                                        str14 = str5;
                                                        str = str6;
                                                        anonymousClass35 = anonymousClass33;
                                                    }
                                                }
                                                int$12 = cLElement17.getInt$1();
                                                f12 = int$12;
                                                f13 = f12;
                                                f14 = f13;
                                                str5 = str14;
                                                flowReference2.mPaddingLeft = Math.round(state.mDpToPixel.toPixels(int$12));
                                                flowReference2.mPaddingTop = Math.round(state.mDpToPixel.toPixels(f13));
                                                flowReference2.mPaddingRight = Math.round(state.mDpToPixel.toPixels(f12));
                                                flowReference2.mPaddingBottom = Math.round(state.mDpToPixel.toPixels(f14));
                                                it13 = it4;
                                                str14 = str5;
                                                str = str6;
                                                anonymousClass35 = anonymousClass33;
                                            case 6:
                                                anonymousClass33 = anonymousClass35;
                                                str6 = str;
                                                CLElement cLElement18 = cLObject8.get(str20);
                                                if (cLElement18 instanceof CLArray) {
                                                    CLArray cLArray15 = (CLArray) cLElement18;
                                                    if (cLArray15.mElements.size() > 1) {
                                                        Float valueOf4 = Float.valueOf(cLArray15.getFloat(0));
                                                        valueOf2 = Float.valueOf(cLArray15.getFloat(1));
                                                        f16 = cLArray15.mElements.size() > 2 ? Float.valueOf(cLArray15.getFloat(2)) : valueOf3;
                                                        f15 = valueOf4;
                                                        flowReference2.mVerticalBias = valueOf2.floatValue();
                                                        if (f15.floatValue() != 0.5f) {
                                                            flowReference2.mFirstVerticalBias = f15.floatValue();
                                                        }
                                                        if (f16.floatValue() != 0.5f) {
                                                            flowReference2.mLastVerticalBias = f16.floatValue();
                                                        }
                                                        str5 = str14;
                                                        it13 = it4;
                                                        str14 = str5;
                                                        str = str6;
                                                        anonymousClass35 = anonymousClass33;
                                                    }
                                                }
                                                valueOf2 = Float.valueOf(cLElement18.getFloat());
                                                f15 = valueOf3;
                                                f16 = f15;
                                                flowReference2.mVerticalBias = valueOf2.floatValue();
                                                if (f15.floatValue() != 0.5f) {
                                                }
                                                if (f16.floatValue() != 0.5f) {
                                                }
                                                str5 = str14;
                                                it13 = it4;
                                                str14 = str5;
                                                str = str6;
                                                anonymousClass35 = anonymousClass33;
                                            case 7:
                                                CLElement cLElement19 = cLObject8.get(str20);
                                                if (cLElement19 instanceof CLArray) {
                                                    CLArray cLArray16 = (CLArray) cLElement19;
                                                    cLElement2 = cLElement19;
                                                    str6 = str;
                                                    if (cLArray16.mElements.size() >= 1) {
                                                        int i11 = 0;
                                                        while (i11 < cLArray16.mElements.size()) {
                                                            CLElement cLElement20 = cLArray16.get(i11);
                                                            int i12 = i11;
                                                            if (cLElement20 instanceof CLArray) {
                                                                CLArray cLArray17 = (CLArray) cLElement20;
                                                                if (cLArray17.mElements.size() > 0) {
                                                                    String content11 = cLArray17.get(0).content();
                                                                    cLArray = cLArray16;
                                                                    int size2 = cLArray17.mElements.size();
                                                                    anonymousClass34 = anonymousClass35;
                                                                    if (size2 == 2) {
                                                                        f17 = cLArray17.getFloat(1);
                                                                        f18 = Float.NaN;
                                                                    } else if (size2 == 3) {
                                                                        f17 = cLArray17.getFloat(1);
                                                                        f18 = state.mDpToPixel.toPixels(cLArray17.getFloat(2));
                                                                    } else if (size2 != 4) {
                                                                        f17 = Float.NaN;
                                                                        f18 = Float.NaN;
                                                                    } else {
                                                                        float f28 = cLArray17.getFloat(1);
                                                                        f19 = state.mDpToPixel.toPixels(cLArray17.getFloat(2));
                                                                        f18 = state.mDpToPixel.toPixels(cLArray17.getFloat(3));
                                                                        f17 = f28;
                                                                        flowReference2.add(content11);
                                                                        if (!Float.isNaN(f17)) {
                                                                            if (flowReference2.mMapWeights == null) {
                                                                                flowReference2.mMapWeights = new HashMap();
                                                                            }
                                                                            flowReference2.mMapWeights.put(content11, Float.valueOf(f17));
                                                                        }
                                                                        if (!Float.isNaN(f19)) {
                                                                            if (flowReference2.mMapPreMargin == null) {
                                                                                flowReference2.mMapPreMargin = new HashMap();
                                                                            }
                                                                            flowReference2.mMapPreMargin.put(content11, Float.valueOf(f19));
                                                                        }
                                                                        if (!Float.isNaN(f18)) {
                                                                            if (flowReference2.mMapPostMargin == null) {
                                                                                flowReference2.mMapPostMargin = new HashMap();
                                                                            }
                                                                            flowReference2.mMapPostMargin.put(content11, Float.valueOf(f18));
                                                                        }
                                                                    }
                                                                    f19 = f18;
                                                                    flowReference2.add(content11);
                                                                    if (!Float.isNaN(f17)) {
                                                                    }
                                                                    if (!Float.isNaN(f19)) {
                                                                    }
                                                                    if (!Float.isNaN(f18)) {
                                                                    }
                                                                } else {
                                                                    anonymousClass34 = anonymousClass35;
                                                                    cLArray = cLArray16;
                                                                }
                                                            } else {
                                                                anonymousClass34 = anonymousClass35;
                                                                cLArray = cLArray16;
                                                                flowReference2.add(cLElement20.content());
                                                            }
                                                            i11 = i12 + 1;
                                                            cLArray16 = cLArray;
                                                            anonymousClass35 = anonymousClass34;
                                                        }
                                                        anonymousClass33 = anonymousClass35;
                                                        str5 = str14;
                                                        it13 = it4;
                                                        str14 = str5;
                                                        str = str6;
                                                        anonymousClass35 = anonymousClass33;
                                                    }
                                                } else {
                                                    cLElement2 = cLElement19;
                                                }
                                                anonymousClass3 = anonymousClass35;
                                                PrintStream printStream2 = System.err;
                                                StringBuilder m108m2 = Recorder$$ExternalSyntheticOutline2.m108m(str11, " contains should be an array \"");
                                                m108m2.append(cLElement2.content());
                                                m108m2.append(str14);
                                                printStream2.println(m108m2.toString());
                                                break;
                                            case '\b':
                                                flowReference2.mMaxElementsWrap = cLObject8.get(str20).getInt$1();
                                                anonymousClass33 = anonymousClass35;
                                                str5 = str14;
                                                str6 = str;
                                                it13 = it4;
                                                str14 = str5;
                                                str = str6;
                                                anonymousClass35 = anonymousClass33;
                                            case '\t':
                                                flowReference2.mHorizontalGap = cLObject8.get(str20).getInt$1();
                                                anonymousClass33 = anonymousClass35;
                                                str5 = str14;
                                                str6 = str;
                                                it13 = it4;
                                                str14 = str5;
                                                str = str6;
                                                anonymousClass35 = anonymousClass33;
                                            case '\n':
                                                if (cLObject8.get(str20).content().equals("hFlow")) {
                                                    flowReference2.mOrientation = 0;
                                                } else {
                                                    flowReference2.mOrientation = 1;
                                                }
                                                anonymousClass33 = anonymousClass35;
                                                str5 = str14;
                                                str6 = str;
                                                it13 = it4;
                                                str14 = str5;
                                                str = str6;
                                                anonymousClass35 = anonymousClass33;
                                            case 11:
                                                flowReference2.mVerticalGap = cLObject8.get(str20).getInt$1();
                                                anonymousClass33 = anonymousClass35;
                                                str5 = str14;
                                                str6 = str;
                                                it13 = it4;
                                                str14 = str5;
                                                str = str6;
                                                anonymousClass35 = anonymousClass33;
                                            case '\f':
                                                String content12 = cLObject8.get(str20).content();
                                                HashMap hashMap6 = State$Wrap.valueMap;
                                                flowReference2.mWrapMode = hashMap6.containsKey(content12) ? ((Integer) hashMap6.get(content12)).intValue() : -1;
                                                anonymousClass33 = anonymousClass35;
                                                str5 = str14;
                                                str6 = str;
                                                it13 = it4;
                                                str14 = str5;
                                                str = str6;
                                                anonymousClass35 = anonymousClass33;
                                            default:
                                                zzaky.applyAttribute(anonymousClass35, state, cLObject8, state.constraints(str11), str20);
                                                anonymousClass33 = anonymousClass35;
                                                str5 = str14;
                                                str6 = str;
                                                it13 = it4;
                                                str14 = str5;
                                                str = str6;
                                                anonymousClass35 = anonymousClass33;
                                        }
                                        anonymousClass35 = anonymousClass3;
                                        break;
                                    }
                                    anonymousClass3 = anonymousClass35;
                                    anonymousClass35 = anonymousClass3;
                                    break;
                                case 9:
                                    zzaky.parseGuidelineParams(0, state, str11, cLObject8);
                                default:
                                    it = it5;
                                    break;
                            }
                        } else {
                            cLObject = cLObject4;
                            it = it5;
                            zzaky.parseWidget(state, anonymousClass35, str11, cLObject8);
                            break;
                        }
                    } else {
                        cLObject = cLObject4;
                        it = it5;
                        if (cLElement3 instanceof CLNumber) {
                            ((HashMap) anonymousClass35.val$completer).put(str11, Integer.valueOf(cLElement3.getInt$1()));
                            break;
                        }
                    }
                    break;
            }
            z = false;
            cLObject4 = cLObject;
        }
    }

    public final CLObject asCLContainer$constraintlayout_compose_release(ConstrainedLayoutReference constrainedLayoutReference) {
        String obj = constrainedLayoutReference.id.toString();
        CLObject cLObject = this.containerObject;
        CLElement orNull = cLObject.getOrNull(obj);
        if ((orNull instanceof CLObject ? (CLObject) orNull : null) == null) {
            cLObject.put(obj, new CLObject(new char[0]));
        }
        CLElement cLElement = cLObject.get(obj);
        if (cLElement instanceof CLObject) {
            return (CLObject) cLElement;
        }
        StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("no object found for key <", obj, ">, found [");
        m3m.append(cLElement.getStrClass());
        m3m.append("] : ");
        m3m.append(cLElement);
        throw new CLParsingException(m3m.toString(), cLObject);
    }

    public final void constrain(ConstrainedLayoutReference constrainedLayoutReference, Function1 function1) {
        function1.invoke(new ConstrainScope(constrainedLayoutReference.id, asCLContainer$constraintlayout_compose_release(constrainedLayoutReference)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConstraintLayoutBaseScope)) {
            return false;
        }
        return Intrinsics.areEqual(this.containerObject, ((ConstraintLayoutBaseScope) obj).containerObject);
    }

    public final int hashCode() {
        return this.containerObject.hashCode();
    }
}
