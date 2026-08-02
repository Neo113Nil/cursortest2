package com.caverock.androidsvg;

import android.util.Log;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.common.util.TimedValueQueue;
import com.caverock.androidsvg.SVG;
import com.google.android.filament.Viewport;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.Grouping;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.slf4j.Marker;

/* loaded from: classes4.dex */
public final class CSSParser {
    public final int source;
    public boolean inMediaRule = false;
    public final MediaType deviceMediaType = MediaType.screen;

    public final class Attrib {
        public final String name;

        /* renamed from: operation, reason: collision with root package name */
        public final int f946operation;
        public final String value;

        public Attrib(String str, int i, String str2) {
            this.name = str;
            this.f946operation = i;
            this.value = str2;
        }
    }

    public final class CSSTextScanner extends TimedValueQueue {
        public CSSTextScanner(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""), 7);
        }

        public static int hexChar(int i) {
            if (i >= 48 && i <= 57) {
                return i - 48;
            }
            if (i >= 65 && i <= 70) {
                return i - 55;
            }
            if (i < 97 || i > 102) {
                return -1;
            }
            return i - 87;
        }

        public final String nextCSSString() {
            int hexChar;
            if (empty()) {
                return null;
            }
            char charAt = ((String) this.timestamps).charAt(this.first);
            if (charAt != '\'' && charAt != '\"') {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            this.first++;
            int intValue = nextChar().intValue();
            while (intValue != -1 && intValue != charAt) {
                if (intValue == 92) {
                    intValue = nextChar().intValue();
                    if (intValue != -1) {
                        if (intValue == 10 || intValue == 13 || intValue == 12) {
                            intValue = nextChar().intValue();
                        } else {
                            int hexChar2 = hexChar(intValue);
                            if (hexChar2 != -1) {
                                for (int i = 1; i <= 5 && (hexChar = hexChar((intValue = nextChar().intValue()))) != -1; i++) {
                                    hexChar2 = (hexChar2 * 16) + hexChar;
                                }
                                sb.append((char) hexChar2);
                            }
                        }
                    }
                }
                sb.append((char) intValue);
                intValue = nextChar().intValue();
            }
            return sb.toString();
        }

        public final String nextIdentifier() {
            int i;
            String str = (String) this.timestamps;
            boolean empty = empty();
            int i2 = this.first;
            if (!empty) {
                int charAt = str.charAt(i2);
                if (charAt == 45) {
                    charAt = advanceChar();
                }
                if ((charAt < 65 || charAt > 90) && ((charAt < 97 || charAt > 122) && charAt != 95)) {
                    i = i2;
                } else {
                    int advanceChar = advanceChar();
                    while (true) {
                        if ((advanceChar < 65 || advanceChar > 90) && ((advanceChar < 97 || advanceChar > 122) && !((advanceChar >= 48 && advanceChar <= 57) || advanceChar == 45 || advanceChar == 95))) {
                            break;
                        }
                        advanceChar = advanceChar();
                    }
                    i = this.first;
                }
                this.first = i2;
                i2 = i;
            }
            int i3 = this.first;
            if (i2 == i3) {
                return null;
            }
            String substring = str.substring(i3, i2);
            this.first = i2;
            return substring;
        }

        /* JADX WARN: Code restructure failed: missing block: B:219:0x045e, code lost:
        
            r0 = r4.simpleSelectors;
         */
        /* JADX WARN: Code restructure failed: missing block: B:220:0x0460, code lost:
        
            if (r0 == null) goto L271;
         */
        /* JADX WARN: Code restructure failed: missing block: B:222:0x0466, code lost:
        
            if (r0.isEmpty() == false) goto L270;
         */
        /* JADX WARN: Code restructure failed: missing block: B:223:0x0469, code lost:
        
            r1.add(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:224:0x046c, code lost:
        
            return r1;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:143:0x03df  */
        /* JADX WARN: Removed duplicated region for block: B:144:0x03f8 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:208:0x0439  */
        /* JADX WARN: Removed duplicated region for block: B:217:0x045c A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:286:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x041b  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x023e  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0264 A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r10v32, types: [com.caverock.androidsvg.CSSParser$PseudoClassOnlyChild] */
        /* JADX WARN: Type inference failed for: r10v33, types: [com.caverock.androidsvg.CSSParser$PseudoClassOnlyChild] */
        /* JADX WARN: Type inference failed for: r10v46, types: [com.caverock.androidsvg.CSSParser$PseudoClassNotSupported] */
        /* JADX WARN: Type inference failed for: r10v48 */
        /* JADX WARN: Type inference failed for: r10v49 */
        /* JADX WARN: Type inference failed for: r10v50, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r10v56, types: [com.caverock.androidsvg.CSSParser$PseudoClassNotSupported] */
        /* JADX WARN: Type inference failed for: r10v62 */
        /* JADX WARN: Type inference failed for: r10v63 */
        /* JADX WARN: Type inference failed for: r11v10, types: [com.caverock.androidsvg.CSSParser$SimpleSelector] */
        /* JADX WARN: Type inference failed for: r11v11 */
        /* JADX WARN: Type inference failed for: r11v12, types: [com.caverock.androidsvg.CSSParser$SimpleSelector] */
        /* JADX WARN: Type inference failed for: r11v13, types: [com.caverock.androidsvg.CSSParser$SimpleSelector] */
        /* JADX WARN: Type inference failed for: r11v14, types: [com.caverock.androidsvg.CSSParser$SimpleSelector] */
        /* JADX WARN: Type inference failed for: r11v15, types: [com.caverock.androidsvg.CSSParser$SimpleSelector] */
        /* JADX WARN: Type inference failed for: r11v16, types: [com.caverock.androidsvg.CSSParser$SimpleSelector] */
        /* JADX WARN: Type inference failed for: r11v17 */
        /* JADX WARN: Type inference failed for: r11v19 */
        /* JADX WARN: Type inference failed for: r11v20 */
        /* JADX WARN: Type inference failed for: r11v3 */
        /* JADX WARN: Type inference failed for: r11v6 */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v9, types: [com.caverock.androidsvg.CSSParser$SimpleSelector] */
        /* JADX WARN: Type inference failed for: r17v0, types: [com.caverock.androidsvg.CSSParser$PseudoClassAnPlusB] */
        /* JADX WARN: Type inference failed for: r17v1, types: [com.caverock.androidsvg.CSSParser$PseudoClassAnPlusB] */
        /* JADX WARN: Type inference failed for: r18v4, types: [com.caverock.androidsvg.CSSParser$PseudoClassAnPlusB] */
        /* JADX WARN: Type inference failed for: r19v1, types: [com.caverock.androidsvg.CSSParser$PseudoClassAnPlusB] */
        /* JADX WARN: Type inference failed for: r20v1, types: [com.caverock.androidsvg.CSSParser$PseudoClassAnPlusB] */
        /* JADX WARN: Type inference failed for: r2v10, types: [int] */
        /* JADX WARN: Type inference failed for: r2v26 */
        /* JADX WARN: Type inference failed for: r2v27 */
        /* JADX WARN: Type inference failed for: r2v28 */
        /* JADX WARN: Type inference failed for: r2v29 */
        /* JADX WARN: Type inference failed for: r2v30 */
        /* JADX WARN: Type inference failed for: r2v31 */
        /* JADX WARN: Type inference failed for: r2v32 */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1, types: [int] */
        /* JADX WARN: Type inference failed for: r3v17 */
        /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r7v9, types: [com.caverock.androidsvg.CSSParser$PseudoClassNot, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v13 */
        /* JADX WARN: Type inference failed for: r8v16, types: [com.google.android.filament.Viewport] */
        /* JADX WARN: Type inference failed for: r8v17 */
        /* JADX WARN: Type inference failed for: r8v27 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final ArrayList nextSelectorGroup() {
            int i;
            ?? r11;
            String str;
            boolean z;
            int i2;
            ?? r2;
            int i3;
            int i4;
            int i5;
            IntegerParser integerParser;
            Viewport viewport;
            ?? r8;
            PseudoClassRoot pseudoClassRoot;
            PseudoClassRoot pseudoClassRoot2;
            ArrayList nextSelectorGroup;
            ArrayList arrayList;
            ArrayList arrayList2;
            PseudoClassRoot pseudoClassRoot3;
            PseudoClassRoot pseudoClassRoot4;
            String str2 = null;
            if (empty()) {
                return null;
            }
            ?? r3 = 1;
            ArrayList arrayList3 = new ArrayList(1);
            Selector selector = new Selector();
            while (true) {
                if (!empty() && !empty()) {
                    int i6 = this.first;
                    ArrayList arrayList4 = selector.simpleSelectors;
                    int i7 = 2;
                    boolean z2 = false;
                    if (arrayList4 != null && !arrayList4.isEmpty()) {
                        if (consume('>')) {
                            skipWhitespace();
                            i = 2;
                        } else if (consume('+')) {
                            skipWhitespace();
                            i = 3;
                        }
                        if (consume('*')) {
                            String nextIdentifier = nextIdentifier();
                            if (nextIdentifier != null) {
                                SimpleSelector simpleSelector = new SimpleSelector(i, nextIdentifier);
                                selector.specificity += r3;
                                r11 = simpleSelector;
                            } else {
                                r11 = str2;
                            }
                        } else {
                            r11 = new SimpleSelector(i, str2);
                        }
                        while (!empty()) {
                            if (consume('.')) {
                                if (r11 == 0) {
                                    r11 = new SimpleSelector(i, str2);
                                }
                                String nextIdentifier2 = nextIdentifier();
                                if (nextIdentifier2 == null) {
                                    throw new CSSParseException("Invalid \".class\" simpleSelectors");
                                }
                                r11.addAttrib(i7, "class", nextIdentifier2);
                                selector.addedAttributeOrPseudo();
                            } else if (consume('#')) {
                                if (r11 == 0) {
                                    r11 = new SimpleSelector(i, str2);
                                }
                                String nextIdentifier3 = nextIdentifier();
                                if (nextIdentifier3 == null) {
                                    throw new CSSParseException("Invalid \"#id\" simpleSelectors");
                                }
                                r11.addAttrib(i7, "id", nextIdentifier3);
                                selector.specificity += 1000000;
                            } else if (consume('[')) {
                                if (r11 == 0) {
                                    r11 = new SimpleSelector(i, str2);
                                }
                                skipWhitespace();
                                String nextIdentifier4 = nextIdentifier();
                                if (nextIdentifier4 == null) {
                                    throw new CSSParseException("Invalid attribute simpleSelectors");
                                }
                                skipWhitespace();
                                int i8 = consume('=') ? i7 : consume("~=") ? 3 : consume("|=") ? 4 : z2 ? 1 : 0;
                                if (i8 != 0) {
                                    skipWhitespace();
                                    if (empty()) {
                                        str = str2;
                                    } else {
                                        str = nextQuotedString();
                                        if (str == null) {
                                            str = nextIdentifier();
                                        }
                                    }
                                    if (str == null) {
                                        throw new CSSParseException("Invalid attribute simpleSelectors");
                                    }
                                    skipWhitespace();
                                } else {
                                    str = str2;
                                }
                                if (!consume(']')) {
                                    throw new CSSParseException("Invalid attribute simpleSelectors");
                                }
                                if (i8 == 0) {
                                    i8 = r3 == true ? 1 : 0;
                                }
                                r11.addAttrib(i8, nextIdentifier4, str);
                                selector.addedAttributeOrPseudo();
                            } else {
                                r11 = r11;
                                if (consume(':')) {
                                    if (r11 == 0) {
                                        r11 = new SimpleSelector(i, str2);
                                    }
                                    String nextIdentifier5 = nextIdentifier();
                                    if (nextIdentifier5 == null) {
                                        throw new CSSParseException("Invalid pseudo class");
                                    }
                                    PseudoClassIdents pseudoClassIdents = (PseudoClassIdents) PseudoClassIdents.cache.get(nextIdentifier5);
                                    if (pseudoClassIdents == null) {
                                        pseudoClassIdents = PseudoClassIdents.UNSUPPORTED;
                                    }
                                    switch (pseudoClassIdents.ordinal()) {
                                        case 0:
                                            z = z2 ? 1 : 0;
                                            i2 = 2;
                                            PseudoClassRoot pseudoClassRoot5 = new PseudoClassRoot(i2);
                                            selector.addedAttributeOrPseudo();
                                            pseudoClassRoot3 = pseudoClassRoot5;
                                            if (r11.pseudos == null) {
                                                r11.pseudos = new ArrayList();
                                            }
                                            r11.pseudos.add(pseudoClassRoot3);
                                            z2 = z;
                                            i7 = i2;
                                            str2 = null;
                                            r3 = 1;
                                            break;
                                        case 1:
                                            r2 = 0;
                                            PseudoClassRoot pseudoClassRoot6 = new PseudoClassRoot(r2);
                                            selector.addedAttributeOrPseudo();
                                            pseudoClassRoot = pseudoClassRoot6;
                                            i2 = 2;
                                            z = r2;
                                            pseudoClassRoot3 = pseudoClassRoot;
                                            if (r11.pseudos == null) {
                                            }
                                            r11.pseudos.add(pseudoClassRoot3);
                                            z2 = z;
                                            i7 = i2;
                                            str2 = null;
                                            r3 = 1;
                                            break;
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                            boolean z3 = (pseudoClassIdents == PseudoClassIdents.nth_child || pseudoClassIdents == PseudoClassIdents.nth_of_type) ? r3 == true ? 1 : 0 : z2 ? 1 : 0;
                                            boolean z4 = (pseudoClassIdents == PseudoClassIdents.nth_of_type || pseudoClassIdents == PseudoClassIdents.nth_last_of_type) ? r3 == true ? 1 : 0 : z2 ? 1 : 0;
                                            int i9 = this.size;
                                            String str3 = (String) this.timestamps;
                                            if (!empty()) {
                                                int i10 = this.first;
                                                if (consume('(')) {
                                                    skipWhitespace();
                                                    if (consume("odd")) {
                                                        viewport = new Viewport(2, r3 == true ? 1 : 0);
                                                    } else if (consume("even")) {
                                                        viewport = new Viewport(2, z2 ? 1 : 0);
                                                    } else {
                                                        int i11 = (!consume('+') && consume('-')) ? -1 : r3 == true ? 1 : 0;
                                                        IntegerParser parseInt = IntegerParser.parseInt(this.first, i9, str3);
                                                        if (parseInt != null) {
                                                            this.first = parseInt.pos;
                                                        }
                                                        if (consume('n') || consume('N')) {
                                                            if (parseInt != null) {
                                                                i3 = i11;
                                                            } else {
                                                                i3 = i11;
                                                                parseInt = new IntegerParser(1L, this.first);
                                                            }
                                                            skipWhitespace();
                                                            boolean consume = consume('+');
                                                            i4 = (consume || !(consume = consume('-'))) ? 1 : -1;
                                                            if (consume) {
                                                                skipWhitespace();
                                                                integerParser = IntegerParser.parseInt(this.first, i9, str3);
                                                                if (integerParser != null) {
                                                                    this.first = integerParser.pos;
                                                                    i5 = i3;
                                                                } else {
                                                                    this.first = i10;
                                                                    r8 = 0;
                                                                    if (r8 == 0) {
                                                                        throw new CSSParseException("Invalid or missing parameter section for pseudo class: ".concat(nextIdentifier5));
                                                                    }
                                                                    ?? pseudoClassAnPlusB = new PseudoClassAnPlusB(r11.tag, r8.width, r8.height, z3, z4);
                                                                    selector.addedAttributeOrPseudo();
                                                                    pseudoClassRoot = pseudoClassAnPlusB;
                                                                    r2 = 0;
                                                                    i2 = 2;
                                                                    z = r2;
                                                                    pseudoClassRoot3 = pseudoClassRoot;
                                                                    if (r11.pseudos == null) {
                                                                    }
                                                                    r11.pseudos.add(pseudoClassRoot3);
                                                                    z2 = z;
                                                                    i7 = i2;
                                                                    str2 = null;
                                                                    r3 = 1;
                                                                    break;
                                                                }
                                                            } else {
                                                                i5 = i3;
                                                                integerParser = null;
                                                            }
                                                        } else {
                                                            integerParser = parseInt;
                                                            i4 = i11;
                                                            parseInt = null;
                                                            i5 = 1;
                                                        }
                                                        viewport = new Viewport(parseInt == null ? 0 : i5 * ((int) parseInt.value), integerParser == null ? 0 : i4 * ((int) integerParser.value));
                                                    }
                                                    skipWhitespace();
                                                    r8 = viewport;
                                                    if (!consume(')')) {
                                                        this.first = i10;
                                                        r8 = 0;
                                                    }
                                                    if (r8 == 0) {
                                                    }
                                                }
                                            }
                                            r8 = str2;
                                            if (r8 == 0) {
                                            }
                                            break;
                                        case 6:
                                            ?? pseudoClassAnPlusB2 = new PseudoClassAnPlusB(null, 0, 1, true, false);
                                            selector.addedAttributeOrPseudo();
                                            r2 = z2 ? 1 : 0;
                                            pseudoClassRoot = pseudoClassAnPlusB2;
                                            i2 = 2;
                                            z = r2;
                                            pseudoClassRoot3 = pseudoClassRoot;
                                            if (r11.pseudos == null) {
                                            }
                                            r11.pseudos.add(pseudoClassRoot3);
                                            z2 = z;
                                            i7 = i2;
                                            str2 = null;
                                            r3 = 1;
                                            break;
                                        case 7:
                                            ?? pseudoClassAnPlusB3 = new PseudoClassAnPlusB(null, 0, 1, false, false);
                                            selector.addedAttributeOrPseudo();
                                            r2 = z2 ? 1 : 0;
                                            pseudoClassRoot = pseudoClassAnPlusB3;
                                            i2 = 2;
                                            z = r2;
                                            pseudoClassRoot3 = pseudoClassRoot;
                                            if (r11.pseudos == null) {
                                            }
                                            r11.pseudos.add(pseudoClassRoot3);
                                            z2 = z;
                                            i7 = i2;
                                            str2 = null;
                                            r3 = 1;
                                            break;
                                        case 8:
                                            ?? pseudoClassAnPlusB4 = new PseudoClassAnPlusB(r11.tag, 0, 1, true, true);
                                            selector.addedAttributeOrPseudo();
                                            r2 = z2 ? 1 : 0;
                                            pseudoClassRoot = pseudoClassAnPlusB4;
                                            i2 = 2;
                                            z = r2;
                                            pseudoClassRoot3 = pseudoClassRoot;
                                            if (r11.pseudos == null) {
                                            }
                                            r11.pseudos.add(pseudoClassRoot3);
                                            z2 = z;
                                            i7 = i2;
                                            str2 = null;
                                            r3 = 1;
                                            break;
                                        case 9:
                                            ?? pseudoClassAnPlusB5 = new PseudoClassAnPlusB(r11.tag, 0, 1, false, true);
                                            selector.addedAttributeOrPseudo();
                                            r2 = z2 ? 1 : 0;
                                            pseudoClassRoot = pseudoClassAnPlusB5;
                                            i2 = 2;
                                            z = r2;
                                            pseudoClassRoot3 = pseudoClassRoot;
                                            if (r11.pseudos == null) {
                                            }
                                            r11.pseudos.add(pseudoClassRoot3);
                                            z2 = z;
                                            i7 = i2;
                                            str2 = null;
                                            r3 = 1;
                                            break;
                                        case 10:
                                            ?? pseudoClassOnlyChild = new PseudoClassOnlyChild(z2, str2);
                                            selector.addedAttributeOrPseudo();
                                            pseudoClassRoot2 = pseudoClassOnlyChild;
                                            r2 = z2 ? 1 : 0;
                                            pseudoClassRoot = pseudoClassRoot2;
                                            i2 = 2;
                                            z = r2;
                                            pseudoClassRoot3 = pseudoClassRoot;
                                            if (r11.pseudos == null) {
                                            }
                                            r11.pseudos.add(pseudoClassRoot3);
                                            z2 = z;
                                            i7 = i2;
                                            str2 = null;
                                            r3 = 1;
                                            break;
                                        case 11:
                                            ?? pseudoClassOnlyChild2 = new PseudoClassOnlyChild(r3, r11.tag);
                                            selector.addedAttributeOrPseudo();
                                            pseudoClassRoot2 = pseudoClassOnlyChild2;
                                            r2 = z2 ? 1 : 0;
                                            pseudoClassRoot = pseudoClassRoot2;
                                            i2 = 2;
                                            z = r2;
                                            pseudoClassRoot3 = pseudoClassRoot;
                                            if (r11.pseudos == null) {
                                            }
                                            r11.pseudos.add(pseudoClassRoot3);
                                            z2 = z;
                                            i7 = i2;
                                            str2 = null;
                                            r3 = 1;
                                            break;
                                        case 12:
                                            PseudoClassRoot pseudoClassRoot7 = new PseudoClassRoot(r3 == true ? 1 : 0);
                                            selector.addedAttributeOrPseudo();
                                            pseudoClassRoot2 = pseudoClassRoot7;
                                            r2 = z2 ? 1 : 0;
                                            pseudoClassRoot = pseudoClassRoot2;
                                            i2 = 2;
                                            z = r2;
                                            pseudoClassRoot3 = pseudoClassRoot;
                                            if (r11.pseudos == null) {
                                            }
                                            r11.pseudos.add(pseudoClassRoot3);
                                            z2 = z;
                                            i7 = i2;
                                            str2 = null;
                                            r3 = 1;
                                            break;
                                        case 13:
                                            if (!empty()) {
                                                int i12 = this.first;
                                                if (consume('(')) {
                                                    skipWhitespace();
                                                    nextSelectorGroup = nextSelectorGroup();
                                                    if (nextSelectorGroup == null) {
                                                        this.first = i12;
                                                    } else if (consume(')')) {
                                                        Iterator it = nextSelectorGroup.iterator();
                                                        while (it.hasNext() && (arrayList = ((Selector) it.next()).simpleSelectors) != null) {
                                                            Iterator it2 = arrayList.iterator();
                                                            while (it2.hasNext() && (arrayList2 = ((SimpleSelector) it2.next()).pseudos) != null) {
                                                                Iterator it3 = arrayList2.iterator();
                                                                while (it3.hasNext()) {
                                                                    if (((PseudoClass) it3.next()) instanceof PseudoClassNot) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (nextSelectorGroup != null) {
                                                            throw new CSSParseException("Invalid or missing parameter section for pseudo class: ".concat(nextIdentifier5));
                                                        }
                                                        ?? pseudoClassNot = new PseudoClassNot();
                                                        pseudoClassNot.selectorGroup = nextSelectorGroup;
                                                        Iterator it4 = nextSelectorGroup.iterator();
                                                        int i13 = PKIFailureInfo.systemUnavail;
                                                        while (it4.hasNext()) {
                                                            int i14 = ((Selector) it4.next()).specificity;
                                                            if (i14 > i13) {
                                                                i13 = i14;
                                                            }
                                                        }
                                                        selector.specificity = i13;
                                                        pseudoClassRoot2 = pseudoClassNot;
                                                        r2 = z2 ? 1 : 0;
                                                        pseudoClassRoot = pseudoClassRoot2;
                                                        i2 = 2;
                                                        z = r2;
                                                        pseudoClassRoot3 = pseudoClassRoot;
                                                        if (r11.pseudos == null) {
                                                        }
                                                        r11.pseudos.add(pseudoClassRoot3);
                                                        z2 = z;
                                                        i7 = i2;
                                                        str2 = null;
                                                        r3 = 1;
                                                        break;
                                                    } else {
                                                        this.first = i12;
                                                    }
                                                }
                                            }
                                            nextSelectorGroup = str2;
                                            if (nextSelectorGroup != null) {
                                            }
                                            break;
                                        case 14:
                                            if (!empty()) {
                                                int i15 = this.first;
                                                if (consume('(')) {
                                                    skipWhitespace();
                                                    ?? r10 = str2;
                                                    while (true) {
                                                        String nextIdentifier6 = nextIdentifier();
                                                        r10 = r10;
                                                        if (nextIdentifier6 == null) {
                                                            this.first = i15;
                                                        } else {
                                                            if (r10 == 0) {
                                                                r10 = new ArrayList();
                                                            }
                                                            r10.add(nextIdentifier6);
                                                            skipWhitespace();
                                                            if (!m1142skipCommaWhitespace()) {
                                                                if (!consume(')')) {
                                                                    this.first = i15;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            ?? pseudoClassNotSupported = new PseudoClassNotSupported(nextIdentifier5);
                                            selector.addedAttributeOrPseudo();
                                            pseudoClassRoot4 = pseudoClassNotSupported;
                                            i2 = i7;
                                            z = z2 ? 1 : 0;
                                            pseudoClassRoot3 = pseudoClassRoot4;
                                            if (r11.pseudos == null) {
                                            }
                                            r11.pseudos.add(pseudoClassRoot3);
                                            z2 = z;
                                            i7 = i2;
                                            str2 = null;
                                            r3 = 1;
                                            break;
                                        case 15:
                                        case 16:
                                        case 17:
                                        case 18:
                                        case 19:
                                        case 20:
                                        case 21:
                                        case 22:
                                        case 23:
                                            ?? pseudoClassNotSupported2 = new PseudoClassNotSupported(nextIdentifier5);
                                            selector.addedAttributeOrPseudo();
                                            pseudoClassRoot4 = pseudoClassNotSupported2;
                                            i2 = i7;
                                            z = z2 ? 1 : 0;
                                            pseudoClassRoot3 = pseudoClassRoot4;
                                            if (r11.pseudos == null) {
                                            }
                                            r11.pseudos.add(pseudoClassRoot3);
                                            z2 = z;
                                            i7 = i2;
                                            str2 = null;
                                            r3 = 1;
                                            break;
                                        default:
                                            throw new CSSParseException("Unsupported pseudo class: ".concat(nextIdentifier5));
                                    }
                                } else if (r11 != 0) {
                                    if (selector.simpleSelectors == null) {
                                        selector.simpleSelectors = new ArrayList();
                                    }
                                    selector.simpleSelectors.add(r11);
                                    if (m1142skipCommaWhitespace()) {
                                        arrayList3.add(selector);
                                        selector = new Selector();
                                    }
                                    str2 = null;
                                    r3 = 1;
                                } else {
                                    this.first = i6;
                                }
                            }
                        }
                        if (r11 != 0) {
                        }
                    }
                    i = 0;
                    if (consume('*')) {
                    }
                    while (!empty()) {
                    }
                    if (r11 != 0) {
                    }
                }
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class MediaType {
        public static final /* synthetic */ MediaType[] $VALUES;
        public static final MediaType all;
        public static final MediaType screen;

        static {
            MediaType mediaType = new MediaType("all", 0);
            all = mediaType;
            MediaType mediaType2 = new MediaType("aural", 1);
            MediaType mediaType3 = new MediaType("braille", 2);
            MediaType mediaType4 = new MediaType("embossed", 3);
            MediaType mediaType5 = new MediaType("handheld", 4);
            MediaType mediaType6 = new MediaType("print", 5);
            MediaType mediaType7 = new MediaType("projection", 6);
            MediaType mediaType8 = new MediaType("screen", 7);
            screen = mediaType8;
            $VALUES = new MediaType[]{mediaType, mediaType2, mediaType3, mediaType4, mediaType5, mediaType6, mediaType7, mediaType8, new MediaType("speech", 8), new MediaType("tty", 9), new MediaType("tv", 10)};
        }

        public static MediaType valueOf(String str) {
            return (MediaType) Enum.valueOf(MediaType.class, str);
        }

        public static MediaType[] values() {
            return (MediaType[]) $VALUES.clone();
        }
    }

    public interface PseudoClass {
        boolean matches(SVG.SvgElementBase svgElementBase);
    }

    public final class PseudoClassAnPlusB implements PseudoClass {
        public final int a;
        public final int b;
        public final boolean isFromStart;
        public final boolean isOfType;
        public final String nodeName;

        public PseudoClassAnPlusB(String str, int i, int i2, boolean z, boolean z2) {
            this.a = i;
            this.b = i2;
            this.isFromStart = z;
            this.isOfType = z2;
            this.nodeName = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0065 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0064 A[RETURN] */
        @Override // com.caverock.androidsvg.CSSParser.PseudoClass
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean matches(SVG.SvgElementBase svgElementBase) {
            int i;
            int i2;
            boolean z = this.isOfType;
            String str = this.nodeName;
            if (z && str == null) {
                str = svgElementBase.getNodeName();
            }
            SVG.SvgContainer svgContainer = svgElementBase.parent;
            if (svgContainer != null) {
                Iterator it = svgContainer.getChildren().iterator();
                i = 0;
                i2 = 0;
                while (it.hasNext()) {
                    SVG.SvgElementBase svgElementBase2 = (SVG.SvgElementBase) ((SVG.SvgObject) it.next());
                    if (svgElementBase2 == svgElementBase) {
                        i = i2;
                    }
                    if (str == null || svgElementBase2.getNodeName().equals(str)) {
                        i2++;
                    }
                }
            } else {
                i = 0;
                i2 = 1;
            }
            int i3 = this.isFromStart ? i + 1 : i2 - i;
            int i4 = this.b;
            int i5 = this.a;
            if (i5 == 0) {
                return i3 == i4;
            }
            int i6 = i3 - i4;
            if (i6 % i5 != 0 || (Integer.signum(i6) != 0 && Integer.signum(i6) != Integer.signum(i5))) {
            }
        }

        public final String toString() {
            String str = this.isFromStart ? "" : "last-";
            int i = this.b;
            boolean z = this.isOfType;
            int i2 = this.a;
            return z ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(i2), Integer.valueOf(i), this.nodeName) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(i2), Integer.valueOf(i));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class PseudoClassIdents {
        public static final /* synthetic */ PseudoClassIdents[] $VALUES;
        public static final PseudoClassIdents UNSUPPORTED;
        public static final HashMap cache;
        public static final PseudoClassIdents nth_child;
        public static final PseudoClassIdents nth_last_of_type;
        public static final PseudoClassIdents nth_of_type;

        /* JADX INFO: Fake field, exist only in values array */
        PseudoClassIdents EF1;

        static {
            PseudoClassIdents pseudoClassIdents = new PseudoClassIdents("target", 0);
            PseudoClassIdents pseudoClassIdents2 = new PseudoClassIdents("root", 1);
            PseudoClassIdents pseudoClassIdents3 = new PseudoClassIdents("nth_child", 2);
            nth_child = pseudoClassIdents3;
            PseudoClassIdents pseudoClassIdents4 = new PseudoClassIdents("nth_last_child", 3);
            PseudoClassIdents pseudoClassIdents5 = new PseudoClassIdents("nth_of_type", 4);
            nth_of_type = pseudoClassIdents5;
            PseudoClassIdents pseudoClassIdents6 = new PseudoClassIdents("nth_last_of_type", 5);
            nth_last_of_type = pseudoClassIdents6;
            PseudoClassIdents pseudoClassIdents7 = new PseudoClassIdents("first_child", 6);
            PseudoClassIdents pseudoClassIdents8 = new PseudoClassIdents("last_child", 7);
            PseudoClassIdents pseudoClassIdents9 = new PseudoClassIdents("first_of_type", 8);
            PseudoClassIdents pseudoClassIdents10 = new PseudoClassIdents("last_of_type", 9);
            PseudoClassIdents pseudoClassIdents11 = new PseudoClassIdents("only_child", 10);
            PseudoClassIdents pseudoClassIdents12 = new PseudoClassIdents("only_of_type", 11);
            PseudoClassIdents pseudoClassIdents13 = new PseudoClassIdents("empty", 12);
            PseudoClassIdents pseudoClassIdents14 = new PseudoClassIdents("not", 13);
            PseudoClassIdents pseudoClassIdents15 = new PseudoClassIdents("lang", 14);
            PseudoClassIdents pseudoClassIdents16 = new PseudoClassIdents("link", 15);
            PseudoClassIdents pseudoClassIdents17 = new PseudoClassIdents("visited", 16);
            PseudoClassIdents pseudoClassIdents18 = new PseudoClassIdents("hover", 17);
            PseudoClassIdents pseudoClassIdents19 = new PseudoClassIdents("active", 18);
            PseudoClassIdents pseudoClassIdents20 = new PseudoClassIdents("focus", 19);
            PseudoClassIdents pseudoClassIdents21 = new PseudoClassIdents("enabled", 20);
            PseudoClassIdents pseudoClassIdents22 = new PseudoClassIdents("disabled", 21);
            PseudoClassIdents pseudoClassIdents23 = new PseudoClassIdents("checked", 22);
            PseudoClassIdents pseudoClassIdents24 = new PseudoClassIdents("indeterminate", 23);
            PseudoClassIdents pseudoClassIdents25 = new PseudoClassIdents("UNSUPPORTED", 24);
            UNSUPPORTED = pseudoClassIdents25;
            $VALUES = new PseudoClassIdents[]{pseudoClassIdents, pseudoClassIdents2, pseudoClassIdents3, pseudoClassIdents4, pseudoClassIdents5, pseudoClassIdents6, pseudoClassIdents7, pseudoClassIdents8, pseudoClassIdents9, pseudoClassIdents10, pseudoClassIdents11, pseudoClassIdents12, pseudoClassIdents13, pseudoClassIdents14, pseudoClassIdents15, pseudoClassIdents16, pseudoClassIdents17, pseudoClassIdents18, pseudoClassIdents19, pseudoClassIdents20, pseudoClassIdents21, pseudoClassIdents22, pseudoClassIdents23, pseudoClassIdents24, pseudoClassIdents25};
            cache = new HashMap();
            for (PseudoClassIdents pseudoClassIdents26 : values()) {
                if (pseudoClassIdents26 != UNSUPPORTED) {
                    cache.put(pseudoClassIdents26.name().replace('_', '-'), pseudoClassIdents26);
                }
            }
        }

        public static PseudoClassIdents valueOf(String str) {
            return (PseudoClassIdents) Enum.valueOf(PseudoClassIdents.class, str);
        }

        public static PseudoClassIdents[] values() {
            return (PseudoClassIdents[]) $VALUES.clone();
        }
    }

    public final class PseudoClassNot implements PseudoClass {
        public List selectorGroup;

        @Override // com.caverock.androidsvg.CSSParser.PseudoClass
        public final boolean matches(SVG.SvgElementBase svgElementBase) {
            Iterator it = this.selectorGroup.iterator();
            while (it.hasNext()) {
                if (CSSParser.ruleMatch((Selector) it.next(), svgElementBase)) {
                    return false;
                }
            }
            return true;
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("not("), this.selectorGroup, ")");
        }
    }

    public final class PseudoClassNotSupported implements PseudoClass {
        public final String clazz;

        public PseudoClassNotSupported(String str) {
            this.clazz = str;
        }

        @Override // com.caverock.androidsvg.CSSParser.PseudoClass
        public final boolean matches(SVG.SvgElementBase svgElementBase) {
            return false;
        }

        public final String toString() {
            return this.clazz;
        }
    }

    public final class PseudoClassOnlyChild implements PseudoClass {
        public final boolean isOfType;
        public final String nodeName;

        public PseudoClassOnlyChild(boolean z, String str) {
            this.isOfType = z;
            this.nodeName = str;
        }

        @Override // com.caverock.androidsvg.CSSParser.PseudoClass
        public final boolean matches(SVG.SvgElementBase svgElementBase) {
            int i;
            boolean z = this.isOfType;
            String str = this.nodeName;
            if (z && str == null) {
                str = svgElementBase.getNodeName();
            }
            SVG.SvgContainer svgContainer = svgElementBase.parent;
            if (svgContainer != null) {
                Iterator it = svgContainer.getChildren().iterator();
                i = 0;
                while (it.hasNext()) {
                    SVG.SvgElementBase svgElementBase2 = (SVG.SvgElementBase) ((SVG.SvgObject) it.next());
                    if (str == null || svgElementBase2.getNodeName().equals(str)) {
                        i++;
                    }
                }
            } else {
                i = 1;
            }
            return i == 1;
        }

        public final String toString() {
            return this.isOfType ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m("only-of-type <", this.nodeName, ">") : "only-child";
        }
    }

    public final class PseudoClassRoot implements PseudoClass {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ PseudoClassRoot(int i) {
            this.$r8$classId = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.caverock.androidsvg.CSSParser.PseudoClass
        public final boolean matches(SVG.SvgElementBase svgElementBase) {
            switch (this.$r8$classId) {
                case 0:
                    if (svgElementBase.parent != null) {
                        break;
                    }
                    break;
                case 1:
                    if ((svgElementBase instanceof SVG.SvgContainer) && ((SVG.SvgContainer) svgElementBase).getChildren().size() != 0) {
                        break;
                    }
                    break;
            }
            return false;
        }

        public final String toString() {
            switch (this.$r8$classId) {
                case 0:
                    return "root";
                case 1:
                    return "empty";
                default:
                    return "target";
            }
        }
    }

    public final class Rule {
        public Selector selector;
        public int source;
        public SVG.Style style;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(this.selector));
            sb.append(" {...} (src=");
            int i = this.source;
            sb.append(i != 1 ? i != 2 ? "null" : "RenderOptions" : "Document");
            sb.append(")");
            return sb.toString();
        }
    }

    public final class Selector {
        public ArrayList simpleSelectors = null;
        public int specificity = 0;

        public final void addedAttributeOrPseudo() {
            this.specificity += IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            Iterator it = this.simpleSelectors.iterator();
            while (it.hasNext()) {
                sb.append((SimpleSelector) it.next());
                sb.append(' ');
            }
            sb.append('[');
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.specificity, ']');
        }
    }

    public final class SimpleSelector {
        public final int combinator;
        public final String tag;
        public ArrayList attribs = null;
        public ArrayList pseudos = null;

        public SimpleSelector(int i, String str) {
            this.combinator = 0;
            this.tag = null;
            this.combinator = i == 0 ? 1 : i;
            this.tag = str;
        }

        public final void addAttrib(int i, String str, String str2) {
            if (this.attribs == null) {
                this.attribs = new ArrayList();
            }
            this.attribs.add(new Attrib(str, i, str2));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            int i = this.combinator;
            if (i == 2) {
                sb.append("> ");
            } else if (i == 3) {
                sb.append("+ ");
            }
            String str = this.tag;
            if (str == null) {
                str = Marker.ANY_MARKER;
            }
            sb.append(str);
            ArrayList arrayList = this.attribs;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Attrib attrib = (Attrib) it.next();
                    sb.append('[');
                    String str2 = attrib.name;
                    String str3 = attrib.value;
                    sb.append(str2);
                    int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(attrib.f946operation);
                    if (ordinal == 1) {
                        sb.append('=');
                        sb.append(str3);
                    } else if (ordinal == 2) {
                        sb.append("~=");
                        sb.append(str3);
                    } else if (ordinal == 3) {
                        sb.append("|=");
                        sb.append(str3);
                    }
                    sb.append(']');
                }
            }
            ArrayList arrayList2 = this.pseudos;
            if (arrayList2 != null) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    PseudoClass pseudoClass = (PseudoClass) it2.next();
                    sb.append(':');
                    sb.append(pseudoClass);
                }
            }
            return sb.toString();
        }
    }

    public CSSParser(int i) {
        this.source = i;
    }

    public static int getChildPosition(ArrayList arrayList, int i, SVG.SvgElementBase svgElementBase) {
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        Object obj = arrayList.get(i);
        SVG.SvgContainer svgContainer = svgElementBase.parent;
        if (obj != svgContainer) {
            return -1;
        }
        Iterator it = svgContainer.getChildren().iterator();
        while (it.hasNext()) {
            if (((SVG.SvgObject) it.next()) == svgElementBase) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static ArrayList parseMediaList(CSSTextScanner cSSTextScanner) {
        ArrayList arrayList = new ArrayList();
        while (!cSSTextScanner.empty()) {
            String str = (String) cSSTextScanner.timestamps;
            String str2 = null;
            if (!cSSTextScanner.empty()) {
                int i = cSSTextScanner.first;
                char charAt = str.charAt(i);
                if ((charAt < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z')) {
                    cSSTextScanner.first = i;
                } else {
                    int advanceChar = cSSTextScanner.advanceChar();
                    while (true) {
                        if ((advanceChar < 65 || advanceChar > 90) && (advanceChar < 97 || advanceChar > 122)) {
                            break;
                        }
                        advanceChar = cSSTextScanner.advanceChar();
                    }
                    str2 = str.substring(i, cSSTextScanner.first);
                }
            }
            if (str2 == null) {
                break;
            }
            try {
                arrayList.add(MediaType.valueOf(str2));
            } catch (IllegalArgumentException unused) {
            }
            if (!cSSTextScanner.m1142skipCommaWhitespace()) {
                break;
            }
        }
        return arrayList;
    }

    public static boolean ruleMatch(Selector selector, int i, ArrayList arrayList, int i2, SVG.SvgElementBase svgElementBase) {
        SimpleSelector simpleSelector = (SimpleSelector) selector.simpleSelectors.get(i);
        if (!selectorMatch(simpleSelector, svgElementBase)) {
            return false;
        }
        int i3 = simpleSelector.combinator;
        if (i3 == 1) {
            if (i != 0) {
                while (i2 >= 0) {
                    if (!ruleMatchOnAncestors(selector, i - 1, arrayList, i2)) {
                        i2--;
                    }
                }
                return false;
            }
            return true;
        }
        if (i3 == 2) {
            return ruleMatchOnAncestors(selector, i - 1, arrayList, i2);
        }
        int childPosition = getChildPosition(arrayList, i2, svgElementBase);
        if (childPosition <= 0) {
            return false;
        }
        return ruleMatch(selector, i - 1, arrayList, i2, (SVG.SvgElementBase) svgElementBase.parent.getChildren().get(childPosition - 1));
    }

    public static boolean ruleMatchOnAncestors(Selector selector, int i, ArrayList arrayList, int i2) {
        SimpleSelector simpleSelector = (SimpleSelector) selector.simpleSelectors.get(i);
        SVG.SvgElementBase svgElementBase = (SVG.SvgElementBase) arrayList.get(i2);
        if (!selectorMatch(simpleSelector, svgElementBase)) {
            return false;
        }
        int i3 = simpleSelector.combinator;
        if (i3 == 1) {
            if (i != 0) {
                while (i2 > 0) {
                    i2--;
                    if (ruleMatchOnAncestors(selector, i - 1, arrayList, i2)) {
                    }
                }
                return false;
            }
            return true;
        }
        if (i3 == 2) {
            return ruleMatchOnAncestors(selector, i - 1, arrayList, i2 - 1);
        }
        int childPosition = getChildPosition(arrayList, i2, svgElementBase);
        if (childPosition <= 0) {
            return false;
        }
        return ruleMatch(selector, i - 1, arrayList, i2, (SVG.SvgElementBase) svgElementBase.parent.getChildren().get(childPosition - 1));
    }

    public static boolean selectorMatch(SimpleSelector simpleSelector, SVG.SvgElementBase svgElementBase) {
        ArrayList arrayList;
        String str = simpleSelector.tag;
        if (str != null && !str.equals(svgElementBase.getNodeName().toLowerCase(Locale.US))) {
            return false;
        }
        ArrayList arrayList2 = simpleSelector.attribs;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Attrib attrib = (Attrib) it.next();
                String str2 = attrib.name;
                String str3 = attrib.value;
                if (str2.equals("id")) {
                    if (!str3.equals(svgElementBase.id)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (arrayList = svgElementBase.classNames) == null || !arrayList.contains(str3)) {
                    return false;
                }
            }
        }
        ArrayList arrayList3 = simpleSelector.pseudos;
        if (arrayList3 == null) {
            return true;
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            if (!((PseudoClass) it2.next()).matches(svgElementBase)) {
                return false;
            }
        }
        return true;
    }

    public final void parseAtRule(Ruleset ruleset, CSSTextScanner cSSTextScanner) {
        int intValue;
        char charAt;
        int hexChar;
        String nextIdentifier = cSSTextScanner.nextIdentifier();
        cSSTextScanner.skipWhitespace();
        if (nextIdentifier == null) {
            throw new CSSParseException("Invalid '@' rule");
        }
        int i = 0;
        if (!this.inMediaRule && nextIdentifier.equals("media")) {
            ArrayList parseMediaList = parseMediaList(cSSTextScanner);
            if (!cSSTextScanner.consume('{')) {
                throw new CSSParseException("Invalid @media rule: missing rule set");
            }
            cSSTextScanner.skipWhitespace();
            Iterator it = parseMediaList.iterator();
            while (it.hasNext()) {
                MediaType mediaType = (MediaType) it.next();
                if (mediaType == MediaType.all || mediaType == this.deviceMediaType) {
                    this.inMediaRule = true;
                    ruleset.addAll(parseRuleset(cSSTextScanner));
                    this.inMediaRule = false;
                    break;
                }
            }
            parseRuleset(cSSTextScanner);
            if (!cSSTextScanner.empty() && !cSSTextScanner.consume('}')) {
                throw new CSSParseException("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.inMediaRule || !nextIdentifier.equals("import")) {
            Log.w("CSSParser", "Ignoring @" + nextIdentifier + " rule");
            while (!cSSTextScanner.empty() && ((intValue = cSSTextScanner.nextChar().intValue()) != 59 || i != 0)) {
                if (intValue == 123) {
                    i++;
                } else if (intValue == 125 && i > 0 && i - 1 == 0) {
                    break;
                }
            }
        } else {
            String str = null;
            if (!cSSTextScanner.empty()) {
                int i2 = cSSTextScanner.first;
                if (cSSTextScanner.consume("url(")) {
                    cSSTextScanner.skipWhitespace();
                    String nextCSSString = cSSTextScanner.nextCSSString();
                    if (nextCSSString == null) {
                        String str2 = (String) cSSTextScanner.timestamps;
                        StringBuilder sb = new StringBuilder();
                        while (!cSSTextScanner.empty() && (charAt = str2.charAt(cSSTextScanner.first)) != '\'' && charAt != '\"' && charAt != '(' && charAt != ')' && !TimedValueQueue.isWhitespace(charAt) && !Character.isISOControl((int) charAt)) {
                            cSSTextScanner.first++;
                            if (charAt == '\\') {
                                if (!cSSTextScanner.empty()) {
                                    int i3 = cSSTextScanner.first;
                                    cSSTextScanner.first = i3 + 1;
                                    charAt = str2.charAt(i3);
                                    if (charAt != '\n' && charAt != '\r' && charAt != '\f') {
                                        int hexChar2 = CSSTextScanner.hexChar(charAt);
                                        if (hexChar2 != -1) {
                                            for (int i4 = 1; i4 <= 5 && !cSSTextScanner.empty() && (hexChar = CSSTextScanner.hexChar(str2.charAt(cSSTextScanner.first))) != -1; i4++) {
                                                cSSTextScanner.first++;
                                                hexChar2 = (hexChar2 * 16) + hexChar;
                                            }
                                            sb.append((char) hexChar2);
                                        }
                                    }
                                }
                            }
                            sb.append(charAt);
                        }
                        nextCSSString = sb.length() == 0 ? null : sb.toString();
                    }
                    if (nextCSSString == null) {
                        cSSTextScanner.first = i2;
                    } else {
                        cSSTextScanner.skipWhitespace();
                        if (cSSTextScanner.empty() || cSSTextScanner.consume(")")) {
                            str = nextCSSString;
                        } else {
                            cSSTextScanner.first = i2;
                        }
                    }
                }
            }
            if (str == null) {
                str = cSSTextScanner.nextCSSString();
            }
            if (str == null) {
                throw new CSSParseException("Invalid @import rule: expected string or url()");
            }
            cSSTextScanner.skipWhitespace();
            parseMediaList(cSSTextScanner);
            if (!cSSTextScanner.empty() && !cSSTextScanner.consume(';')) {
                throw new CSSParseException("Invalid @media rule: expected '}' at end of rule set");
            }
        }
        cSSTextScanner.skipWhitespace();
    }

    public final boolean parseRule(Ruleset ruleset, CSSTextScanner cSSTextScanner) {
        ArrayList nextSelectorGroup = cSSTextScanner.nextSelectorGroup();
        if (nextSelectorGroup == null || nextSelectorGroup.isEmpty()) {
            return false;
        }
        if (!cSSTextScanner.consume('{')) {
            throw new CSSParseException("Malformed rule block: expected '{'");
        }
        cSSTextScanner.skipWhitespace();
        SVG.Style style = new SVG.Style();
        do {
            String nextIdentifier = cSSTextScanner.nextIdentifier();
            cSSTextScanner.skipWhitespace();
            if (!cSSTextScanner.consume(':')) {
                throw new CSSParseException("Expected ':'");
            }
            cSSTextScanner.skipWhitespace();
            String str = (String) cSSTextScanner.timestamps;
            String str2 = null;
            if (!cSSTextScanner.empty()) {
                int i = cSSTextScanner.first;
                int charAt = str.charAt(i);
                int i2 = i;
                while (charAt != -1 && charAt != 59 && charAt != 125 && charAt != 33 && charAt != 10 && charAt != 13) {
                    if (!TimedValueQueue.isWhitespace(charAt)) {
                        i2 = cSSTextScanner.first + 1;
                    }
                    charAt = cSSTextScanner.advanceChar();
                }
                if (cSSTextScanner.first > i) {
                    str2 = str.substring(i, i2);
                } else {
                    cSSTextScanner.first = i;
                }
            }
            if (str2 == null) {
                throw new CSSParseException("Expected property value");
            }
            cSSTextScanner.skipWhitespace();
            if (cSSTextScanner.consume('!')) {
                cSSTextScanner.skipWhitespace();
                if (!cSSTextScanner.consume("important")) {
                    throw new CSSParseException("Malformed rule set: found unexpected '!'");
                }
                cSSTextScanner.skipWhitespace();
            }
            cSSTextScanner.consume(';');
            SVGParser.processStyleProperty(style, nextIdentifier, str2);
            cSSTextScanner.skipWhitespace();
            if (cSSTextScanner.empty()) {
                break;
            }
        } while (!cSSTextScanner.consume('}'));
        cSSTextScanner.skipWhitespace();
        Iterator it = nextSelectorGroup.iterator();
        while (it.hasNext()) {
            Selector selector = (Selector) it.next();
            Rule rule = new Rule();
            rule.selector = selector;
            rule.style = style;
            rule.source = this.source;
            ruleset.add(rule);
        }
        return true;
    }

    public final Ruleset parseRuleset(CSSTextScanner cSSTextScanner) {
        Ruleset ruleset = new Ruleset();
        while (!cSSTextScanner.empty()) {
            try {
                if (!cSSTextScanner.consume("<!--") && !cSSTextScanner.consume("-->")) {
                    if (!cSSTextScanner.consume('@')) {
                        if (!parseRule(ruleset, cSSTextScanner)) {
                            break;
                        }
                    } else {
                        parseAtRule(ruleset, cSSTextScanner);
                    }
                }
            } catch (CSSParseException e) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e.getMessage());
                return ruleset;
            }
        }
        return ruleset;
    }

    public final class Ruleset implements Grouping {
        public final /* synthetic */ int $r8$classId;
        public ArrayList rules;

        public Ruleset() {
            this.$r8$classId = 0;
            this.rules = null;
        }

        public void add(Rule rule) {
            if (this.rules == null) {
                this.rules = new ArrayList();
            }
            int i = 0;
            while (true) {
                int size = this.rules.size();
                ArrayList arrayList = this.rules;
                if (i >= size) {
                    arrayList.add(rule);
                    return;
                } else {
                    if (((Rule) arrayList.get(i)).selector.specificity > rule.selector.specificity) {
                        this.rules.add(i, rule);
                        return;
                    }
                    i++;
                }
            }
        }

        public void addAll(Ruleset ruleset) {
            if (ruleset.rules == null) {
                return;
            }
            if (this.rules == null) {
                this.rules = new ArrayList(ruleset.rules.size());
            }
            Iterator it = ruleset.rules.iterator();
            while (it.hasNext()) {
                add((Rule) it.next());
            }
        }

        @Override // kotlin.collections.Grouping
        public String keyOf(Object obj) {
            return (String) obj;
        }

        @Override // kotlin.collections.Grouping
        public Iterator sourceIterator() {
            return this.rules.iterator();
        }

        public String toString() {
            switch (this.$r8$classId) {
                case 0:
                    if (this.rules == null) {
                        return "";
                    }
                    StringBuilder sb = new StringBuilder();
                    Iterator it = this.rules.iterator();
                    while (it.hasNext()) {
                        sb.append(((Rule) it.next()).toString());
                        sb.append('\n');
                    }
                    return sb.toString();
                default:
                    return super.toString();
            }
        }

        public Ruleset(ArrayList arrayList) {
            this.$r8$classId = 1;
            this.rules = arrayList;
        }
    }

    public static boolean ruleMatch(Selector selector, SVG.SvgElementBase svgElementBase) {
        ArrayList arrayList = new ArrayList();
        Object obj = svgElementBase.parent;
        while (true) {
            if (obj == null) {
                break;
            }
            arrayList.add(0, obj);
            obj = ((SVG.SvgObject) obj).parent;
        }
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = selector.simpleSelectors;
        int size2 = arrayList2 == null ? 0 : arrayList2.size();
        ArrayList arrayList3 = selector.simpleSelectors;
        if (size2 == 1) {
            return selectorMatch((SimpleSelector) arrayList3.get(0), svgElementBase);
        }
        return ruleMatch(selector, (arrayList3 != null ? arrayList3.size() : 0) - 1, arrayList, size, svgElementBase);
    }
}
