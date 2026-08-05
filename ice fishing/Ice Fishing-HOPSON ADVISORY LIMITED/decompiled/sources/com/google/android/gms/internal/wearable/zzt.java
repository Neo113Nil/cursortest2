package com.google.android.gms.internal.wearable;

import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzt {
    public static zzs zza(DataMap dataMap) {
        ArrayList arrayList = new ArrayList();
        zzu zzd = zzad.zzd();
        TreeSet treeSet = new TreeSet(dataMap.keySet());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object obj = dataMap.get(str);
            zzv zzc = zzac.zzc();
            zzc.zza(str);
            zzc.zzb(zzc(arrayList, obj));
            arrayList2.add((zzac) zzc.zzv());
        }
        zzd.zza(arrayList2);
        return new zzs((zzad) zzd.zzv(), arrayList);
    }

    public static DataMap zzb(zzs zzsVar) {
        DataMap dataMap = new DataMap();
        for (zzac zzacVar : zzsVar.zza.zza()) {
            zzd(zzsVar.zzb, dataMap, zzacVar.zza(), zzacVar.zzb());
        }
        return dataMap;
    }

    private static zzab zzc(List list, Object obj) {
        zzw zzb = zzab.zzb();
        zzb.zzb(1);
        if (obj == null) {
            zzb.zzb(14);
            return (zzab) zzb.zzv();
        }
        zzz zzp = zzaa.zzp();
        if (obj instanceof String) {
            zzb.zzb(2);
            zzp.zzb((String) obj);
        } else if (obj instanceof Integer) {
            zzb.zzb(6);
            zzp.zzf(((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            zzb.zzb(5);
            zzp.zze(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzb.zzb(3);
            zzp.zzc(((Double) obj).doubleValue());
        } else if (obj instanceof Float) {
            zzb.zzb(4);
            zzp.zzd(((Float) obj).floatValue());
        } else if (obj instanceof Boolean) {
            zzb.zzb(8);
            zzp.zzh(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            zzb.zzb(7);
            zzp.zzg(((Byte) obj).byteValue());
        } else {
            int i = 0;
            if (obj instanceof byte[]) {
                zzb.zzb(1);
                byte[] bArr = (byte[]) obj;
                zzp.zza(zzcg.zzk(bArr, 0, bArr.length));
            } else if (obj instanceof String[]) {
                zzb.zzb(11);
                zzp.zzk(Arrays.asList((String[]) obj));
            } else if (obj instanceof long[]) {
                zzb.zzb(12);
                long[] jArr = (long[]) obj;
                ArrayList arrayList = new ArrayList(jArr.length);
                while (i < jArr.length) {
                    arrayList.add(Long.valueOf(jArr[i]));
                    i++;
                }
                zzp.zzl(arrayList);
            } else if (obj instanceof float[]) {
                zzb.zzb(15);
                float[] fArr = (float[]) obj;
                ArrayList arrayList2 = new ArrayList(fArr.length);
                while (i < fArr.length) {
                    arrayList2.add(Float.valueOf(fArr[i]));
                    i++;
                }
                zzp.zzm(arrayList2);
            } else if (obj instanceof Asset) {
                zzb.zzb(13);
                list.add((Asset) obj);
                zzp.zzn(list.size() - 1);
            } else if (obj instanceof DataMap) {
                zzb.zzb(9);
                DataMap dataMap = (DataMap) obj;
                TreeSet treeSet = new TreeSet(dataMap.keySet());
                zzac[] zzacVarArr = new zzac[treeSet.size()];
                Iterator it = treeSet.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    zzv zzc = zzac.zzc();
                    zzc.zza(str);
                    zzc.zzb(zzc(list, dataMap.get(str)));
                    zzacVarArr[i] = (zzac) zzc.zzv();
                    i++;
                }
                zzp.zzi(Arrays.asList(zzacVarArr));
            } else {
                if (!(obj instanceof ArrayList)) {
                    String simpleName = obj.getClass().getSimpleName();
                    String.valueOf(simpleName);
                    throw new RuntimeException("newFieldValueFromValue: unexpected value ".concat(String.valueOf(simpleName)));
                }
                zzb.zzb(10);
                ArrayList arrayList3 = (ArrayList) obj;
                int size = arrayList3.size();
                Object obj2 = null;
                int i2 = 14;
                while (i < size) {
                    Object obj3 = arrayList3.get(i);
                    zzab zzc2 = zzc(list, obj3);
                    if (zzc2.zzf() != 14 && zzc2.zzf() != 2 && zzc2.zzf() != 6 && zzc2.zzf() != 9) {
                        String valueOf = String.valueOf(obj3.getClass());
                        String.valueOf(valueOf);
                        throw new IllegalArgumentException("The only ArrayList element types supported by DataBundleUtil are String, Integer, Bundle, and null, but this ArrayList contains a ".concat(String.valueOf(valueOf)));
                    }
                    if (i2 == 14) {
                        if (zzc2.zzf() != 14) {
                            i2 = zzc2.zzf();
                            obj2 = obj3;
                            zzp.zzj(zzc2);
                            i++;
                        } else {
                            i2 = 14;
                        }
                    }
                    if (zzc2.zzf() != i2) {
                        String valueOf2 = String.valueOf(obj2.getClass());
                        String valueOf3 = String.valueOf(obj3.getClass());
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 80 + String.valueOf(valueOf3).length());
                        sb.append("ArrayList elements must all be of the sameclass, but this one contains a ");
                        sb.append(valueOf2);
                        sb.append(" and a ");
                        sb.append(valueOf3);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    zzp.zzj(zzc2);
                    i++;
                }
            }
        }
        zzb.zza(zzp);
        return (zzab) zzb.zzv();
    }

    private static void zzd(List list, DataMap dataMap, String str, zzab zzabVar) {
        int zzf = zzabVar.zzf();
        if (zzf == 14) {
            dataMap.putString(str, null);
            return;
        }
        zzaa zza = zzabVar.zza();
        if (zzf == 1) {
            dataMap.putByteArray(str, zza.zza().zzm());
            return;
        }
        int i = 0;
        if (zzf == 11) {
            dataMap.putStringArray(str, (String[]) zza.zzl().toArray(new String[0]));
            return;
        }
        if (zzf == 12) {
            Object[] array = zza.zzm().toArray();
            int length = array.length;
            long[] jArr = new long[length];
            while (i < length) {
                Object obj = array[i];
                obj.getClass();
                jArr[i] = ((Number) obj).longValue();
                i++;
            }
            dataMap.putLongArray(str, jArr);
            return;
        }
        if (zzf == 15) {
            Object[] array2 = zza.zzn().toArray();
            int length2 = array2.length;
            float[] fArr = new float[length2];
            while (i < length2) {
                Object obj2 = array2[i];
                obj2.getClass();
                fArr[i] = ((Number) obj2).floatValue();
                i++;
            }
            dataMap.putFloatArray(str, fArr);
            return;
        }
        if (zzf == 2) {
            dataMap.putString(str, zza.zzb());
            return;
        }
        if (zzf == 3) {
            dataMap.putDouble(str, zza.zzc());
            return;
        }
        if (zzf == 4) {
            dataMap.putFloat(str, zza.zzd());
            return;
        }
        if (zzf == 5) {
            dataMap.putLong(str, zza.zze());
            return;
        }
        if (zzf == 6) {
            dataMap.putInt(str, zza.zzf());
            return;
        }
        if (zzf == 7) {
            dataMap.putByte(str, (byte) zza.zzg());
            return;
        }
        if (zzf == 8) {
            dataMap.putBoolean(str, zza.zzh());
            return;
        }
        if (zzf == 13) {
            dataMap.putAsset(str, (Asset) list.get((int) zza.zzo()));
            return;
        }
        if (zzf == 9) {
            DataMap dataMap2 = new DataMap();
            for (zzac zzacVar : zza.zzi()) {
                try {
                    zzd(list, dataMap2, zzacVar.zza(), zzacVar.zzb());
                } catch (RuntimeException e) {
                    String.valueOf(str);
                    throw new RuntimeException("DataBundle parse error for: ".concat(String.valueOf(str)), e);
                }
            }
            dataMap.putDataMap(str, dataMap2);
            return;
        }
        if (zzf != 10) {
            throw new RuntimeException("populateBundle: unexpected type ".concat(Integer.toString(zzf)));
        }
        do {
            int i2 = 14;
            for (zzab zzabVar2 : zza.zzj()) {
                if (i2 != 14) {
                    if (zzabVar2.zzf() != i2) {
                        String num = Integer.toString(i2);
                        String num2 = Integer.toString(zzabVar2.zzf());
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 99 + num.length() + 5 + num2.length());
                        sb.append("The ArrayList elements should all be the same type, but ArrayList with key ");
                        sb.append(str);
                        sb.append(" contains items of type ");
                        sb.append(num);
                        sb.append(" and ");
                        sb.append(num2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else if (zzabVar2.zzf() == 9 || zzabVar2.zzf() == 2 || zzabVar2.zzf() == 6) {
                    i2 = zzabVar2.zzf();
                }
            }
            ArrayList<Integer> arrayList = new ArrayList<>(zza.zzk());
            for (zzab zzabVar3 : zza.zzj()) {
                if (zzabVar3.zzf() == 14) {
                    arrayList.add(null);
                } else if (i2 == 9) {
                    DataMap dataMap3 = new DataMap();
                    for (zzac zzacVar2 : zzabVar3.zza().zzi()) {
                        zzd(list, dataMap3, zzacVar2.zza(), zzacVar2.zzb());
                    }
                    arrayList.add(dataMap3);
                } else if (i2 == 2) {
                    arrayList.add(zzabVar3.zza().zzb());
                } else {
                    if (i2 != 6) {
                        throw new IllegalArgumentException("Unexpected typeOfArrayList: ".concat(Integer.toString(i2)));
                    }
                    arrayList.add(Integer.valueOf(zzabVar3.zza().zzf()));
                }
            }
            if (i2 == 14) {
                dataMap.putStringArrayList(str, arrayList);
                return;
            }
            if (i2 == 9) {
                dataMap.putDataMapArrayList(str, arrayList);
                return;
            } else if (i2 == 2) {
                dataMap.putStringArrayList(str, arrayList);
                return;
            } else {
                if (i2 != 6) {
                    throw new IllegalStateException("Unexpected typeOfArrayList: ".concat(Integer.toString(i2)));
                }
                dataMap.putIntegerArrayList(str, arrayList);
                return;
            }
        } while (zzabVar2.zzf() == 14);
        String num3 = Integer.toString(zzabVar2.zzf());
        StringBuilder sb2 = new StringBuilder(num3.length() + 37 + String.valueOf(str).length());
        sb2.append("Unexpected TypedValue type: ");
        sb2.append(num3);
        sb2.append(" for key ");
        sb2.append(str);
        throw new IllegalArgumentException(sb2.toString());
    }
}
