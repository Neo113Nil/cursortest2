package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.CharacterSetECI;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import com.yandex.fintechsdk.entities.environment.PayEnvironment;
import com.yandex.messaging.domain.user.DeletedShownStatus;
import com.ybsdk.widgets.common.MoneyInputEditView;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCP.tools.LicenseUtility;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;
import ru.CryptoPro.reprov.array.DerValue;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes6.dex */
public abstract class v891 {
    public static final char[] a = {MoneyInputEditView.DEFAULT_VALUE, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', HexString.CHAR_SPACE, '$', '%', '*', '+', LicenseUtility.SEPARATOR, '.', '/', ':'};

    public static void a(wz5 wz5Var, StringBuilder sb, int i, boolean z) {
        while (i > 1) {
            if (wz5Var.a() < 11) {
                throw FormatException.a();
            }
            int b = wz5Var.b(11);
            sb.append(i(b / 45));
            sb.append(i(b % 45));
            i -= 2;
        }
        if (i == 1) {
            if (wz5Var.a() < 6) {
                throw FormatException.a();
            }
            sb.append(i(wz5Var.b(6)));
        }
        if (z) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i2 = length + 1;
                        if (sb.charAt(i2) == '%') {
                            sb.deleteCharAt(i2);
                        }
                    }
                    sb.setCharAt(length, (char) 29);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(wz5 wz5Var, StringBuilder sb, int i, CharacterSetECI characterSetECI, ArrayList arrayList, Map map) {
        Charset forName;
        boolean z;
        boolean z2;
        boolean z3;
        byte b;
        if (i * 8 > wz5Var.a()) {
            throw FormatException.a();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) wz5Var.b(8);
        }
        if (characterSetECI == null) {
            Charset charset = nuu0.b;
            if (map != null) {
                DecodeHintType decodeHintType = DecodeHintType.CHARACTER_SET;
                if (map.containsKey(decodeHintType)) {
                    forName = Charset.forName(map.get(decodeHintType).toString());
                }
            }
            boolean z4 = true;
            if (i <= 2 || !(((b = bArr[0]) == -2 && bArr[1] == -1) || (b == -1 && bArr[1] == -2))) {
                boolean z5 = charset != null;
                boolean z6 = i > 3 && bArr[0] == -17 && bArr[1] == -69 && bArr[2] == -65;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                boolean z7 = z5;
                boolean z8 = true;
                while (i6 < i && (z4 || z7 || z8)) {
                    boolean z9 = z4;
                    byte b2 = bArr[i6];
                    Charset charset2 = charset;
                    int i15 = b2 & 255;
                    if (z8) {
                        if (i7 <= 0) {
                            z = z8;
                            if ((b2 & DerValue.TAG_CONTEXT) != 0) {
                                if ((b2 & DerValue.TAG_APPLICATION) != 0) {
                                    int i16 = i7 + 1;
                                    if ((b2 & BlobHeaderStructure.BLOB_VERSION) == 0) {
                                        i9++;
                                    } else {
                                        i16 = i7 + 2;
                                        if ((b2 & PKIBody._CKUANN) == 0) {
                                            i10++;
                                        } else {
                                            i7 += 3;
                                            if ((b2 & 8) == 0) {
                                                i11++;
                                            }
                                        }
                                    }
                                    i7 = i16;
                                }
                            }
                        } else if ((b2 & DerValue.TAG_CONTEXT) != 0) {
                            i7--;
                            if (z9) {
                                if (i15 > 127 && i15 < 160) {
                                    z2 = false;
                                    if (z7) {
                                        z3 = z2;
                                    } else if (i8 > 0) {
                                        z3 = z2;
                                        if (i15 >= 64 && i15 != 127 && i15 <= 252) {
                                            i8--;
                                        }
                                        z7 = false;
                                    } else {
                                        z3 = z2;
                                        if (i15 != 128 && i15 != 160 && i15 <= 239) {
                                            if (i15 <= 160 || i15 >= 224) {
                                                if (i15 > 127) {
                                                    i8++;
                                                    int i17 = i13 + 1;
                                                    if (i17 > i4) {
                                                        i4 = i17;
                                                        i13 = i4;
                                                    } else {
                                                        i13 = i17;
                                                    }
                                                } else {
                                                    i13 = 0;
                                                }
                                                i14 = 0;
                                            } else {
                                                i5++;
                                                int i18 = i14 + 1;
                                                if (i18 > i2) {
                                                    i2 = i18;
                                                    i14 = i2;
                                                } else {
                                                    i14 = i18;
                                                }
                                                i13 = 0;
                                            }
                                        }
                                        z7 = false;
                                    }
                                    i6++;
                                    z4 = z3;
                                    charset = charset2;
                                } else if (i15 > 159 && (i15 < 192 || i15 == 215 || i15 == 247)) {
                                    i12++;
                                }
                            }
                            z2 = z9;
                            if (z7) {
                            }
                            i6++;
                            z4 = z3;
                            charset = charset2;
                        }
                        z8 = false;
                        if (z9) {
                        }
                        z2 = z9;
                        if (z7) {
                        }
                        i6++;
                        z4 = z3;
                        charset = charset2;
                    } else {
                        z = z8;
                    }
                    z8 = z;
                    if (z9) {
                    }
                    z2 = z9;
                    if (z7) {
                    }
                    i6++;
                    z4 = z3;
                    charset = charset2;
                }
                boolean z10 = z4;
                Charset charset3 = charset;
                boolean z11 = z8;
                boolean z12 = (!z11 || i7 <= 0) ? z11 : false;
                boolean z13 = (!z7 || i8 <= 0) ? z7 : false;
                if (!z12 || (!z6 && i9 + i10 + i11 <= 0)) {
                    if (!z13 || (!nuu0.d && i2 < 3 && i4 < 3)) {
                        if (z10 && z13) {
                            if ((i2 != 2 || i5 != 2) && i12 * 10 < i) {
                                forName = StandardCharsets.ISO_8859_1;
                            }
                        } else if (z10) {
                            forName = StandardCharsets.ISO_8859_1;
                        } else if (!z13) {
                            forName = z12 ? StandardCharsets.UTF_8 : nuu0.a;
                        }
                    }
                    forName = charset3;
                } else {
                    forName = StandardCharsets.UTF_8;
                }
            } else {
                forName = StandardCharsets.UTF_16;
            }
        } else {
            forName = Charset.forName(characterSetECI.name());
        }
        sb.append(new String(bArr, forName));
        arrayList.add(bArr);
    }

    public static void c(wz5 wz5Var, StringBuilder sb, int i) {
        if (nuu0.c == null) {
            throw FormatException.a();
        }
        if (i * 13 > wz5Var.a()) {
            throw FormatException.a();
        }
        byte[] bArr = new byte[i * 2];
        int i2 = 0;
        while (i > 0) {
            int b = wz5Var.b(13);
            int i3 = (b % 96) | ((b / 96) << 8);
            int i4 = i3 + (i3 < 2560 ? 41377 : 42657);
            bArr[i2] = (byte) ((i4 >> 8) & 255);
            bArr[i2 + 1] = (byte) (i4 & 255);
            i2 += 2;
            i--;
        }
        sb.append(new String(bArr, nuu0.c));
    }

    public static void d(wz5 wz5Var, StringBuilder sb, int i) {
        if (nuu0.b == null) {
            throw FormatException.a();
        }
        if (i * 13 > wz5Var.a()) {
            throw FormatException.a();
        }
        byte[] bArr = new byte[i * 2];
        int i2 = 0;
        while (i > 0) {
            int b = wz5Var.b(13);
            int i3 = (b % 192) | ((b / 192) << 8);
            int i4 = i3 + (i3 < 7936 ? 33088 : 49472);
            bArr[i2] = (byte) (i4 >> 8);
            bArr[i2 + 1] = (byte) i4;
            i2 += 2;
            i--;
        }
        sb.append(new String(bArr, nuu0.b));
    }

    public static void e(wz5 wz5Var, StringBuilder sb, int i) {
        while (i >= 3) {
            if (wz5Var.a() < 10) {
                throw FormatException.a();
            }
            int b = wz5Var.b(10);
            if (b >= 1000) {
                throw FormatException.a();
            }
            sb.append(i(b / 100));
            sb.append(i((b / 10) % 10));
            sb.append(i(b % 10));
            i -= 3;
        }
        if (i == 2) {
            if (wz5Var.a() < 7) {
                throw FormatException.a();
            }
            int b2 = wz5Var.b(7);
            if (b2 >= 100) {
                throw FormatException.a();
            }
            sb.append(i(b2 / 10));
            sb.append(i(b2 % 10));
            return;
        }
        if (i == 1) {
            if (wz5Var.a() < 4) {
                throw FormatException.a();
            }
            int b3 = wz5Var.b(4);
            if (b3 >= 10) {
                throw FormatException.a();
            }
            sb.append(i(b3));
        }
    }

    public static final ArrayList f(List list) {
        Object zhj0Var;
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            Object obj2 = (kij0) obj;
            boolean z = i == 0;
            boolean z2 = i == scc.f(list);
            if (obj2 instanceof jij0) {
                obj2 = new jij0(((jij0) obj2).a, z, z2);
            } else if (obj2 instanceof hij0) {
                obj2 = hij0.m((hij0) obj2, null, z, z2, 7);
            } else if (obj2 instanceof vhj0) {
                obj2 = new vhj0(((vhj0) obj2).a, z, z2);
            } else if (obj2 instanceof iij0) {
                iij0 iij0Var = (iij0) obj2;
                obj2 = new iij0(iij0Var.a, iij0Var.b, iij0Var.c, iij0Var.e, iij0Var.d, z, z2);
            } else if (obj2 instanceof aij0) {
                obj2 = aij0.m((aij0) obj2, z, z2);
            } else {
                if (obj2 instanceof xhj0) {
                    xhj0 xhj0Var = (xhj0) obj2;
                    zhj0Var = new xhj0(xhj0Var.a, xhj0Var.b, z, z2);
                } else if (obj2 instanceof dij0) {
                    obj2 = new dij0(((dij0) obj2).a, z, z2);
                } else if (obj2 instanceof whj0) {
                    obj2 = new whj0(((whj0) obj2).a, z, z2);
                } else if (obj2 instanceof bij0) {
                    bij0 bij0Var = (bij0) obj2;
                    zhj0Var = new bij0(bij0Var.a, bij0Var.b, z, z2);
                } else if (obj2 instanceof fij0) {
                    obj2 = new fij0(z, z2);
                } else if (obj2 instanceof zhj0) {
                    zhj0 zhj0Var2 = (zhj0) obj2;
                    zhj0Var = new zhj0(zhj0Var2.a, zhj0Var2.b, z, z2);
                } else if (!(obj2 instanceof yhj0) && !(obj2 instanceof uhj0) && !(obj2 instanceof eij0)) {
                    w511.b();
                    return null;
                }
                obj2 = zhj0Var;
            }
            arrayList.add(obj2);
            i = i2;
        }
        return arrayList;
    }

    public static final void g(ListItemComponent listItemComponent, apj0 apj0Var) {
        listItemComponent.setContentDescription(oyr.q(apj0Var.b, " ", c.G(kyh0.content_description_selected, listItemComponent), " ", apj0Var.c));
    }

    public static final void h(ListItemComponent listItemComponent, int i, float f, float f2, float f3, float f4) {
        int argb;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new RoundRectShape(new float[]{f, f, f2, f2, f3, f3, f4, f4}, null, null));
        shapeDrawable.getPaint().setColor(i);
        if (lhc.c(i) < 0.25d) {
            argb = lhc.b(0.050000012f, i, -1);
        } else {
            int alpha = Color.alpha(i);
            int b = m810.b(Color.red(i) * 0.95f);
            if (b > 255) {
                b = 255;
            }
            int b2 = m810.b(Color.green(i) * 0.95f);
            if (b2 > 255) {
                b2 = 255;
            }
            int b3 = m810.b(Color.blue(i) * 0.95f);
            argb = Color.argb(alpha, b, b2, b3 <= 255 ? b3 : 255);
        }
        listItemComponent.updateBackground(new eg4(new RippleDrawable(ColorStateList.valueOf(argb), shapeDrawable, null)));
    }

    public static char i(int i) {
        if (i < 45) {
            return a[i];
        }
        throw FormatException.a();
    }

    public static final DefaultEnvironment j(PayEnvironment payEnvironment) {
        int i = ys90.a[payEnvironment.ordinal()];
        if (i == 1 || i == 2) {
            return DefaultEnvironment.PRODUCTION;
        }
        if (i == 3) {
            return DefaultEnvironment.TESTING;
        }
        w511.b();
        return null;
    }

    public static final Integer k(DeletedShownStatus deletedShownStatus) {
        int i = hsh.a[deletedShownStatus.ordinal()];
        if (i == 1 || i == 2) {
            return null;
        }
        if (i == 3) {
            return Integer.valueOf(oyh0.deleted_user_in_organization);
        }
        if (i == 4) {
            return Integer.valueOf(oyh0.deleted_account_name);
        }
        w511.b();
        return null;
    }

    public static final String l(String str, String str2) {
        return g8e.p(str, Extension.DOT_CHAR, str2);
    }
}
