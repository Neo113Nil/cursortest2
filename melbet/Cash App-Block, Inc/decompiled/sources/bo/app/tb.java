package bo.app;

import com.braze.enums.BrazeDateFormat;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import java.util.Date;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class tb implements f9 {
    public static final String e = BrazeLogger.getBrazeLogTag((Class<?>) tb.class);
    public final ub a;
    public final String b;
    public final int c;
    public final Object d;

    public tb(JSONObject jSONObject) {
        ub ubVar = (ub) JsonUtils.optEnum(jSONObject, "property_type", ub.class, ub.UNKNOWN);
        String string2 = jSONObject.getString("property_key");
        int i = jSONObject.getInt("comparator");
        this.a = ubVar;
        this.b = string2;
        this.c = i;
        if (jSONObject.has("property_value")) {
            if (ubVar.equals(ub.STRING)) {
                this.d = jSONObject.getString("property_value");
                return;
            }
            if (ubVar.equals(ub.BOOLEAN)) {
                this.d = Boolean.valueOf(jSONObject.getBoolean("property_value"));
            } else if (ubVar.equals(ub.NUMBER)) {
                this.d = Double.valueOf(jSONObject.getDouble("property_value"));
            } else if (ubVar.equals(ub.DATE)) {
                this.d = Long.valueOf(jSONObject.getLong("property_value"));
            }
        }
    }

    @Override // bo.app.f9
    public final boolean a(v9 v9Var) {
        Object opt;
        if (!(v9Var instanceof w9)) {
            return false;
        }
        BrazeProperties brazeProperties = ((ig) ((w9) v9Var)).e;
        Date date = null;
        if (brazeProperties != null) {
            try {
                opt = brazeProperties.getJsonObject().opt(this.b);
            } catch (Exception e2) {
                BrazeLogger.e(e, "Caught exception checking property filter condition.", e2);
                return false;
            }
        } else {
            opt = null;
        }
        int i = this.c;
        if (opt == null) {
            return i == 12 || i == 17 || i == 2;
        }
        if (i == 11) {
            return true;
        }
        if (i == 12) {
            return false;
        }
        int ordinal = this.a.ordinal();
        if (ordinal == 0) {
            return a(opt);
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                if (!(opt instanceof Integer) && !(opt instanceof Double)) {
                    return this.c == 2;
                }
                double doubleValue = ((Number) opt).doubleValue();
                double doubleValue2 = ((Number) this.d).doubleValue();
                int i2 = this.c;
                return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 == 5 && doubleValue < doubleValue2 : doubleValue > doubleValue2 : doubleValue != doubleValue2 : doubleValue == doubleValue2;
            }
            if (ordinal != 3) {
                return false;
            }
            boolean z = opt instanceof Boolean;
            int i3 = this.c;
            if (!z) {
                return i3 == 2;
            }
            if (i3 == 1) {
                return opt.equals(this.d);
            }
            if (i3 != 2) {
                return false;
            }
            return !opt.equals(this.d);
        }
        long j = ((gg) v9Var).a;
        if (opt instanceof String) {
            try {
                date = DateTimeUtils.parseDate((String) opt, BrazeDateFormat.LONG);
            } catch (Exception e3) {
                BrazeLogger.e(e, "Caught exception trying to parse date in compareTimestamps", e3);
            }
        }
        if (date != null) {
            long timeFromEpochInSeconds = DateTimeUtils.getTimeFromEpochInSeconds(date);
            long longValue = ((Number) this.d).longValue();
            int i4 = this.c;
            if (i4 != 15) {
                if (i4 != 16) {
                    switch (i4) {
                        case 1:
                            if (timeFromEpochInSeconds != longValue) {
                                return false;
                            }
                            break;
                        case 2:
                            if (timeFromEpochInSeconds == longValue) {
                                return false;
                            }
                            break;
                        case 3:
                            if (timeFromEpochInSeconds <= longValue) {
                                return false;
                            }
                            break;
                        case 4:
                            if (timeFromEpochInSeconds < j - longValue) {
                                return false;
                            }
                            break;
                        case 5:
                            if (timeFromEpochInSeconds >= longValue) {
                                return false;
                            }
                            break;
                        case 6:
                            if (timeFromEpochInSeconds > j - longValue) {
                                return false;
                            }
                            break;
                        default:
                            return false;
                    }
                } else if (timeFromEpochInSeconds <= j + longValue) {
                    return false;
                }
            } else if (timeFromEpochInSeconds >= j + longValue) {
                return false;
            }
        } else if (this.c != 2) {
            return false;
        }
        return true;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getJsonObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.a.equals(ub.UNKNOWN)) {
                jSONObject.put("property_type", this.a.toString());
            }
            jSONObject.put("property_key", this.b);
            jSONObject.put("comparator", this.c);
            jSONObject.put("property_value", this.d);
            return jSONObject;
        } catch (JSONException e2) {
            BrazeLogger.e(e, "Caught exception creating property filter Json.", e2);
            return jSONObject;
        }
    }

    public final boolean a(Object obj) {
        boolean z = obj instanceof String;
        int i = this.c;
        if (!z) {
            return i == 2 || i == 17;
        }
        if (i == 1) {
            return obj.equals(this.d);
        }
        if (i == 2) {
            return !obj.equals(this.d);
        }
        if (i == 10) {
            return Pattern.compile((String) this.d, 2).matcher((String) obj).find();
        }
        if (i != 17) {
            return false;
        }
        return !Pattern.compile((String) this.d, 2).matcher((String) obj).find();
    }
}
